package com.example.coroutinesandroid

import kotlinx.coroutines.runBlocking
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    private val coroutineObj = ExampleCoroutine()

    @Test
    fun test_exampleTimeout() = runBlocking {
        val result = coroutineObj.exampleTimeout(1000L)
        assert(result == "(・∀・)")

        val timeout = coroutineObj.exampleTimeout(100L, 150L)
        assert(timeout.isNullOrBlank())
    }
}