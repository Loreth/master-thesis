package pl.kamilprzenioslo.safety;

import pl.kamilprzenioslo.k.Contact;
import pl.kamilprzenioslo.k.Employee;
import pl.kamilprzenioslo.k.Task;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.UnknownHostException;
import java.sql.SQLException;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import static java.util.Comparator.naturalOrder;
import static pl.kamilprzenioslo.k.SafeCallKt.exampleTask;
import static pl.kamilprzenioslo.k.safety.ExamplesKt.throwsExceptionCheckedInJava;

public class Examples {

    void printStringLength(String string) {
        int stringLength = 0;

        if (string != null) {
            stringLength = string.length();
        }

        System.out.println(stringLength);
    }

    void conditionals() {
        var assignee =
                exampleTask().getAssignee();
        if (assignee != null) {
            var contact =
                    assignee.getContact();
            if (contact != null) {
                contact.getEmail();
            }
        }
    }

    void optionalTask() {
        Optional.of(exampleTask())
                .map(Task::getAssignee)
                .map(Employee::getContact)
                .map(Contact::getEmail)
                .orElse(null);
    }

    int stringLength(String string) {
        return string != null ? string.length() : 0;
        // lub
        if (string != null) {
            return string.length();
        } else {
            throw new IllegalArgumentException();
        }
    }

    void newSocket() throws IOException {
        new Socket((String) null, 8080, InetAddress.getLocalHost(), 0);
    }

    // metoda zwracająca Optional
    Optional<String> findLongestString(Collection<String> strings) {
        return strings.stream().max(naturalOrder());
    }

    void optionalUsage() {
        // wykorzystanie otrzymanej instancji Optional
        String longestString = findLongestString(someStrings())
                .orElse("No longest string - collection was empty");
        // lub
        String longestString = findLongestString(someStrings()).orElseThrow();
        // lub
        findLongestString(someStrings()).ifPresent(System.out::println);
    }

    List<String> someStrings() {
        return List.of("a", "b");
    }

    void errorHandling() {
        try (FileReader reader = new FileReader("filename")) {
            // wykonywany kod
        } catch (FileNotFoundException ex) {
            // obsługa rzuconego wyjątku
        } catch (IOException | SQLException ex) {
            // obsługa rzuconego wyjątku
        } catch (Exception ex) {
            // obsługa rzuconego wyjątku
        } finally {
            // opcjonalny blok finalizujący
        }
    }

    void throwsExceptionChecked() {
        try {
            throwsExceptionCheckedInJava();
        } catch (IOException ex) {
            // obsługa rzuconego wyjątku
        }
    }
}
