package cl.learningkotlin.main

class KotlinFunctions {
    fun sum(a: Int = 5, b: Int = 5): Int {
        return a + b
    }

    fun theConstantValue() = 42

    fun rawString(s: String): String {
        return """
            Testing the new raw string
            type of kotlin. This string contains the
            parameter: ${s.toUpperCase()}
        """
    }

    fun usingLabel(): Int {
        var r: Int = 0
        testLabel@for ( i in 1..100 ){
            for (j in 1..100 ){
                if (j == 55) {
                    r = j
                    break@testLabel
                }
            }
        }
        return r
    }

}
