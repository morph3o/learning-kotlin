package cl.learningkotlin.domain

import mu.KLogging

class Person(val email: String){
    companion object: KLogging()
    var firstName: String = "EMPTY FIRSTNAME"
        set(value) {
            if(value.isNotEmpty()) field = value
        }
    var lastName: String = "EMPTY LASTNAME"
        set(value) {
            if(value.isNotEmpty()) field = value // field -> lastName
        }
    constructor(email: String, firstName: String = "", lastName: String = "") : this(email) {
        logger.info { "Secondary constructor" }
        this.firstName = firstName
        this.lastName = lastName
    }
}
