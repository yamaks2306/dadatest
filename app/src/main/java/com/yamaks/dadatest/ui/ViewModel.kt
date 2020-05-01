package com.yamaks.dadatest.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData
import androidx.lifecycle.map
import com.yamaks.dadatest.rest.MainRepository
import com.yamaks.dadatest.rest.SuggestionsItem
import com.yamaks.dadatest.utils.Resource
import kotlinx.coroutines.Dispatchers

class MainViewModel(private val mainRepository: MainRepository) : ViewModel() {

    fun getCompanies(query: String) = liveData(Dispatchers.IO) {
        emit(Resource.loading(data = null))
        try {
            emit(Resource.success(data = mainRepository.getCompanies(query)))
        } catch (exception: Exception) {
            emit(Resource.error(data = null, message = exception.message ?: "Error Occurred!"))
        }
    }

    fun dataToUiModel(list: List<SuggestionsItem>): List<CompanyUiModel> {
        return list.map {
            it.toCompanyUiModel()
        }
    }

    private fun SuggestionsItem.toCompanyUiModel(): CompanyUiModel = CompanyUiModel(
        data?.name?.shortWithOpf.toString(),
        data?.address?.value.toString(),
        data?.inn.toString()
    )
}