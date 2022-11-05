import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;
import java.util.stream.Stream;

public class Main implements StaticMethod
{
    public int todo1(){
        return 0;
    }
    public static void main(String[] args)
    {
//        _7_hw_1.todo();
//        _7_pointer_to_method.todo();
//        _7_hw_2.todo();
//        _7_10_generics.todo();

        Integer[] digs = {1, 2, 3, 4, 5 ,6};
        Arrays.stream(digs).map(String::valueOf)
                .reduce((s1, s2) -> s1+s2).ifPresent(System.out::println);
    }
}