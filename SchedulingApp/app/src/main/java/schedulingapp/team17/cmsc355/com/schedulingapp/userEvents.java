package schedulingapp.team17.cmsc355.com.schedulingapp;

/**
 * Created by josephlongo on 10/18/17.
 */

public class userEvents {
    private String startTime;
    private String day;
    private String endTime;

    public userEvents(String sTime, String theDay, String eTime){
        startTime=sTime;
        day=theDay;
        endTime=eTime;
    }

    public userEvents(){

    }

    public String getStartTime(){
        return startTime;
    }

    public void setStartTime(String set){
        startTime=set;
    }

    public String getDay(){
        return day;
    }

    public void setDay(String set){
        day=set;
    }

    public String getEndTime(){
        return endTime;
    }

    public void setEndTime(String set){
        endTime=set;
    }

}


