import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;

public class _hw_1 implements Runnable{

    private File[] files;
    private int newWidth;
    private String dstFolder;
    private long start;

    public _hw_1(File[] files, int newWidth, String dstFolder, long start) {
        this.files = files;
        this.newWidth = newWidth;
        this.dstFolder = dstFolder;
        this.start = start;
    }



    public void run(){
        try {

            for (File file : files) {
                BufferedImage bufferedImage = ImageIO.read(file);
                if (bufferedImage == null)
                    continue;
                int newHeight = (int) Math.round(
                        bufferedImage.getHeight() / (bufferedImage.getHeight() / (double) newWidth));
                BufferedImage newImage = new BufferedImage(
                        newWidth, newHeight, BufferedImage.TYPE_INT_RGB);

                int widthStep = bufferedImage.getWidth() / newWidth;
                int heightStep = bufferedImage.getHeight() / newHeight;

                for (int x = 0; x < newWidth; x++) {
                    for (int y = 0; y < newHeight; y++) {
                        int rgb = bufferedImage.getRGB(x * widthStep, y * heightStep);
                        newImage.setRGB(x, y, rgb);
                    }
                }

                File newFile = new File(dstFolder + "/" + file.getName());
                ImageIO.write(newImage, "jpg", newFile);


            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
        System.out.println("\t\t\tDuration thread: " + (System.currentTimeMillis() - start));
    }
}


