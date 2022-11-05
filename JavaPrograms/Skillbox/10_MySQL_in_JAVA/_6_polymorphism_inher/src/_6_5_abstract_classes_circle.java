public class _6_5_abstract_classes_circle extends _6_5_figure2D {
    private double radius;
    public _6_5_abstract_classes_circle( double radius){
        this.radius = radius;
    }

    @Override
    public double getSquare() {
        return Math.PI * radius * radius;
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
