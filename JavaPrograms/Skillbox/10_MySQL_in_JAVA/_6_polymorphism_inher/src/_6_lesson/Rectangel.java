package _6_lesson;

public class Rectangel extends Figure2D {

    private double width;
    private double height;

    public Rectangel(int width, int height){
        this.height = height;
        this.width = width;
    }

    public double getSquare(){
        return height * width;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWeight() {
        return 0;
    }
}
