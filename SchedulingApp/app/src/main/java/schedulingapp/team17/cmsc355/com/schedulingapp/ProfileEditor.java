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
    }

public void createProfile(View view){
    startActivity(new Intent(ProfileEditor.this, ProfileCreator.class));
}

public void editProfile(View view){
    startActivity(new Intent(ProfileEditor.this, InfoEditor.class));
}

public void designSchedule(View view){
    startActivity(new Intent(ProfileEditor.this, ScheduleCreator.class));
}

public void editSchedule(View view){
    startActivity(new Intent(ProfileEditor.this, ScheduleEditor.class));
}

public void returnToHome(View view){
    startActivity(new Intent(ProfileEditor.this, HomeScreen.class));
}



}
