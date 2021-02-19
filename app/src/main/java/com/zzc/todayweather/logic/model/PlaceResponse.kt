package com.zzc.todayweather.logic.model

import com.google.gson.annotations.SerializedName

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 定义数据模型
*/
data class PlaceResponse(val status: String, val places: List<Place>)

data class Place(val name: String, val location: Location, @SerializedName("formatted_address") val address: String)

data class Location(val lng: String, val lat: String)