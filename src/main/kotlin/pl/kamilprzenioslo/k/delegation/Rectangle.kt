package pl.kamilprzenioslo.k.delegation

class Rectangle(val width: Int, val height: Int) : ClosedShape {

    override fun area(): Int = width * height
}
