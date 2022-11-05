import java.awt.*;

public abstract class _6_5_figure2D implements Figure{
    private Color color;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public abstract double getSquare();
}
