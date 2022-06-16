package pl.kamilprzenioslo.k.safety

import java.io.FileNotFoundException
import java.io.FileReader
import java.io.IOException
import java.sql.SQLException

fun nullAssignment() {
    var a: String = "abc"
    a = null // błąd kompilacji

    var b: String? = "abc"
    b = null // udana kompilacja
}

fun reassignment() {
    val a: Int? = 123
    val b: Int = a // błąd kompilacji

    val x: Int = 123
    val y: Int? = x // udana kompilacja
}

fun doublebang() {
    val string: String? = functionReturningANullableString()

    val stringLength = string.length // błąd kompilacji

    val forcedStringLength = string!!.length // udana kompilacja
}

fun functionReturningANullableString(): String? = null

fun stringLength(string: String?): Int {
    return string?.length ?: 0
    // lub
    return string?.length ?: throw IllegalArgumentException()
}

// metoda zwracająca wartość potencjalnie pustą
fun findLongestString(strings: Collection<String>): String? {
       return strings.maxOrNull();
   }

fun safeCallUsage() {
    val strings = listOf("a", "b")

    // wykorzystanie otrzymanej wartości potencjalnie pustej
    val longestString = findLongestString(strings) ?:
            "No longest string - collection was empty"
    // lub
    val longestString = findLongestString(strings) ?:
            throw NoSuchElementException()
    // lub
    findLongestString(strings)?.let { println(it) }
}

fun errorHandling() {
    try {
        FileReader("filename").use { reader ->
            // wykonywany kod
        }
    } catch (ex: FileNotFoundException) {
        // obsługa rzuconego wyjątku
    } catch (ex: IOException) {
        // obsługa rzuconego wyjątku
    } catch (ex: SQLException) {
        // obsługa rzuconego wyjątku
    } catch (ex: Exception) {
        // obsługa rzuconego wyjątku
    } finally {
        // opcjonalny blok finalizujący
    }
}

@Throws(IOException::class)
fun throwsExceptionCheckedInJava() {
    throw IOException()
}
