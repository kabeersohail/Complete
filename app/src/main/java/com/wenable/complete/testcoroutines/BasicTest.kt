package com.wenable.complete.testcoroutines

class BasicTest {

    fun execute(a: Int, b: Int): Int {
        return performAddition(a, b)
    }

    fun performAddition(a: Int, b: Int): Int {
        return a + b
    }

}
