package com.wenable.complete.testcoroutines

import io.mockk.MockKAnnotations
import io.mockk.clearAllMocks
import io.mockk.coVerify
import io.mockk.every
import io.mockk.impl.annotations.MockK
import org.junit.After
import org.junit.Before
import org.junit.Test


class BasicTestTest {

    @MockK
    lateinit var calculator: BasicTest

    @Before
    fun setup() {
        MockKAnnotations.init(this)
    }

    @After
    fun tearDown() {
        clearAllMocks()
    }


    @Test
    fun `verify that performAddition is called with any`()  {

        // Given

        every { calculator.execute(any(), any()) } answers   {
            val a = args[0] as Int
            val b = args[1] as Int
            calculator.performAddition(a, b)
        }

        every { calculator.performAddition(any(), any()) } returns 5

        // When
        calculator.execute(2, 3)

        // Then
        coVerify { calculator.performAddition(2, 3) }
    }

    @Test
    fun `verify that performAddition is called with specified values`()  {

        // Given
        val a = 5
        val b = 10

        every { calculator.execute(a, b) } answers   {
            calculator.performAddition(a, b)
        }

        every { calculator.performAddition(a, b) } returns 15

        // When
        calculator.execute(a, b)

        // Then
        coVerify { calculator.performAddition(a, b) }
    }

}