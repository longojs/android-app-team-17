package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ProfileEditor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_editor);

        //Bundle extras = getIntent().getExtras();

        //UserProfile mainUser = new UserProfile();              //block of code gets uncommented in interation 3, does not work yet.

        //mainUser.setName(extras.getString("Name"));
        // mainUser.setEmail(extras.getString("Email"));
        // mainUser.addEvent(extras.getString("StartTime"), extras.getString("Day"), extras.getString("EndTime"));
    }

    public void createProfile(View view) {
        startActivity(new Intent(ProfileEditor.this, ProfileCreator.class));
    }

    public void editProfile(View view) {
        startActivity(new Intent(ProfileEditor.this, InfoEditor.class));
    }

    public void designSchedule(View view) {
        startActivity(new Intent(ProfileEditor.this, ScheduleCreator.class));
    }

    public void editSchedule(View view) {
        startActivity(new Intent(ProfileEditor.this, ScheduleEditor.class));
    }

    public void returnToHome(View view) {
        startActivity(new Intent(ProfileEditor.this, HomeScreen.class));
    }







}
