package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    View view;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);


        view = this.getWindow().getDecorView();
        //view.setBackgroundResource(R.color.blue);



        //Find a Time Button
        Button buttonFindTime = (Button) findViewById(R.id.btnFindTime); // Instantiates button object and casts using XML button ID

        buttonFindTime.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                Intent openFindTime = new Intent(HomeScreen.this, FindTime.class); //Intent object to open main screen
                startActivity(openFindTime);
            }
        });


        //Messages Button
        Button buttonMessages = (Button) findViewById(R.id.btnMessages); // Instantiates button object and casts using XML button ID

        buttonMessages.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openMessages = new Intent(HomeScreen.this, MainActivityChatApp.class); //Intent object to open main screen
                startActivity(openMessages);
            }
        });


        //Profile Button
        Button profile = (Button) findViewById(R.id.btnProfile); // Instantiates button object and casts using XML button ID

        profile.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openProfileEditor = new Intent(HomeScreen.this, ProfileEditor.class);//Intent object to open main screen
                startActivity(openProfileEditor);
            }
        });


        //Preferences Button for Preferred Meeting time
        Button buttonPreferences = (Button) findViewById(R.id.btnPreferences); // Instantiates button object and casts using XML button ID

        buttonPreferences.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openPreferredTime = new Intent(HomeScreen.this, MeetingTimes.class); //Intent object to open main screen
                startActivity(openPreferredTime);
            }
        });


        //Calendar Button
        Button buttonCalendar = (Button) findViewById(R.id.btnCalendar); // Instantiates button object and casts using XML button ID
        buttonCalendar.setOnClickListener(new View.OnClickListener() { //Button click method

            public void onClick(View view) {
                Intent openCalendar = new Intent(HomeScreen.this, Calendar.class); //Intent object to open main screen
                startActivity(openCalendar);
            }
        });


        //Directory Button
        Button buttonDirectory = (Button) findViewById(R.id.btnDirectory); // Instantiates button object and casts using XML button ID
        buttonDirectory.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openDirectory = new Intent(HomeScreen.this, Directory.class); //Intent object to open main screen
                startActivity(openDirectory);
            }
        });


        //Alarms Button
        Button buttonAlarms = (Button) findViewById(R.id.btnAlarms); // Instantiates button object and casts using XML button ID
        buttonAlarms.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openAlarms = new Intent(HomeScreen.this, Alarms.class); //Intent object to open main screen
                startActivity(openAlarms);
            }
        });


        //Settings Button
        Button buttonSettings = (Button) findViewById(R.id.btnSettings); // Instantiates button object and casts using XML button ID
        buttonSettings.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openSettings = new Intent(HomeScreen.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });

    }

    public void goRed(View temp) {
        view.setBackgroundResource(R.color.red);

    }

    public void goBlue(View temp) {
        view.setBackgroundResource(R.color.blue);

    }

    public void goTeal(View temp) {
        view.setBackgroundResource(R.color.teal);

    }

    public void goPurple(View temp) {
        view.setBackgroundResource(R.color.purple);

    }

    public void goNightMode(View view) {
        view.setBackgroundResource(R.color.nightmode);

    }
}
