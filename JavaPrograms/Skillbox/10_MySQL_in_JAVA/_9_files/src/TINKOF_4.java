import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;

public class TINKOF_4 {

    private static List<Map<String, Long>> vars = new ArrayList<>(Collections.singletonList(new HashMap<>()));

    public static void main(String[] str) throws Exception {
//        String strs = new String("C:\\Users\\User\\Desktop\\" +
//                "programming\\JavaPrograms\\Skillbox\\" +
//                "10_MySQL_in_JAVA\\_9_files\\file_name.txt");
//        String file = new String("C:\\Users\\User\\Desktop\\" +
//                "programming\\JavaPrograms\\Skillbox\\" +
//                "10_MySQL_in_JAVA\\_9_files");
////        _9_4_Files.workWithFile(strs);
//        _9_hw_1.work(strs);



        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        int i = 0;
        while ((line = bufferedReader.readLine()) != null) {
            i++;

            if (line.contains("=")) {
                String[] split = line.split("=");
                if (isVariable(split[1])){
                    Long value = getVarValue(split[1]);
                    getActualContext().put(split[0], value);
                    System.out.println(value);
                } else {
                    getActualContext().put(split[0], Long.parseLong(split[1]));
                }
            }

            if (line.equals("{")) {
                vars.add(new HashMap<>(getActualContext()));
            }

            if (line.equals("}")) {
                vars.remove(vars.size() - 1);
            }
        }

    }

    private static Map<String, Long> getActualContext() {
        return vars.get(vars.size() - 1);
    }

    private static Long getVarValue(String varName) {
        Map<String, Long> currentVariables = getActualContext();
        Long value = currentVariables.get(varName);

        if (value == null) {
            currentVariables.put(varName, 0L);
        }

        return currentVariables.get(varName);
    }


    private static boolean isVariable(String varValue) {
        try {
            Long.parseLong(varValue);
            return false;
        } catch(NumberFormatException e){
            return true;
        }
    }
}
