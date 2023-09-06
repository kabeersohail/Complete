package com.wenable.complete

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    private var _name: MutableLiveData<String> = MutableLiveData("Remote Configuration of Certificate Authenticated WIFI")
    var name: LiveData<String> = _name
    var x: Int = 0

    fun change() {
        x++
        _name.value = x.toString()
    }

    fun changed(text: String) {
        Log.d("##@$%@%@", text)
    }

}