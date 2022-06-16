package pl.kamilprzenioslo.k.validation

class Validation {
    fun validate(string: String?, strings: List<String>) {
        // Walidacja wartości pustej
        var validString = requireNotNull(string)
        validString = string ?: strings[0]

        // Walidacja zakresu kolekcji
        require(1 in strings.indices)
        require(2 in strings.indices && 4 in strings.indices)

        // Walidacja niestandardowa
        require(!string.contains("a") && string.endsWith("b"))

        // Asercja
        assert(string != null)
    }
}
