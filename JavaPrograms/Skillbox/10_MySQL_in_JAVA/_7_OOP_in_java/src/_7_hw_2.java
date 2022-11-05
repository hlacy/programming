import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;

public class _7_hw_2 {
    public static void todo(){
        ArrayList<Employee> employees =  _7_5_stream.loadStaffFromFile();

        employees.forEach(e -> System.out.println(e.getWorkStart().getTime()));

        employees.stream().filter(e -> e.getWorkStart().getTime()/1000 >= 1483228800
                && e.getWorkStart().getTime()/1000 <= 1514725199).max(Comparator.comparing(Employee::getSalary))
                .ifPresent(System.out::println);
//        employees.stream().forEach(e);

    }
}
