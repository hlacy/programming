import java.util.Comparator;

public class _6_10_Comparator implements Comparator<_6_1_Rectangel_Square> {
    @Override
    public int compare(_6_1_Rectangel_Square o1, _6_1_Rectangel_Square o2) {
        if (o1.getWidth() > o2.getWidth()) return 1;
        if (o1.getWidth() < o2.getWidth()) return -1;
        return 0;
    }
}
