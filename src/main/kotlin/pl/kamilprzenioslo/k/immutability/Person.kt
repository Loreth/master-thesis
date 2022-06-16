package pl.kamilprzenioslo.k.immutability

import java.util.*


class Person(val firstName: String, val lastName: String, val age: Int) {

    fun copy(
        firstName: String = this.firstName,
        lastName: String = this.lastName,
        age: Int = this.age
    ) = Person(firstName, lastName, age)

    override fun equals(other: Any?): Boolean {
        if (this === other) {
            return true
        }
        if (javaClass != other?.javaClass) {
            return false
        }
        other as Person
        return firstName == other.firstName &&
                lastName == other.lastName &&
                age == other.age
    }

    override fun hashCode(): Int {
        return Objects.hash(firstName, lastName, age)
    }

    override fun toString() =
        "Person(firstName=$firstName, lastName=$lastName, age=$age)"

    operator fun component1() = firstName

    operator fun component2() = lastName

    operator fun component3() = age
}
