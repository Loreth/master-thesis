package pl.kamilprzenioslo.validation;

import java.util.List;

import static java.util.Objects.*;

public class Validation {
    void validate(String string, List<String> strings) {
        // Walidacja wartości pustej
        var validString = requireNonNull(string);
        validString = requireNonNullElse(string, strings.get(0));

        // Walidacja zakresu kolekcji
        checkIndex(1, strings.size());
        checkFromToIndex(2, 5, strings.size());

        // Walidacja niestandardowa
        if (!string.contains("a") && string.endsWith("b")) {
            throw new IllegalArgumentException();
        }

        // Asercja
        assert string != null;
    }
}
