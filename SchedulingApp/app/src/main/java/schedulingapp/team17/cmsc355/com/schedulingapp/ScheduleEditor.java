package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ScheduleEditor extends AppCompatActivity {
    String day, startTime, endTime;

    EditText dayInput;
    EditText startTimeInput;
    EditText endTimeInput;

    Button submitDay;
    Button submitStartTime;
    Button submitEndTime;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_schedule_editor);
        dayInput = (EditText) findViewById(R.id.dayInput);
        startTimeInput= (EditText) findViewById(R.id.startTimeInput);
        endTimeInput= (EditText) findViewById(R.id.endTimeInput);

        submitDay= (Button) findViewById(R.id.dateSubmit);
        submitStartTime= (Button) findViewById(R.id.startTimeSubmit);
        submitEndTime= (Button) findViewById(R.id.endTimeSubmit);

        submitDay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                day=dayInput.getText().toString();
            }
        });
        submitStartTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
              startTime = startTimeInput.getText().toString();
            }
        });
        submitEndTime.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                endTime = endTimeInput.getText().toString();
            }
        });
    }






    public void saveAndReturn(View view){
        startActivity(new Intent(ScheduleEditor.this, ProfileEditor.class));
    }
    //currently operates correctly, final method will save information decided above into an event class

    public void deleteAndReturn(View view){
        startActivity(new Intent(ScheduleEditor.this, ProfileEditor.class));
    }
    //currently operates correctly, final method will save information decided above into an event class
}
