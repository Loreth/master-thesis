package pl.kamilprzenioslo.k.safety

import java.net.InetAddress

class Socket(
    port: Int,
    host: String = loopbackAddress(),
    localAddr: InetAddress = anyLocalAddress(),
    localPort: Int = systemAssignedPort()
)

fun systemAssignedPort(): Int {
    return 12345
}

fun anyLocalAddress(): InetAddress {
    return InetAddress.getLocalHost()
}

fun loopbackAddress(): String {
    return "0.0.0.0"
}

fun instance() {
    // utworzenie instancji
    Socket(8080, localAddr = InetAddress.getLocalHost())
}
