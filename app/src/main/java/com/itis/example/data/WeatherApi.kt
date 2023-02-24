package com.itis.example.data

import com.itis.example.data.response.WeatherResponse
import retrofit2.http.GET
import retrofit2.http.Query
import retrofit2.http.QueryMap

interface WeatherApi {

    @GET("weather")
    suspend fun getWeather(
        @Query("q") city: String,
    ): WeatherResponse

    @GET("weather")
    suspend fun getWeather(
        @QueryMap map: Map<String, Any>
    ): WeatherResponse

    @GET("weather")
    suspend fun getWeather(
        @Query("id") cityId: Int,
    ): WeatherResponse
}
