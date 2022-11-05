import java.util.ArrayList;
import java.util.ArrayList;

public class _7_10_generics {
    public static void todo(){
        ArrayList<Employee> employees = _7_5_stream.loadStaffFromFile();
        LRUCache<Employee> cache = new LRUCache<>(5);
        for (Employee e: employees){
            cache.addElement(e);
        }
        cache.getAllElements().forEach(System.out::println);
    }
}
