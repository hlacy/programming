public class _6_1_Rectangel_Square extends _6_1_Rectangel
        implements Comparable<_6_1_Rectangel_Square>
{

    public _6_1_Rectangel_Square(double width, double height) {
        super(width, height);
        if(width != height)
            System.out.println("Width doesn't equal height");
    }

    public _6_1_Rectangel_Square(double width){
        super(width, width);

    }

    public void setWidth(double width){
        this.width = width;
        height = width;
    }

    public void setHeight( double height){
        this.height = height;
        width = height;
    }


    @Override
    public int compareTo(_6_1_Rectangel_Square square) {
        if (getWidth() > square.getWidth()) return -1;
        if (getWidth() < square.getSquare()) return 1;
        return 0;
    }


}
