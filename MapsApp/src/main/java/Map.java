import java.util.*;
import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import javax.swing.JPanel;
import java.awt.Graphics;
import java.io.*;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 * Holds the data for the map being displayed to the user
 * @author Trevor Seanan
 */
public class Map {
    /** The x coordinate of the map */
    private float mapX;
    
    /** The y coordinate of the map */
    private float mapY;
    
    /** The scale (zoom) of the map */
    private float mapScale;
    
    /** The image of the map (the floor being displayed) */
    private ImagePanel imgPanel;
    
    /** The array of icons being displayed of the map */
    private ArrayList<Icon> icons;
    
    /** The constructor of the map, to initialize an instance of a map. 
     * Since the sidebar handles the the functionality of the map, the 
     * constructor takes no parameters.
     */
    public Map() {
        this.mapX = 0; // Placeholder
        this.mapY = 0; // Placeholder
        this.mapScale = 1;
        this.imgPanel = new ImagePanel();
        this.icons = new ArrayList<Icon>();
    }
    
    /** This function creates an icon given a point. This is a helper function for the buildIcons method
     * 
     * @param point the point needed to be made an icon
     * @return the newly created icon
     */
    public Icon createIcon(Point point){
        // TODO
        // Create image
        String building = point.getBuilding(); // Get building
        String floor = String.valueOf(point.getFloor()); // Get floor in string format
        String imgPath = building + "-" + floor;
        ImagePanel iconImg = new ImagePanel();
        try {
            iconImg.UpdateImage(imgPath);
        } catch (IOException e) {
            System.out.println("IO Exception");
            return null;
        }
        Icon newIcon = new Icon(point.getX(), point.getY(), iconImg);
        return newIcon;
    }
    
    /** Updates the icons displayed */
    public void udpdateIcons(Point[] points) {
        // TODO
        // Using buildIcons sacrifices storage but optimizes runtime for refreshing points
        buildIcons(points);
    }
    
        /** This function builds the icons that will be displayed on the map from the list of points filtered by the sidebar
     * 
     * @param points The points needed to be displayed
     */
    public void buildIcons(Point[] points) {
        // Iterate over the array, create icon, append icon to icon
        for (Point point : points) {
            Icon newIcon = this.createIcon(point);
            icons.add(newIcon);
        }
    }
    
    /** This function builds a floor map. All parameters must be specified. If there is no floor (example, the user selects a building from the homepage)
     * it is best practice to set the floor to 1.
     * 
     * @param building The building the user is viewing
     * @param floor the floor of the building that will be displayed
     */
    public void buildMap(String building, int floor, Point[] points) {
        // TODO
        String imgPath = building + "-" + floor;
        try {
            this.imgPanel.UpdateImage(imgPath);
        } catch (IOException e) {
            System.out.println("Invalid Image Path");
        }
        buildIcons(points);
        
    }
    
    /** Translate moves the map based on the user input (when a user clicks and 
     * drags).
     * The mouse manager specifies how much the x and y are too be translated.
     *  
     * @param x translation on the x-axis
     * @param y translation on the y-axis
     */
    public void translate(float x, float y) {
        // TODO
    }
    
    /** Given an x and y out of bounds of the display, clamps them to be within 
     * bounds.
     * 
     * @param x x coordinate of attempted translation
     * @param y y coordinate of attempted translation
     * @return the clamped coordinates
     */
    public int[] clamp(float x, float y) {
        // TODO
        int[] coordinates = {0, 1};
        return coordinates;
    }
    
    /** Scales the map based on the user input (when a user scrolls in or out)
     * The mouse manager specifies how much the scale needs to be changed
     * 
     * @param scale the amount the scale needs to be changed by
     */
    public void scale(float scale){
        // TODO
    }
    
    /** Transforms the map based on either a translation or scale value
     * 
     */
    public void transform() {
        // TODO
    }
    
    public void ScreenToMapSpace() {
        // TODO
    }
    
    public void displayMap() {
        // TODO
    }
    
    
}
    
    
