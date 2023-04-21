package com.example.mellychatbot.data.remote

import retrofit2.http.GET
import retrofit2.http.Headers

interface ChatGptApi {

    @Headers("Authorization: Bearer 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")
    @GET("v1/models")
    suspend fun getModelList():
}