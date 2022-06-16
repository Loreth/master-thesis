package pl.kamilprzenioslo.validation;

public class Person {

    private final String firstName;
    private String lastName;
    private int age;

    public Person(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("age must be positive!");
        }
        this.age = age;
    }

    public String getFullName() {
        return firstName + " " + lastName;
    }

    void example() {
        var person = new Person("abc", "def", 10);

        person.getFirstName();
        person.setLastName("Jan");
        person.setAge(person.getAge() + 5);
    }
}
