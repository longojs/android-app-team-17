package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeDiff2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_diff2);


        //(Go) Back button from Time Differences to Settings
        Button buttonTimeDiffToSet = (Button) findViewById(R.id.goBack); // Instantiates button object and casts using XML button ID

        buttonTimeDiffToSet.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openSettings = new Intent(TimeDiff2.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });





        //Clicking on LINT time zone will take you back to settings
        Button lint = (Button) findViewById(R.id.btnLINT); // Instantiates button object and casts using XML button ID

        lint.setOnClickListener(new View.OnClickListener() { // Button click method
            public void onClick(View view) {
                Intent openSettings = new Intent(TimeDiff2.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });

        //Clicking on CHADT time zone will take you back to settings
        Button chadt = (Button) findViewById(R.id.btnCHADT); // Instantiates button object and casts using XML button ID

        chadt.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openSettings = new Intent(TimeDiff2.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });

        //Clicking on LINT time zone will take you back to settings
        Button nzdt = (Button) findViewById(R.id.btnNZDT); // Instantiates button object and casts using XML button ID

        nzdt.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openSettings = new Intent(TimeDiff2.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });

        //Clicking on ANAT time zone will take you back to settings
        Button anat = (Button) findViewById(R.id.btnANAT); // Instantiates button object and casts using XML button ID

        anat.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {

                Intent openSettings = new Intent(TimeDiff2.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });

    }
}
