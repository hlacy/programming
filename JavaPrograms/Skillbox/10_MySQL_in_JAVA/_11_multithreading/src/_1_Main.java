import java.io.File;

public class _1_Main {
    private static int newWidth = 300;
    public static void todo(){
        String srcFolder = "C:\\Users\\User\\Desktop\\programming\\JavaPrograms\\Skillbox\\" +
                "10_MySQL_in_JAVA\\_11_multithreading\\src_pics";
        String dstFolder = "C:\\Users\\User\\Desktop\\programming\\JavaPrograms\\Skillbox\\" +
                "10_MySQL_in_JAVA\\_11_multithreading\\dst_pics";
        File srcDir = new File(srcFolder);
        long start = System.currentTimeMillis();
        File[] files = srcDir.listFiles();

        int middle = files.length / 2;

        File[] files1 = new File[middle];
        System.arraycopy(files, 0, files1, 0, middle);
//        _1_ImageResizer_Thread a2ImageResizer1 = new _1_ImageResizer_Thread(files1, newWidth, dstFolder, start);
//        a2ImageResizer1.start();
        _2_ImageResizer_Runnable imageResizer_runnable1 = new _2_ImageResizer_Runnable(files1, newWidth, dstFolder, start);
        new Thread(imageResizer_runnable1).start();

        File[] files2 = new File[files.length - middle];
        System.arraycopy(files, middle, files2, 0 , files2.length);
//        _1_ImageResizer_Thread a2ImageResizer2 = new _1_ImageResizer_Thread(files2, newWidth, dstFolder, start);
//        a2ImageResizer2.start();
        _2_ImageResizer_Runnable imageResizer_runnable2 = new _2_ImageResizer_Runnable(files2, newWidth, dstFolder, start);
        new Thread(imageResizer_runnable2).start();
//        System.out.println("Duration: " + (System.currentTimeMillis() - start));
        new Thread(()->{
           for (int i = 0; i<=1000000; i++)
               System.out.println(i);
        }).start();
    }

}
