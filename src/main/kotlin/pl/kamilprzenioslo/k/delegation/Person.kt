package pl.kamilprzenioslo.k.delegation

import java.time.LocalDate
import java.time.Period

class Person(private val birthdate: LocalDate) {

    val age: Int by lazy {
        Period.between(birthdate, LocalDate.now()).years
    }
}
