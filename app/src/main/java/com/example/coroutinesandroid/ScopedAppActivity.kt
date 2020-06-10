package com.example.coroutinesandroid

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.InternalCoroutinesApi
import kotlinx.coroutines.MainScope
import kotlinx.coroutines.NonCancellable.cancel

abstract class ScopedAppActivity: AppCompatActivity(), CoroutineScope by MainScope() {

    @InternalCoroutinesApi
    override fun onDestroy() {
        super.onDestroy()
        cancel()
    }
}