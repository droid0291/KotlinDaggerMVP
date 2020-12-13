package com.droid.android.imageloadermvp

import android.app.Application
import com.droid.android.imageloadermvp.di.DaggerAppComponent

class ImageLoaderApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        DaggerAppComponent.builder().application(this).build()
    }
}