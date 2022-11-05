package _6_lesson;

import java.awt.*;

public abstract class Figure2D implements Figure{
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getSquare();
}
