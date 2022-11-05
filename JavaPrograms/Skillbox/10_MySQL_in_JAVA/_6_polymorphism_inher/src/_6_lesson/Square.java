package _6_lesson;

public class Square extends Rectangel implements Comparable<Square>{
    public Square(int width, int height) {
        super(width, height);
        if (width != height){
            System.out.println("Error 228");
        }
    }

    public Square(int width){
        super(width, width);
    }

    @Override
    public void setHeight(int height) {
        setWidth(height);
        setHeight(height);
    }

    @Override
    public void setWidth(int width) {
        setWidth(width);
        setHeight(width);
    }

    @Override
    public int compareTo(Square o) {
        if (getHeight() > o.getHeight()) return 1;
        if (getHeight() < o.getHeight()) return -1;
        return 0;
    }
}
