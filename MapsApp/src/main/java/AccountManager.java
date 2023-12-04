import java.util.ArrayList;

/**
 * Manages user accounts and handles their points.
 * @author Ryan Lambe
 */
public class AccountManager {

    /**
     * the username of the active user, used to save data.
     */
    private static String activeUser;

    /**
     * the active points of the user that could be drawn, includes both user points and built in.
     */
    private static ArrayList<Point> activePoints = new ArrayList<>();

    /**
     * searches for valid user file and attempts to read it, if successful the login is valid.
     * @param username the username to be logged in with.
     * @param password the password of the user to be logged in.
     * @return true if successful, false otherwise.
     */
    public static boolean LogIn(String username, String password){
        return true;
    }

    /**
     * creates new empty user file for the username and password entered.
     * @param username the username of the user account to be created.
     * @param password the username of the user account to be created.
     * @return true if successfully created user file.
     */
    public static boolean SignUp(String username, String password){
        return true;
    }

    /**
     * logs out of the current account and saves the user created points.
     */
    public static void LogOut(){

    }

    /**
     * creates new point that can be saved and accessed by the map.
     * @param x the x coordinate of the point.
     * @param y the y coordinate of the point.
     * @param name the name of the point.
     * @param iconImg the points image.
     */
    public static void CreatePoint(float x, float y, String name, String iconImg){
        activePoints.add(new Point(x, y, name, iconImg, 0, "building", false, false));//todo: get floor and building
    }

    /**
     * gets the points to be displayed based on the specified context.
     * @param search the points returned must all contain this search term.
     * @param onlyFavourites if true, all points returned must be favourited.
     * @param floor the points returned must all be on the specified floor.
     * @param building the points returned must all be from the specified building.
     * @param iconTypes the points returned must all have the specified icons.
     * @return an array of points the fit the specified conditions.
     */
    public static Point[] GetPoints(String search, boolean onlyFavourites, int floor, String building, String[] iconTypes){

        ArrayList<Point> out = new ArrayList<>();

        for(int i = 0; i < activePoints.size(); i++){

            //check building
            if(!activePoints.get(i).getBuilding().equals(building))
                continue;

            //check floor
            if(activePoints.get(i).getFloor() != floor)
                continue;

            //check search
            if(!activePoints.get(i).getName().contains(search))
                continue;

            //check favourites
            if(onlyFavourites && (!activePoints.get(i).isFavourite()))
                continue;

            //check icons
            for (int j = 0; j < iconTypes.length; j++){

                if(activePoints.get(i).getIconImg().equals(iconTypes[j])){

                    //add to list
                    out.add(activePoints.get(i));
                    break;
                }
            }
        }

        //return array
        Point[] arr = new Point[out.size()];
        return out.toArray(arr);
    }

    /**
     * gets the point at the specified index position.
     * @param index the location of the point to be retrieved.
     * @return the point at the specified index.
     * @throws IndexOutOfBoundsException if there is no point at the index specified.
     */
    public static Point GetPoint(int index) throws IndexOutOfBoundsException{
        return activePoints.get(index);
    }

    /**
     * marks the favourite value of the point at the specified index as the input value.
     * @param value the value of the favourite for the point.
     * @param index the location of the point.
     * @throws IndexOutOfBoundsException if there is no point at the index specified.
     */
    public static void FavouritePoint(boolean value, int index) throws IndexOutOfBoundsException{
        activePoints.get(index).favourite(value);
    }

    /**
     * removes the point at the specified index.
     * @param index the location of the point to be removed.
     * @throws IndexOutOfBoundsException if there is no point at the index specified.
     */
    public static void RemovePoint(int index) throws IndexOutOfBoundsException{
        activePoints.remove(index);
    }

    /**
     * modifies the values of a point.
     * @param index the location of the point to be modified.
     * @param name the new name of the point to be modified.
     * @param iconImg the new icon of the point to be modified.
     * @throws IndexOutOfBoundsException if there is no point at the index specified.
     */
    public static void ModifyPoint(int index, String name, String iconImg) throws IndexOutOfBoundsException{
        activePoints.get(index).setName(name);
        activePoints.get(index).setIcon(iconImg);
    }
}
