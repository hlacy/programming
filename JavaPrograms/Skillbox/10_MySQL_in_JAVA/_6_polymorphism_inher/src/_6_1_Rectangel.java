public abstract class _6_1_Rectangel extends _6_5_figure2D {
    public double width;
    public double height;
    public _6_1_Rectangel(double width, double height){
        this.height = height;
        this.width = width;
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
    public double getSquare(){
        return width * height;
    }


    @Override
    public double getVisibleHeight() {
        return 0;
    }

    @Override
    public double getVisibleWeight() {
        return 0;
    }

    public abstract int compareTo(_6_1_Rectangel_Square square);
}
