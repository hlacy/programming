import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class _9_4_Files {
    public static void workWithFile(String strs){
        StringBuilder stringBuilder = new StringBuilder();
        try {
            List<String> stringList = Files.readAllLines(Paths.get(strs));
            stringList.forEach(stringL -> stringBuilder.append(stringList + "55\n"));

        }
        catch (Exception e){
            e.printStackTrace();
        }
        System.out.println(stringBuilder.toString());
    }
}
