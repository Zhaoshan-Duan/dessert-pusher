package com.example.android.dessertpusher

import android.app.Application
import timber.log.Timber

// be cautious when adding code to this class since this is global
class PusherApplication: Application() {

    override fun onCreate() {
        super.onCreate()
        // set up timber
        Timber.plant(Timber.DebugTree())
    }
}