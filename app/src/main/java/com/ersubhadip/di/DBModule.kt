package com.ersubhadip.di

import android.util.Log
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import javax.inject.Inject

@InstallIn
@Module
class DBModule @Inject constructor() {


    @Provides
    fun saveMyData() {
        Log.d("MY_APPLICATION", "SAVED MY DATA")
    }
}