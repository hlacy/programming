import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Tinkoff_2 {

    private static Map<String, Integer> winners = new HashMap<>();

    public static final Function<String, String> func = new Function<String, String>() {
        @Override
        public String apply(String it) {
            return it.toLowerCase();
        }
    };

    public static final Function<String, String> func2 = it -> it.toLowerCase();
    public static final Function<String, String> func3 = String::toLowerCase;

    public static void main(String[] str) throws Exception {
//        String strs = new String("C:\\Users\\User\\Desktop\\" +
//                "programming\\JavaPrograms\\Skillbox\\" +
//                "10_MySQL_in_JAVA\\_9_files\\file_name.txt");
//        String file = new String("C:\\Users\\User\\Desktop\\" +
//                "programming\\JavaPrograms\\Skillbox\\" +
//                "10_MySQL_in_JAVA\\_9_files");
////        _9_4_Files.workWithFile(strs);
//        _9_hw_1.work(strs);

        System.out.println(func.apply("ADASDSADASD"));

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int numberOfLines =  Integer.parseInt(bufferedReader.readLine());
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            i++;
            if (i >= numberOfLines) break;

            List<String> stringList = Arrays.asList(line.split(" "));
            Collections.sort(stringList);

            String teamName = stringList.stream()
                    .map(teamName2 -> teamName2.toLowerCase())
                    .map(new Function<String, String>() {
                        @Override
                        public String apply(String it) {
                            return it.toLowerCase();
                        }
                    })
                    .map(String::toLowerCase)
                    .collect(Collectors.joining());

            Integer numberOfWins = winners.get(teamName);

            if (numberOfWins == null) {
                winners.put(teamName, 1);
            } else {
                winners.put(teamName, ++numberOfWins);
            }


        }

        int maxWins = 0;
        for (Map.Entry<String, Integer> teamNameToWins : winners.entrySet()) {
            Integer value = teamNameToWins.getValue();

            if (value > maxWins) {
                maxWins = value;
            }
        }
        System.out.println(maxWins);

    }
}
