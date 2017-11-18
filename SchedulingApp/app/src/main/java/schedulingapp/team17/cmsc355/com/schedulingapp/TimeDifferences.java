package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.preference.Preference;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class TimeDifferences extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_time_differences);


        //(Go) Back button from Time Differences to Settings
        Button buttonTimeDiffToSet = (Button) findViewById(R.id.btnTimeDiffToSet); // Instantiates button object and casts using XML button ID

        buttonTimeDiffToSet.setOnClickListener(new View.OnClickListener() // Button click method
        {
            public void onClick(View view)
            {
                Intent openSettings = new Intent(TimeDifferences.this, Settings.class); //Intent object to open main screen
                startActivity(openSettings);
            }
        });



    }
}
