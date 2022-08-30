package com.example.optimusprime.util

import junit.framework.Assert.assertEquals
import org.junit.Test

class PrimeNumberUtilTest {
    @Test
    fun testIsPrime() {
        assertEquals(true, PrimeNumberUtil.isPrime(2))
        assertEquals(true, PrimeNumberUtil.isPrime(3))
        assertEquals(false, PrimeNumberUtil.isPrime(4))
        assertEquals(true, PrimeNumberUtil.isPrime(5))
        assertEquals(true, PrimeNumberUtil.isPrime(13))
        assertEquals(false, PrimeNumberUtil.isPrime(169))
        assertEquals(true, PrimeNumberUtil.isPrime(2147483647))
    }
}