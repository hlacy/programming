import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class _9_2_reading_of_file {
    public static void readingFile(){

            String str = new String("C:\\Users\\User\\Desktop\\" +
                    "programming\\JavaPrograms\\Skillbox\\10_MySQL_in_JAVA\\_9_files\\file_name.txt");
            StringBuilder stringBuilder = new StringBuilder();
            try {
                FileInputStream fileInputStream = new FileInputStream(str);
                for (; ; ) {
                    int code = fileInputStream.read();
                    if (code < 0 )
                        break;
                    char ch = (char) code;
                    stringBuilder.append(ch);
                }
            } catch (Exception e) {
                System.err.println("Exception");
                e.printStackTrace();
            }
        System.out.println(stringBuilder);
    }
}
