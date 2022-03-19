package com.example.myass

import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.AbstractExecutorService

object DataRetrieve {
    private val Client = OkHttpClient.Builder().build()

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://jsonplaceholder.typicode.com")
        .addConverterFactory(GsonConverterFactory.create())
        .client(Client)
        .build()

    fun <T> buildService(service: Class<T>):T{
        return retrofit.create(service)
    }

}