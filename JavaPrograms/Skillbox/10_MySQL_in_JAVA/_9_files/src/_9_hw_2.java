import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;


public class _9_hw_2 {
    public static void copyDir(){
        System.out.println("From which path to copy");
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println("To which path to copy");
        String strDest = scanner.nextLine();
        scanner.close();

        try {
            File file = new File(str);
            File[] filesArr = file.listFiles();
//            for (File f : filesArr) {
//                Files.copy(f.toPath(), new File(strDest + File.separator + f.getName()).toPath());
//            }

                file.delete();
                new File(Path.of(strDest).toString()).delete();

        } catch (Exception e){
            System.err.println("Exception");
            e.printStackTrace();
        }

    }
}
