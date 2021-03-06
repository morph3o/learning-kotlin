package cl.learningkotlin.domain

import org.hamcrest.core.IsEqual
import org.hamcrest.core.StringContains
import org.junit.Assert
import org.junit.Test

class PersonTest {
    @Test
    fun itShouldInitializePersonUsingPrimaryConstructor() {
        val person = Person("test@test.com")
        Assert.assertThat(person.email, IsEqual.equalTo("test@test.com"))
        Assert.assertThat(person.firstName, StringContains.containsString("EMPTY"))
        Assert.assertThat(person.lastName, StringContains.containsString("EMPTY"))
    }

    @Test
    fun itShouldInitializePersonUsingSecondaryConstructor() {
        val person = Person("test@test.com", "Pedro", "Perez")
        Assert.assertThat(person.email, IsEqual.equalTo("test@test.com"))
        Assert.assertThat(person.firstName, IsEqual.equalTo("Pedro"))
        Assert.assertThat(person.lastName, IsEqual.equalTo("Perez"))
    }
    @Test
    fun itShouldInitializePersonUsingThirdConstructor() {
        val person_address: Address = Address()
        val person = Person("test@test.com", "Pedro", "Perez", person_address)
        Assert.assertThat(person.email, IsEqual.equalTo("test@test.com"))
        Assert.assertThat(person.firstName, IsEqual.equalTo("Pedro"))
        Assert.assertThat(person.lastName, IsEqual.equalTo("Perez"))
        Assert.assertThat(person.address.get(index = 0), IsEqual.equalTo(person_address))
    }
}