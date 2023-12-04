/**
 * The UserData class will be used by AccountManager to make it easier to save the userdata as json.
 * @author Ryan Lambe
 */
public class UserData {

    /**
     * The username of the user whose data is to be saved.
     */
    public String username;

    /**
     * The Points created by the user whose data is to be saved.
     * This does not include built-in data unless the data being saved is only the built-in data.
     */
    public Point[] userPoints;

}
