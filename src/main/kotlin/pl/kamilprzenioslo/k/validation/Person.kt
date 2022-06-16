package pl.kamilprzenioslo.k.validation

class Person(val firstName: String, var lastName: String, age: Int) {

    var age: Int = age
        set(value) {
            require(value >= 0) { "age must be positive!" }
            field = value
        }

    val fullName: String
        get() = "$firstName $lastName"
}

fun example() {
    val person = Person("abc", "def", 10)

    person.firstName
    person.lastName = "Jan"
    person.age += 5
}
