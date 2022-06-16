package pl.kamilprzenioslo.delegation;

import pl.kamilprzenioslo.k.delegation.ClosedShape;

public class Window implements ClosedShape {

    private final ClosedShape shape;

    public Window(ClosedShape shape) {
        this.shape = shape;
    }

    @Override
    public int area() {
        return shape.area();
    }
}
