package com.example.myapplication2

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.GET

interface WeatherApi {
    @GET("v1_0/weatherFunction/")
    fun getWeather(): Call<WeatherData>
}