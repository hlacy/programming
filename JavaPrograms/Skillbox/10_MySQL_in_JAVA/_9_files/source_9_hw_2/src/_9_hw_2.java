import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Scanner;

public class _9_hw_2 {
    public static void copyDir(){
        System.out.println("From which path to copy");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("To which path to copy");
        String strDest = scanner.nextLine();
        scanner.close();
//        System.out.println(str);
        try {
            File file = new File(str);
            File[] files = file.listFiles();
            for (File file1: files){
                Files.copy(file.toPath(), Path.of(strDest), StandardCopyOption.REPLACE_EXISTING);
            }

        } catch (Exception e){
            System.err.println("Exception");
            e.printStackTrace();
        }
    }
}
