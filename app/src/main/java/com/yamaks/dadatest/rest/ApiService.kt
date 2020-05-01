package com.yamaks.dadatest.rest

import com.google.gson.Gson
import com.google.gson.GsonBuilder
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Body
import retrofit2.http.Header
import retrofit2.http.POST

data class RequestBody(
    val query: String,
    val count: Int?
)

interface ApiService {
    @POST("party/")
    suspend fun getCompanies(@Header("Authorization") authorization: String,
                             @Header("Accept") accept: String,
                             @Header("Content-Type") content_type: String,
                             @Body query: RequestBody
    ): Companies
}

class ApiHelper(private val apiService: ApiService) {

    suspend fun getCompanies(query: String) = apiService.getCompanies(
        authorization,
        accept,
        content_type,
        RequestBody(query, 10)
    )

    companion object {
        private const val authorization  = "Token"
        private const val accept = "application/json"
        private const val content_type = "application/json"
    }
}

object RetrofitBuilder {

    private const val BASE_URL = "https://suggestions.dadata.ru/suggestions/api/4_1/rs/suggest/"

    private val gson: Gson = GsonBuilder()
        .setLenient()
        .create()

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .build() //Doesn't require the adapter
    }

    val apiService: ApiService = getRetrofit()
        .create(
            ApiService::class.java)
}

class MainRepository(private val apiHelper: ApiHelper) {

    suspend fun getCompanies(query: String) = apiHelper.getCompanies(query)
}
