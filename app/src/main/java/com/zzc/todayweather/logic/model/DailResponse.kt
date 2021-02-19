package com.zzc.todayweather.logic.model

import android.content.SyncRequest
import android.nfc.tech.MifareUltralight
import com.google.gson.annotations.SerializedName
import java.util.*

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 定义返回的天气数据模型
*/
data class DailResponse(val status: String, val result: Result) {
    data class Result(val daily: Daily)

    data class Daily(val temperature: List<Temperature>, val skycon: List<Skycon>, @SerializedName("life_index") val lifeIndex: LifeIndex)

    data class Temperature(val max: Float, val min: Float)

    data class Skycon(val value: String, val date: Date)

    data class LifeIndex(val coldRisk: List<LifeDescription>, val carWashing: List<LifeDescription>, val ultraviolet: List<LifeDescription>, val dressing: List<LifeDescription>)

    data class LifeDescription(val desc: String)
}
