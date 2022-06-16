package pl.kamilprzenioslo.k.safety.socketv2

import java.net.InetAddress

class Socket(
    host: String = loopbackAddress(),
    port: Int,
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
    Socket(port = 8080, localAddr = InetAddress.getLocalHost())
}
