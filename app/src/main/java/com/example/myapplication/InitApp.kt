package com.example.myapplication

import android.app.Application
import org.koin.android.ext.koin.androidContext

import org.koin.core.context.startKoin
import org.koin.ksp.generated.module


class InitApp : Application() {

    override fun onCreate() {
        super.onCreate()


        startKoin {
            androidContext(this@InitApp)
                modules(AppModule().module)
        }
    }
}

