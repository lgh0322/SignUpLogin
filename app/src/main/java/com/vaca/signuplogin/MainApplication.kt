package com.vaca.signuplogin

import android.app.Application
import com.vaca.signuplogin.server.BigBoy.mSocket

class MainApplication :Application(){
    companion object {
        lateinit var application: Application
    }
    override fun onCreate() {
        super.onCreate()
        application = this
        mSocket.connect();
    }
}