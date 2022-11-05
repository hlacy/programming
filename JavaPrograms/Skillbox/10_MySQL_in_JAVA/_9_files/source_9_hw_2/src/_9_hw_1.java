import java.io.File;

public class _9_hw_1 {

        public static long folderSize(File directory) {
            long length = 0;
            for (File file : directory.listFiles()) {
                if (file.isFile()){
                    length += file.length();
                    System.out.println(file.getName().toString());
                }

                else {
                    length += folderSize(file);
                    System.out.println(file.getName().toString());
                }
                }
            return length;
        }


}
