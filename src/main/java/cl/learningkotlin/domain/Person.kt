package cl.learningkotlin.domain

import mu.KLogging

class Person(val email: String){
    companion object: KLogging()
    var address: MutableList<Address> = mutableListOf()
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
    constructor(email: String, firstName: String, lastName: String, address: Address) : this(email, firstName, lastName) {
        logger.info { "Third constructor" }
        this.address.add(element = address)
    }
}
