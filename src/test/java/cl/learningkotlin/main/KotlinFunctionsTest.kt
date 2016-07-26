package cl.learningkotlin.main

import org.junit.Assert
import org.junit.Test
import org.hamcrest.core.*

class KotlinFunctionsTest {
    @Test
    fun itShouldAdd2Integers() {
        val kt = KotlinFunctions()
        Assert.assertThat("It should be 9", kt.sum(4, 5), IsEqual.equalTo(9))
    }

    @Test
    fun itShouldAdd2IntegersUsingDefaultValues() {
        val kt = KotlinFunctions()
        Assert.assertThat(kt.sum(), IsEqual.equalTo(10))
    }

    @Test
    fun itShouldReturn42UsingFunctionReturningConstant() {
        val kt = KotlinFunctions()
        Assert.assertThat(kt.theConstantValue(), IsEqual.equalTo(42))
    }

    @Test
    fun itShouldReturnStringWithParameterUsingRawString() {
        val kt = KotlinFunctions()
        val stringParam = "Test"
        val stringExpected = """
            Testing the new raw string
            type of kotlin. This string contains the
            parameter: ${stringParam.toUpperCase()}
        """
        Assert.assertThat(kt.rawString(stringParam), IsEqual.equalTo(stringExpected))
    }

    @Test
    fun itShouldReturn55UsingLabels() {
        val kt = KotlinFunctions()
        Assert.assertThat(kt.usingLabel(), IsEqual.equalTo(55))
    }
}