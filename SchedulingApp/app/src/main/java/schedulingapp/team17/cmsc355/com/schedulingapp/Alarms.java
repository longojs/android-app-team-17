package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TimePicker;
import android.widget.Toast;

import java.util.Calendar;

public class Alarms extends AppCompatActivity {

    Button btnSetCD;
    EditText timeCD;
    TimePicker timePicker;
    Button btnSetAlTP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alarms);

        //MAP COUNTDOWN ALARM  BUTTON AND TIMPICKER
        btnSetCD = (Button) findViewById(R.id.alarmCD);
        timeCD = (EditText) findViewById(R.id.alarmInputCD);

        //MAP REGULAR ALARM BUTTON AND TIMEPICKER
        btnSetAlTP = (Button) findViewById(R.id.btnAlarmTP);
        timePicker = (TimePicker) findViewById(R.id.timePicker);

        //COUNTDOWN BUTTON
        btnSetCD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int time = Integer.parseInt(timeCD.getText().toString());
                Intent in = new Intent(Alarms.this, AlarmReciever.class);
                PendingIntent penInt = PendingIntent.getBroadcast(getApplicationContext(), 0, in, 0);
                AlarmManager al = (AlarmManager) getSystemService(ALARM_SERVICE);
                al.set(AlarmManager.RTC_WAKEUP, System.currentTimeMillis() + (time * 1000), penInt);
            }
        });

        //REGULAR ALARM
        btnSetAlTP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //WE use the calendar to put into form the info
                //to use alarm manager
                Calendar calendar = Calendar.getInstance();
                //We use the if, just incase the tiem given is invalid
                if (Build.VERSION.SDK_INT >= 23) {
                    calendar.set(
                            //Fist we use the calendar for the day time and so on
                            //so yeah, at this, point this can only be daily
                            calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH),
                            //and now fromt he time picker
                            timePicker.getHour(),
                            timePicker.getMinute(),
                            0);
                } else {
                    calendar.set(
                            //Fist we use the calendar for the day time and so on
                            //so yeah, at this, point this can only be daily
                            calendar.get(Calendar.YEAR),
                            calendar.get(Calendar.MONTH),
                            calendar.get(Calendar.DAY_OF_MONTH),
                            //and now from he time picker
                            timePicker.getCurrentHour(),
                            timePicker.getCurrentMinute(),
                            59);
                }
                setAlarm(calendar.getTimeInMillis());
            }


        });
    }

    //This goes here to be outside of the oncreate
    //THANK GOD FOR THE ALARM MANAGER!!!
    private void setAlarm(long timeInMillis) {
        AlarmManager alarm = (AlarmManager)getSystemService(Context.ALARM_SERVICE);
        Intent inte = new Intent(Alarms.this, AlarmReciever.class);

        //Not very sure how this works
        PendingIntent penInt = PendingIntent.getBroadcast(this, 0, inte, 0);

        //Just so it can berepeated every day
        alarm.setRepeating(AlarmManager.RTC, timeInMillis, AlarmManager.INTERVAL_DAY, penInt);

        Toast.makeText(this,"Alarm set", Toast.LENGTH_LONG).show();
    }

}
