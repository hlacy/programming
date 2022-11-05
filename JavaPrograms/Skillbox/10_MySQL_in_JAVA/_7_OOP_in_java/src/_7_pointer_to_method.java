import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


    import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
public class _7_pointer_to_method {

        private static String staffFile = "data/staff1.txt";
        private static String dateFormat = "dd.MM.yyyy";
        public static void todo(){
            ArrayList<Employee> staff = loadStaffFromFile();


//            Collections.sort(staff, (e1, e2) -> e1.getSalary().compareTo(e2.getSalary()));

//            Collections.sort(staff, new Comparator<Employee>() {
//                @Override
//                public int compare(Employee o1, Employee o2) {
//                    return o1.getSalary().compareTo(o2.getSalary());
//                }
//            });


//            Collections.sort(staff, Comparator.comparing(Employee::getSalary));
//
//            for (Employee e: staff)
//                System.out.println(e);
//
//            staff.forEach(employee -> System.out.println(employee));

            System.out.println("Old salaries:");
            staff.forEach(System.out::println);

            int salaryIncrease = 10000;
            staff.forEach(e -> e.setSalary(e.getSalary() + salaryIncrease));



            System.out.println("New salaries:");
            staff.forEach(System.out::println);


        }
        private static ArrayList<Employee> loadStaffFromFile()
        {
            ArrayList<Employee> staff = new ArrayList<>();
//            staff.stream().filter()
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


