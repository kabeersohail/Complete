package com.wenable.complete

import android.util.Log
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {

    var name: String = "Remote Configuration of Certificate Authenticated WIFI"

    fun setNameX(name: String) {
        this.name = name
        Log.d("@@@##$%", name)
    }

}