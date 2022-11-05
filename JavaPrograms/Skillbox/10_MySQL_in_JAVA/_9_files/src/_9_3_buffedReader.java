import java.io.BufferedReader;
import java.io.FileReader;

public class _9_3_buffedReader {
    public static void workWithFile(){
        String str = new String("C:\\Users\\User\\Desktop\\" +
                "programming\\JavaPrograms\\Skillbox\\" +
                "10_MySQL_in_JAVA\\_9_files\\file_name.txt");
        StringBuilder stringBuilder = new StringBuilder();
         try {
             BufferedReader bufferedReader = new BufferedReader(new FileReader(str));
            for (;;){
                String line = bufferedReader.readLine();
                if (line == null)
                    break;
                stringBuilder.append("1" + line + "\n");
            }
         } catch (Exception e){
             e.printStackTrace();
         }
        System.out.println("1" + stringBuilder.toString() );
    }

}
