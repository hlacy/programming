import java.io.File;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.Time;
import java.util.ArrayList;
import java.util.Arrays;

public class _9_6_writing_to_a_file  {
    public static void writing() throws Exception{
//        PrintWriter printWriter = new PrintWriter("file.txt");
//        for (int i =  0; i< 1000; i++)
//        {
//            printWriter.write(i +"\n");
//        }
//        printWriter.flush();
//        printWriter.close();
        File file = new File("file.txt");
        File file2 = new File("file2.txt");

//        String file = new String("file.txt");
//        if (file.delete()){
//            file.createNewFile();
        ArrayList<String> strings = new ArrayList<>();
        for (int i = 1; i <= 1000; i++){
           strings.add(Integer.toString(i));
        }
        long l;
        long l2;
        long lTemp;
        l = System.currentTimeMillis();
        Files.write(Path.of(String.valueOf(file)), strings);
        lTemp = System.currentTimeMillis();
        Files.write(Paths.get(String.valueOf(file2)), strings);
        l2 = System.currentTimeMillis();
        System.out.println("for Files.write(Path.of(String.valueOf(file)), strings) " +
                "time is " + (lTemp - l));
        System.out.println("for Files.write(Paths.get(String.valueOf(file2)), strings) " +
                "time is " + (l2 - lTemp));
    }
}
