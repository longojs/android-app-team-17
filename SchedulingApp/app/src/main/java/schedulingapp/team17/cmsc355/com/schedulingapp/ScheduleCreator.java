package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ScheduleCreator extends AppCompatActivity {

    String day;
    String startTime;
    String endTime;

    EditText dayInput;
    EditText startTimeInput;
    EditText endTimeInput;

    Button submitDay;
    Button submitStartTime;
    Button submitEndTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_creator);
        dayInput = (EditText) findViewById(R.id.dayInput);
        startTimeInput = (EditText) findViewById(R.id.startTimeInput);
        endTimeInput = (EditText) findViewById(R.id.endTimeInput);

        submitDay = (Button) findViewById(R.id.daySubmit);
        submitStartTime = (Button) findViewById(R.id.startTimeSubmit);
        submitEndTime = (Button) findViewById(R.id.endTimeSubmit);

        submitDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                day = dayInput.getText().toString();
            }
        });
        submitStartTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startTime = startTimeInput.getText().toString();
            }
        });
        submitEndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                endTime = endTimeInput.getText().toString();
            }
        });

    }




    public void saveAndCreateNew(View view) {
        startActivity(new Intent(ScheduleCreator.this, ScheduleCreator.class));
    }
    //currently operates correctly, final method will save information decided above into an event class

    public void saveAndLeaveScreen(View view) {
        Intent userData = new Intent(ScheduleCreator.this, ProfileEditor.class);

        userData.putExtra("Day", day);
        userData.putExtra("StartTime", startTime);
        userData.putExtra("EndTime", endTime);

        startActivity(userData);
    }
    //currently operates correctly, final method will save information decided above into an event class


}
