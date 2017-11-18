package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Settings extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        //Button from Settings to Time Differences
        Button buttonSetToTimeDiff = (Button) findViewById(R.id.btnTimeDiff); // Instantiates button object and casts using XML button ID

        buttonSetToTimeDiff.setOnClickListener(new View.OnClickListener() { // Button click method

            public void onClick(View view) {
                Intent openTimeDifferences = new Intent(Settings.this, TimeDifferences.class); //Intent object to open main screen
                startActivity(openTimeDifferences);
            }
        });

    }
}
