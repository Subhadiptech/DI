package com.ersubhadip.di

import android.util.Log
import javax.inject.Inject


class Repositories @Inject constructor() {

    fun saveDB(name: String, email: String) {
        Log.d("MY_APPLICATION", "Saved Successfully")
    }
}