package pl.kamilprzenioslo.immutability;

import java.awt.*;

public final class StickyNote {

    private final String content;
    private final Color color;
    private final Rectangle body;

    public StickyNote(String content, Color color, Rectangle body) {
        this.content = content;
        this.color = color;
        this.body = new Rectangle(body.x, body.y, body.width,
                                  body.height);
    }

    public String getContent() {
        return content;
    }

    public Color getColor() {
        return color;
    }

    public Rectangle getBody() {
        return new Rectangle(body.x, body.y, body.width, body.height);
    }
}
