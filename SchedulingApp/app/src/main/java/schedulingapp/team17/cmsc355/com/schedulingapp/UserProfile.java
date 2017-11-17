package schedulingapp.team17.cmsc355.com.schedulingapp;

import java.util.ArrayList;

/**
 * Created by josephlongo on 10/18/17.
 */

public class UserProfile extends UserEvents {
    private String userName;
    private String userEmail;
    private ArrayList<UserEvents> eventArray = new ArrayList<UserEvents>();

    public UserProfile(String name, String email) {
        userName = name;
        userEmail = email;
    }

    public UserProfile() {
    }

    public String getName() {
        return userName;
    }

    public void setName(String name) {
        userName = name;
    }

    public String getEmail() {
        return userEmail;
    }

    public void setEmail(String email) {
        userEmail = email;
    }

    public void addEvent(String startTime, String endTime, String day) {
        UserEvents newEvent = new UserEvents(startTime, day, endTime);

        eventArray.add(newEvent);
    }
}


