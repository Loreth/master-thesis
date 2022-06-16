package pl.kamilprzenioslo.k

class Task(
    val description: String,
    var assignee: Employee?
)

class Employee(
    var name: String,
    var contact: Contact? = null
)

class Contact(
    var phone: String?,
    var email: String?
)

fun exampleTask() = Task("Test", Employee("John Smith"))

fun taskElvis() = exampleTask().assignee?.contact?.email
//
//
//fun safeCall() = exampleTask().assignee?.contact?.email
//
//
//fun example() {
//    val task = exampleTask()
//
//    // używając instrukcji warunkowych
//    val contact = employee.contact
//    if (contact != null && contact.email != null) {
//        println(contact.email)
//    }
//
//    // używając bezpiecznego wywołania
//    exampleTask().assignee?.contact?.email
//    task.assignee?.contact?.email
//
//    // customer has no address
//    var customer = Customer("Al", null)
//    val order = Order(customer, emptyList<Pizza>())
//    println("test1: ${order.customer?.address?.street2}")   //null
//
//    // customer has address but no 'street2'
//    customer.address = address
//    println("test2: ${order.customer?.address?.street2}")   //null
//}
//
//fun getStringLength(string: String?): Int {
//    return string?.length ?: 0
//    // lub
//    return string?.length ?: throw IllegalArgumentException()
//}
//
//
///**
// * @throws IOException
// */
//class SocketKotlin(
//    host: String = loopbackAddress(),
//    port: Int,
//    localAddr: InetAddress = anyLocalAddress(),
//    localPort: Int = systemAssignedPort()
//)
//
//fun socketExample() {
//
//    // utworzenie instancji
//    SocketKotlin(port = 8080)
//}
//fun loopbackAddress(): String
//fun anyLocalAddress(): InetAddress
//fun systemAssignedPort(): Int

//// metoda zwracająca typ potencjalnie pusty
//fun findLongestString(strings: Collection<String>): String? {
//    return strings.maxOrNull();
//}
//
//// metoda wykorzystująca otrzymaną instancję Optional
//fun printLongestString(strings: Collection<String>) {
//    // wykorzystanie otrzymanej wartości potencjalnie pustej
//
//    val longestString = findLongestString(strings) ?:
//            "No longest string - collection was empty"
//    // lub
//    val longestString = findLongestString(strings) ?:
//            throw NoSuchElementException()
//    // lub
//    findLongestString(strings)?.let { println(it) }
//}
