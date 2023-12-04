/**
 * Stores the data of a Point on the map.
 * @author Ryan Lambe
 */
public class Point {

    /**
     * The x coordinate of the point on the map.
     */
    private float x;

    /**
     * The y coordinate of the point on the map.
     */
    private float y;

    /**
     * The name of the Point.
     */
    private String name;

    /**
     * The path to the image for the icon of the Point.
     */
    private String iconImg;

    /**
     * The number of the floor that the Point is on.
     */
    private int floor;

    /**
     * The name of the building that the Point is in.
     */
    private String building;

    /**
     * Whether the Point has been marked as a favourite or not.
     */
    private boolean favourite;

    /**
     * Whether the Point is a built-in Point or a user created Point.
     */
    private boolean builtIn;


    /**
     * The constructor requires parameters for all the instance variables.
     *
     * @param x The x coordinate of the point on the map.
     * @param y The y coordinate of the point on the map.
     * @param name The name of the Point.
     * @param iconImg The path to the image for the icon of the Point.
     * @param floor The number of the floor that the Point is on.
     * @param building The name of the building that the Point is in.
     * @param favourite Whether the Point has been marked as a favourite or not.
     * @param builtIn Whether the Point is a built-in Point or a user created Point.
     */
    public Point(float x, float y, String name, String iconImg, int floor, String building, boolean favourite, boolean builtIn) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.iconImg = iconImg;
        this.floor = floor;
        this.building = building;
        this.favourite = favourite;
        this.builtIn = builtIn;
    }


    /**
     * Update is sets the values of the parameters, other than the constructor.
     *
     * @param x The x coordinate of the point on the map.
     * @param y The y coordinate of the point on the map.
     * @param name The name of the Point.
     * @param iconImg The path to the image for the icon of the Point.
     * @param floor The number of the floor that the Point is on.
     * @param building The name of the building that the Point is in.
     * @param favourite Whether the Point has been marked as a favourite or not.
     * @param builtIn Whether the Point is a built-in Point or a user created Point.
     */
    public void Update(float x, float y, String name, String iconImg, int floor, String building, boolean favourite, boolean builtIn) {
        this.x = x;
        this.y = y;
        this.name = name;
        this.iconImg = iconImg;
        this.floor = floor;
        this.building = building;
        this.favourite = favourite;
        this.builtIn = builtIn;
    }

    /**
     * Gets the x coordinate of the point on the map.
     * @return the x coordinate of the point on the map.
     */
    public float getX() {
        return x;
    }

    /**
     * Gets the y coordinate of the point on the map.
     * @return the y coordinate of the point on the map.
     */
    public float getY() {
        return y;
    }

    /**
     * Gets the name of the Point.
     * @return the name of the Point.
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the path to the image for the icon of the Point.
     * @return the path to the image for the icon of the Point.
     */
    public String getIconImg() {
        return iconImg;
    }

    /**
     * Gets the number of the floor that the Point is on.
     * @return the number of the floor that the Point is on.
     */
    public int getFloor() {
        return floor;
    }

    /**
     * Gets the name of the building that the Point is in.
     * @return the name of the building that the Point is in.
     */
    public String getBuilding() {
        return building;
    }

    /**
     * Checks if the Point has been marked as a favourite.
     * @return true if the Point has been marked as favourite.
     */
    public boolean isFavourite() {
        return favourite;
    }

    /**
     * Checks if the Point is a built-in Point.
     * @return true if the Point is a built-in Point.
     */
    public boolean isBuiltIn() {
        return builtIn;
    }

    /**
     * sets whether the Point has been marked as a favourite or not.
     * @param value whether the Point has been marked as a favourite or not.
     */
    public void favourite(boolean value){
        favourite = value;
    }

    /**
     * sets the name of the point.
     * @param newName the new name of the point to be set.
     */
    public void setName(String newName){
        name = newName;
    }

    /**
     * sets the icon of the point.
     * @param iconImg the new icon of the point to be set.
     */
    public void setIcon(String iconImg){
        this.iconImg = iconImg;
    }
}
