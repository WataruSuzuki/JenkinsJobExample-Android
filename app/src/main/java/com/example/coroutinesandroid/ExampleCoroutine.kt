package com.example.coroutinesandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.*
import kotlinx.coroutines.NonCancellable.cancel

class ExampleCoroutine {

    suspend fun example(): String = withContext(Dispatchers.IO) {
        val io = withContext(Dispatchers.IO) {
            "Dispatchers.IO"
        }
        println(io)
        val main = withContext(Dispatchers.Main) {
            "Dispatchers.Main"
        }
        println(main)
        val deferred = async(Dispatchers.IO) {
            Thread.sleep(3000)
            "async after sleep 3000 msec"
        }
        println(deferred.await())

        return@withContext "(・∀・)"
    }

}