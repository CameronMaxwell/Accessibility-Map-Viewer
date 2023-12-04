import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.*;

/**
 * An extension to JPanel that allows an image to be shown, provided an image path
 * @author Ryan Lambe
 */
public class ImagePanel extends JPanel {

    private BufferedImage img;
    
    /** Creates an image panel without a set image path */
    public ImagePanel() {
        img = null;
    }

    public ImagePanel(String imgPath) throws IOException{
        try {
        img = ImageIO.read(new File(imgPath));
        } catch (Exception e) {
            throw new IOException("Invalid image path");
        }
    }

    public void UpdateImage(String imgPath) throws IOException{
        try {
            img = ImageIO.read(new File(imgPath));   
        } catch (Exception e) {
            throw new IOException("Invalid image path");
        }
    }

    /*  TODO
        protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(img, 0, 0, this);
    }
    */
}
