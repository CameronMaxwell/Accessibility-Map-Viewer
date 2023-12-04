import java.awt.event.*;
import javax.swing.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * An icon represents a point on the map. It is the visual aspect of a point
 * @author Trevor
 */
public class Icon {
    /** The x coordinate of the icon */
    public float x;
    
    /** The y coordinate of the icon */
    public float y;
    
    /** The name of the point represented by the icon */
    public String name;
    
    /** The image panel for the icon image */
    public JLabel imgLabel;
    public ImagePanel image;
    
    /** The scale of the image being displayed. By default this value is 1 */
    public float scale;
    
    /** The constructor for an icon
     * @param x the default x coordinate of the icon
     * @param y the default y coordinate of the icon
     * @param imagePanel the image of the icon
     * @param imgLabel the image of the icon
     */
    public Icon(float x, float y, ImagePanel imagePanel) {
        this.x = x;
        this.y = y;
        this.image = imagePanel;
        this.scale = 1;
        this.imgLabel = new JLabel();
    }
    
    /** Transforms a point
     * @param scale the scale by which an icon is transformed 
     */
    public void transform(float scale) {
        this.scale = scale;
    }
    
    /** Checks if the user is hovering over the icon
     * 
     * @param event
     */
    public void mouseEntered(MouseEvent event) {
        // TODO
    }
    
    /** Checks when the user has exited the icon
     *
     * @param event 
     */
    public void mouseExited(MouseEvent event) {
        // TODO
    }
}
