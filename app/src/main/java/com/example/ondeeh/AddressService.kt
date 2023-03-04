package com.example.ondeeh

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface AddressService {
    @GET("/ws/{cep}/json")
    fun search(@Path("cep") cep: String): Call<Address>
}