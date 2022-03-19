package com.example.myass

import retrofit2.Call
import retrofit2.http.GET

interface AppService {
    @GET("/posts")
    fun getPosts(): Call<MutableList<PostModel>>

}