package com.zzc.todayweather.logic.network

import com.zzc.todayweather.TodayWeatherApplication
import com.zzc.todayweather.logic.model.DailResponse
import com.zzc.todayweather.logic.model.RealtimeResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 用于访问天气信息 API
*/
interface WeatherService {
    @GET("v2.5/${TodayWeatherApplication.TOKEN}/{lng},{lat}/realtime.json")
    fun getRealtimeWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<RealtimeResponse>

    @GET("v2.5/${TodayWeatherApplication.TOKEN}/{lng},{lat}/daily.json")
    fun getDailyWeather(@Path("lng") lng: String, @Path("lat") lat: String): Call<DailResponse>
}