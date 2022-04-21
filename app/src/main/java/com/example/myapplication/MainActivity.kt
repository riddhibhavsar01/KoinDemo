package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

import org.koin.android.ext.android.inject


class MainActivity : AppCompatActivity() {
    private val student :Student? by inject()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.e("tag","tag"+student?.doWork())
    }
}