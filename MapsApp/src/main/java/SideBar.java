import java.util.*;
/**
 * Manages filters and searching of Points of Interest
 * 
 * Filtered list of Points of Interest is updated via @refresh method. 
 * @author Kyven Tran
 */

public class SideBar {

    /**
     * The default value in the Room Filter combo box
     */
    private final String DEFAULT_ROOM_FILTER_IDENTIFIER = "Room Type";
    /**
     * The list of all different room types. The room filter is set to this by default.
     */
    private final String[] DEFAULT_ROOM_FILTER = {"Classroom", "Kitchen", "Lab", "Library", "Mechanical Room", "Men's Washroom", "Office", "Servery", "Server Room", "Women's Washroom"};
    /**
     * If the user has enabled the Favourites filter
     */
    private Boolean favourited;
    /**
     * List of active room types. If the user filters by a room type, it will hold only that room type. 
     */
    private String[] roomTypes;
    /**
     * Name searched for by the user. 
     */
    private String search;
    /**
     * List of all points that apply to the current filters
     */
    private Point[] filteredPoints;
    /**
     * Current floor number of building.
     */
    private int floor;
    /**
     * Name of building
     */
    private String building;

    
    /**
     * SideBar constructor. Creates a Sidebar object. 
     * 
     * @param building the building name
     */
    SideBar(String building) {
        favourited = false;
        floor = 1;
        this.building = building;
        roomTypes = DEFAULT_ROOM_FILTER;
        search = "";
        //filteredPoints = AccountManager.GetPoints(search, favourited, floor, this.building, roomTypes);
        Point testPoint1 = new Point(0, 0, "Point A", "Classroom", 1, "Middlesex College", true, true);
        Point testPoint2 = new Point(0, 0, "Point B", "Classroom", 1, "Thompson Engineering Building", true, true);
        
        Point[] testPoints = {testPoint1, testPoint2};
        filteredPoints = testPoints;
    }

    /**
     * Retrieves new list of points according to current applied filters.
     */
    public void refresh() {
        filteredPoints = AccountManager.GetPoints(search, favourited, floor, building, roomTypes);
    }
    
    /**
     * Updates search to new search term
     * @param name New name to search for.
     */
    public Point[] searchPOI(String name) {
        
        if (name == "") {
            return filteredPoints;
        }
        ArrayList<Point> points = new ArrayList<Point>();
        for (int i = 0; i < filteredPoints.length; i++) {
            if (filteredPoints[i].getName().contains(name) == true) {
                points.add(filteredPoints[i]);
            }
        }
        // search = name;
        return points.toArray(Point[]::new);
    }
    
    /**
     * Updates favourited
     * @param on New value of favourited
     */
    public void enableOnlyFavourites(Boolean on) {
        if (on == true) {
            favourited = true;
        } else {
            favourited = false;
        }
    }

    /**
     * Updates floor to new floor number
     * @param floorNum New floor number
     */
    public void enableOnlyFloor(int floorNum) {
        floor = floorNum;
    }
    
    /**
     * Updates roomTypes filter to new room type
     * @param icon Room type to filter by. 
     */
    public void enableOnlyIcon(String icon) {
        if (icon.compareTo(DEFAULT_ROOM_FILTER_IDENTIFIER) == 0) {
            roomTypes = DEFAULT_ROOM_FILTER;
        } else {
            String[] newRoomFilter = new String[1];
            newRoomFilter[0] = icon;
            roomTypes = newRoomFilter;
        }
    }
    
    public void setBuilding(String building) {
        favourited = false;
        floor = 1;
        this.building = building;
        roomTypes = DEFAULT_ROOM_FILTER;
        search = "";
        filteredPoints = AccountManager.GetPoints(search, favourited, floor, this.building, roomTypes);
    }
    
    public int getFloor() {
        return floor;
    }
    
    public String getBuilding() {
        return building;
    }
    
    /**
     * Getter for filtered points
     * @return list of filtered points
     */
    public Point[] getPoints() {
        return filteredPoints;
    }
    
}

