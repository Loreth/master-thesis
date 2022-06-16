package pl.kamilprzenioslo.safety;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class Person {

    @NotNull private String firstName;
    @Nullable private String lastName;

    public Person(@NotNull String firstName,
                  @Nullable String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @NotNull
    public String getFirstName() {
        return firstName;
    }

    @Nullable
    public String getLastName() {
        return lastName;
    }

    public void setFirstName(@NotNull String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(@Nullable String lastName) {
        this.lastName = lastName;
    }
}

