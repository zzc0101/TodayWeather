package com.zzc.todayweather.logic.network

import com.zzc.todayweather.TodayWeatherApplication
import com.zzc.todayweather.logic.model.PlaceResponse
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 定义访问 API 的 Retrofit 接口
*/
interface PlaceService {
    @GET("v2/place?token=${TodayWeatherApplication.TOKEN}&lang=zh_CN")
    fun searchPlaces(@Query("query") query: String): Call<PlaceResponse>
}