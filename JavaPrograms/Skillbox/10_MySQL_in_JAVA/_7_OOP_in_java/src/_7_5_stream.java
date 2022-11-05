import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Stream;

public class _7_5_stream {
        private static String staffFile = "data/staff1.txt";
        private static String dateFormat = "dd.MM.yyyy";
        public static void todo(){
            ArrayList<Employee> staff = loadStaffFromFile();

//            Stream<Employee> stream = staff.stream();
//            stream.filter(employee -> employee.getSalary() >= 100_000).forEach(System.out::println);

            Stream<Integer> numbers = Stream.of(1, 2, 3, 4, 5, 6, 7, 10 ,9 ,8);
//            numbers.filter(n -> n % 2 == 0).forEach(System.out::println);
//            Stream.iterate(1, n -> n + 1).forEach(System.out::print);
            staff.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
            staff.stream().min(Comparator.comparing(Employee::getSalary)).ifPresent(System.out::println);
        }
        public static ArrayList<Employee> loadStaffFromFile()
        {
            ArrayList<Employee> staff = new ArrayList<>();
            try
            {
                List<String> lines = Files.readAllLines(Paths.get(staffFile));
                for(String line : lines)
                {
                    String[] fragments = line.split("\t");
                    if(fragments.length != 3) {
                        System.out.println("Wrong line: " + line);
                        continue;
                    }
                    staff.add(new Employee(
                            fragments[0],
                            Integer.parseInt(fragments[1]),
                            (new SimpleDateFormat(dateFormat)).parse(fragments[2])
                    ));
                }
            }
            catch (Exception ex) {
                ex.printStackTrace();
            }
            return staff;
        }
    }




