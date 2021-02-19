package com.zzc.todayweather.ui.place

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import com.zzc.todayweather.logic.Repository
import com.zzc.todayweather.logic.model.Place

/*
* @author:zzc
* time:2021/2/19
* tools:Android Studio
* function: 定义 ViewModel 层
*/
class PlaceViewModel : ViewModel() {
    private val searchLiveData = MutableLiveData<String>()

    val placeList = ArrayList<Place>()

    val placeLiveData = Transformations.switchMap(searchLiveData) {query ->
        Repository.searchPlaces(query)
    }

    fun searchPlaces(query: String) {
        searchLiveData.value = query
    }

    fun savePlace(place: Place) = Repository.savePlace(place)

    fun getSavedPlace() = Repository.getSavePlace()

    fun isPlaceSaved() = Repository.isPlaceSaved()

}