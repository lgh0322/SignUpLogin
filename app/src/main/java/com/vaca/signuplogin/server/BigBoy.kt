package com.vaca.signuplogin.server

import io.socket.client.IO

object BigBoy {
    val mSocket= IO.socket("http://192.168.5.100:3000")
}