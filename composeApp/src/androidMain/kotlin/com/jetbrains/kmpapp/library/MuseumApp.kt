package com.jetbrains.kmpapp.library

import android.app.Application
import com.jetbrains.kmpapp.di.initKoin

class MuseumApp : Application() {
  override fun onCreate() {
    super.onCreate()
    initKoin()
  }
}
