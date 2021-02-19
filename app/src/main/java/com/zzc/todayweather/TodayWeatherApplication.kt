package com.zzc.todayweather

import android.annotation.SuppressLint
import android.app.Application
import android.content.Context

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 获取全局的 Context
*/
class TodayWeatherApplication: Application() {
    companion object {
        const val TOKEN = "HBT6l1QIEF9rTCOm"
        @SuppressLint("StaticFieldLeak")
        lateinit var context: Context
    }

    override fun onCreate() {
        super.onCreate()
        context = applicationContext
    }
}