package com.example.optimusprime.util

import kotlin.math.sqrt

object PrimeNumberUtil {

    fun isPrime(num: Int): Boolean {
        if (num <= 1) {
            return false
        }
        var i = 2
        while (i <= sqrt(num.toDouble())) {
            if (num % i == 0) {
                return false
            }
            i++
        }
        return true
    }
}