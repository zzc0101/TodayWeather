package com.zzc.todayweather.logic.model

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 将 Realtime 和 Daily 对象封装起来
*/
data class Weather(val realtime: RealtimeResponse.Realtime, val daily: DailResponse.Daily)
