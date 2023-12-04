import java.awt.event.*;

/**
 * Handles mouse input and calls on the correct functions depending on context
 * @author Ryan Lambe
 */
public class MouseManager extends MouseAdapter {

    private static MouseManager main = null;
    private static boolean hoveringIcon = false;
    private static int iconIndex = -1;


    MouseManager(){
        main = this;
    }

    public static void HoverIcon(float x, float y, boolean hover){

    }

    public void mousePressed(MouseEvent event){
        super.mousePressed(event);

    }

    public void mouseReleased(MouseEvent event){
        super.mouseReleased(event);

    }

    public void mouseDragged(MouseEvent event){
        super.mouseDragged(event);

    }

    public void mouseWheelMoved(MouseWheelEvent event){
        super.mouseWheelMoved(event);

    }
}
