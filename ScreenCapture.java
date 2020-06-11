import java.awt.*;
import java.io.File;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;

public class ScreenCapture {
    public static void main(String [] ak){
        try{
            Dimension size = Toolkit.getDefaultToolkit().getScreenSize();
            Robot robot = new Robot();
            BufferedImage img = robot.createScreenCapture(new Rectangle(size));
            File save_path=new File("screen.jpg");
            ImageIO.write(img, "JPG", save_path);
        }
        catch(Exception e){
            System.out.print(e);
        }
    }
}