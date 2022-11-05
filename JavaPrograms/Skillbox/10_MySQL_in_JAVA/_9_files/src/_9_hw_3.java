import javax.xml.crypto.Data;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _9_hw_3 {
    public static void showData() throws IOException {
        final String FILE = "C:\\Users\\User\\Desktop\\programming\\JavaPrograms" +
                "\\Skillbox\\10_MySQL_in_JAVA\\_9_files\\movementList.csv";

        FileReader fileReader = new FileReader(FILE);
        ArrayList<String> arrayList = new ArrayList<>();

        List<String> fileList = Files.readAllLines(Paths.get(FILE));
        String[] lines;
        int i = 0;
        int k = 0;
        String[] receiptOperationsCounting = new String[0];
        double expenditure = 0;
        double receipt = 0;
        for (String s : fileList) {
            s = s.replaceAll("\"", "");
            lines = s.split(",");
//            if (lines.length != 8) continue;
            for (int j = 0; j < lines.length && i == 0; j++) {
                System.out.println("  " + j + " " + lines[j].toString());
            }
//            System.out.println(i + " " + Arrays.toString(lines) );
            i++;
            if (receiptOperationsCounting.length == 0)
                receiptOperationsCounting = new String[s.length()];
            if (i == 1) continue;
            if (lines.length == 9) { // if there are "" it means there is an extra coma
                lines[7] = lines[7] + "." + lines[8];
            }
//            System.out.print(lines[7].toString() + " \n");
//            System.out.println(Double.parseDouble(lines[7].toString()));
            expenditure += Double.parseDouble(lines[7].toString());
            receipt += Double.parseDouble(lines[6].toString());
            if (Double.parseDouble(lines[7].toString()) != 0) {

                receiptOperationsCounting[k] = lines[5] + ": " + lines[7];
                receiptOperationsCounting[k] = receiptOperationsCounting[k].replaceAll("\\s", "");
                k++;
            }
        }
        System.out.println();
        System.out.println();
        System.out.println("expenditure " + expenditure);
        System.out.println("receipt " + receipt);
        for (String st : receiptOperationsCounting)
            System.out.println(st);

    }
}
