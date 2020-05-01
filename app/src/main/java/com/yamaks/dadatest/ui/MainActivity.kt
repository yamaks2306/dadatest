package com.yamaks.dadatest.ui

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.yamaks.dadatest.R
import com.yamaks.dadatest.databinding.ActivityMainBinding
import com.yamaks.dadatest.rest.ApiHelper
import com.yamaks.dadatest.rest.RetrofitBuilder
import com.yamaks.dadatest.rest.SuggestionsItem
import com.yamaks.dadatest.utils.Status

class MainActivity : AppCompatActivity() {

    private lateinit var viewModel: MainViewModel
    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: CompanyAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        viewModel = ViewModelProviders.of(
            this,
            ViewModelFactory(ApiHelper(RetrofitBuilder.apiService))
        ).get(MainViewModel::class.java)

        adapter = CompanyAdapter()

        binding.companiesRv.adapter = adapter

        val query = binding.queryText.text.toString()

        val button = binding.buttonFind

        button.setOnClickListener {
            findCompanies(query)
        }

    }



    private fun findCompanies(query: String) {
        viewModel.getCompanies(query ).observe(this, Observer {
            it?.let { resource ->
                when (resource.status) {
                    Status.SUCCESS -> {
                        binding.companiesRv.visibility = View.VISIBLE
                        binding.progressBar.visibility = View.GONE
                        resource.data?.let { companies ->
                            retrieveList(companies.suggestions) }
                    }
                    Status.ERROR -> {
                        binding.companiesRv.visibility = View.VISIBLE
                        binding.progressBar.visibility = View.GONE
                        Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                    }
                    Status.LOADING -> {
                        binding.progressBar.visibility = View.VISIBLE
                        binding.companiesRv.visibility = View.GONE
                    }
                }
            }
        })
    }

    private fun retrieveList(companies: List<SuggestionsItem?>?) {
        if (companies != null) {
            val list = viewModel.dataToUiModel(companies as List<SuggestionsItem>)
            adapter.submitList(list)
        }
    }
}
