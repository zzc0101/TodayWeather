package com.zzc.todayweather.logic.dao

import android.content.Context
import androidx.core.content.edit
import com.google.gson.Gson
import com.zzc.todayweather.TodayWeatherApplication
import com.zzc.todayweather.WeatherActivity
import com.zzc.todayweather.logic.model.Place

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function:
*/
object PlaceDao {
    fun savePlace(place: Place) {
        sharedPreferences().edit {
            putString("place", Gson().toJson(place))
        }
    }

    fun getSavedPlace(): Place {
        val placeJson = sharedPreferences().getString("place", "")
        return Gson().fromJson(placeJson, Place::class.java)
    }

    fun isPlaceSaved() = sharedPreferences().contains("place")

    private fun sharedPreferences() = TodayWeatherApplication.context.getSharedPreferences("today_weather", Context.MODE_PRIVATE)

}