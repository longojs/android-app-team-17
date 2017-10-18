package schedulingapp.team17.cmsc355.com.schedulingapp;

/**
 * Created by josephlongo on 10/18/17.
 */

public class UserProfile {
    private String userName;
    private String userEmail;
    public UserProfile(String Name, String Email){
        userName=Name;
        userEmail=Email;
    }
    public UserProfile(){
    }

    public String getName(){
        return userName;
    }
    public void setName(String Name){
        userName=Name;
    }

    public String getEmail(){
        return userEmail;
    }

    public void setEmail(String Email){
        userEmail=Email;
    }
}
