package pl.kamilprzenioslo.delegation;

import java.time.LocalDate;
import java.time.Period;

public class Person {

    private final LocalDate birthdate;
    private Integer age;

    public Person(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public synchronized int getAge() {
        if (age == null) {
            age = Period.between(birthdate, LocalDate.now()).getYears();
        }
        return age;
    }
}

