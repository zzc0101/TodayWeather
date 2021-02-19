package com.zzc.todayweather.logic.model

import com.google.gson.annotations.SerializedName

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 定义实时天气数据模型
*/
data class RealtimeResponse(val status: String, val result: Result) {
    data class Result(val realtime: Realtime)

    data class Realtime(val skycon: String, val temperature: Float, @SerializedName("air_quality") val airQuality: AirQuality)

    data class AirQuality(val aqi: AQI)

    data class AQI(val chn: Float)
}