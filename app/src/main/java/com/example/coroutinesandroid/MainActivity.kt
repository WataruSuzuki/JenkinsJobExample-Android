package com.example.coroutinesandroid

import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : ScopedAppActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        launch {
            setup()
        }
    }

    private suspend fun setup() {
        val io = withContext(Dispatchers.IO) {
            "(・∀・)"
        }
        println(io)
        val main = withContext(Dispatchers.Main) {
            "(・A・)"
        }
        println(main)
        val deferred = async(Dispatchers.IO) {
            Thread.sleep(3000)
            "(・∀・)"
        }
        println(deferred.await())
    }
}