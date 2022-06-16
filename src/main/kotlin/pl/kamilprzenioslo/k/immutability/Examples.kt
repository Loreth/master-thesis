package pl.kamilprzenioslo.k.immutability

import pl.kamilprzenioslo.k.immutability.dataclass.Person

fun mutableList() {
    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")
    val list: List<String> = mutableList

    println(list)

    mutableList.add("d")

    println(list)
}

fun copy() {
    val person = Person("Jan", "Kowalski", 30)
    val modifiedPerson = person.copy(lastName = "Nowak")

    println(person)

    println(modifiedPerson)
}

fun destructuring() {
    val person = Person("Jan", "Kowalski", 30)

    // destrukturyzacja całego obiektu
    val (firstName, lastName, age) = person
    println("$firstName, $lastName, $age")

    // destrukturyzacja z pominięciem wybranych pól
    val (_, _, personAge) = person
    println(personAge)

    // destrukturyzacja pary klucz/wartość w pętli for
    val map: Map<Int, Person> = mapOf(1 to person)
    for ((key, value) in map) {
        println("$key: $value")
    }

    // destrukturyzacja parametrów funkcji anonimowej
    map.forEach { entry -> println(entry.value) }

    map.forEach { (_, value) -> println(value) }
}
