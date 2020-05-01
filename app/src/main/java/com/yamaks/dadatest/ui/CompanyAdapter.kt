package com.yamaks.dadatest.ui

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.yamaks.dadatest.databinding.TileBinding

class CompanyAdapter : ListAdapter<CompanyUiModel, CompanyAdapter.ViewHolder>(CompanyDiffCallback()) {

    init {
        setHasStableIds(true)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(
            TileBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        )
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun getItemId(position: Int): Long {
        return getItem(position).inn.hashCode().toLong()
    }

    class ViewHolder(
        private val binding: TileBinding
    ) : RecyclerView.ViewHolder(binding.root) {

        fun bind(company: CompanyUiModel) {
            binding.company = company
            binding.executePendingBindings()
        }
    }
}

private class CompanyDiffCallback : DiffUtil.ItemCallback<CompanyUiModel>() {

    override fun areItemsTheSame(oldItem: CompanyUiModel, newItem: CompanyUiModel): Boolean {
        return oldItem.inn == newItem.inn
    }

    @SuppressLint("DiffUtilEquals")
    override fun areContentsTheSame(oldItem: CompanyUiModel, newItem: CompanyUiModel): Boolean {
        return oldItem.inn == newItem.inn
    }

}