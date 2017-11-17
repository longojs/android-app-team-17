package schedulingapp.team17.cmsc355.com.schedulingapp;

/**
 * Created by josephlongo on 10/18/17.
 */

public class UserEvents {
    private String startTime;
    private String day;
    private String endTime;

    public UserEvents(String startTimes, String theDay, String endTimes) {
        startTime = startTimes;
        day = theDay;
        endTime = endTimes;
    }

    public UserEvents(){

    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String set) {
        startTime = set;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String set) {
        day = set;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String set) {
        endTime = set;
    }

}


