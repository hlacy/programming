import java.io.File;
import java.util.logging.FileHandler;

public class _9_1 {
    public static void workWithFile(){
        File file = new File("C:\\Users\\User\\Desktop\\" +
                "programming\\JavaPrograms\\Skillbox\\10_MySQL_in_JAVA\\_9_files\\dir_2");

        file.mkdir();
        file = new File("C:\\Users\\User\\Desktop\\" +
                "programming\\JavaPrograms\\Skillbox\\10_MySQL_in_JAVA\\_9_files");
        File[] files = file.listFiles();
        for (File filesFor: files)
        System.out.println(filesFor.getName());

        System.out.println(file.getAbsolutePath());
        System.out.println(file.toString());
        System.out.println(file.canExecute());
        System.out.println(file.isFile());
    }
}
