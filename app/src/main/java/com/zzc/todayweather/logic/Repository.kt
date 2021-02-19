package com.zzc.todayweather.logic

import androidx.lifecycle.liveData
import com.zzc.todayweather.logic.model.Place
import com.zzc.todayweather.logic.network.TodayWeatherNetwork
import kotlinx.coroutines.Dispatchers
import java.lang.Exception

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function:
*/
object Repository {
    fun searchPlaces(query: String) = liveData(Dispatchers.IO) {
        val result = try {
            val placeResponse = TodayWeatherNetwork.searchPlaces(query)
            if (placeResponse.status == "ok") {
                val places = placeResponse.places
                Result.success(places)
            } else {
                Result.failure(RuntimeException("response status is ${placeResponse.status}"))
            }
        } catch (e: Exception) {
            Result.failure<List<Place>>(e)
        }
        emit(result)
    }
}