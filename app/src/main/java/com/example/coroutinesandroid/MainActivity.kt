package com.example.coroutinesandroid

import android.os.Bundle
import kotlinx.coroutines.*

class MainActivity : ScopedAppActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setup()
    }

    private fun setup() {
        launch {
            val deferred = async(Dispatchers.IO) {
                Thread.sleep(3000)
                "(・∀・)"
            }
            println(deferred.await())
            val main = withContext(Dispatchers.Main) {
                "(・A・)"
            }
            println(main)
        }
    }
}