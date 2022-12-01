import javax.swing.plaf.IconUIResource;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main_hw_1 {
    private static int newWidth = 300;
    private static double cores = Runtime.getRuntime().availableProcessors();
//    private static double cores = 17;
    public static void todo(){
        String srcFolder = "C:\\Users\\User\\Desktop\\programming\\JavaPrograms\\Skillbox\\" +
                "10_MySQL_in_JAVA\\_11_multithreading\\src_pics";
        String dstFolder = "C:\\Users\\User\\Desktop\\programming\\JavaPrograms\\Skillbox\\" +
                "10_MySQL_in_JAVA\\_11_multithreading\\dst_pics";
        File srcDir = new File(srcFolder);
        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        int pathOfCores = (int) (files.length / cores);

        try {
            List<File[]> listFiles = new ArrayList<>();

        }catch (Exception exc){
            System.err.println("didnt create List<File[]>");
        }
        for (int i = 1; i <= (int) cores; i++){
            if (i == (int) cores){
                File[] files1 = new File[pathOfCores];
//                System.out.println("inside of i == cores");
                System.arraycopy(files, pathOfCores * (i - 1), files1, 0, files1.length);
//                System.arraycopy(files, pathOfCores * (i - 1), files1, 0, pathOfCores);
                _2_ImageResizer_Runnable imageResizer_runnable1 = new _2_ImageResizer_Runnable(files1, newWidth, dstFolder, start, i);
//                System.out.print(i + " ");
                new Thread(imageResizer_runnable1).start();
                return;
            }
            File[] files1 = new File[pathOfCores];
            System.arraycopy(files, pathOfCores * (i - 1), files1, 0, pathOfCores);
            _2_ImageResizer_Runnable imageResizer_runnable1 = new _2_ImageResizer_Runnable(files1, newWidth, dstFolder, start, i);
//            System.out.print(i + " ");
            new Thread(imageResizer_runnable1).start();
        }

//        File[] files1 = new File[pathOfCores];
//        System.arraycopy(files, 0, files1, 0, pathOfCores);
//        _2_ImageResizer_Runnable imageResizer_runnable1 = new _2_ImageResizer_Runnable(files1, newWidth, dstFolder, start);
//        new Thread(imageResizer_runnable1).start();
//
//        File[] files2 = new File[files.length - pathOfCores];
//        System.arraycopy(files, pathOfCores, files2, 0 , files2.length);
//        _2_ImageResizer_Runnable imageResizer_runnable2 = new _2_ImageResizer_Runnable(files2, newWidth, dstFolder, start);
//        new Thread(imageResizer_runnable2).start();
//        new Thread(()->{
//            for (int i = 0; i<=1000000; i++)
//                System.out.println(i);
//        }).start();
    }

}
