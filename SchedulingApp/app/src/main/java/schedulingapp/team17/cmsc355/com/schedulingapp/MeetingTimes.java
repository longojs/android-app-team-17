package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MeetingTimes extends AppCompatActivity {
    String amount = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meeting_times);

        Button but1 = (Button) findViewById(R.id.button1);
        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "8:00 a.m", Toast.LENGTH_SHORT).show();
                amount += "8:00 a.m";



                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but2 = (Button) findViewById(R.id.button2);
        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "9:00 a.m", Toast.LENGTH_SHORT).show();
                amount += "9:00 a.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but3 = (Button) findViewById(R.id.button3);
        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "10:00 a.m", Toast.LENGTH_SHORT).show();
                amount += "10:00 a.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but4 = (Button) findViewById(R.id.button4);
        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "11:00 a.m", Toast.LENGTH_SHORT).show();
                amount += "11:00 a.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but5 = (Button) findViewById(R.id.button5);
        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "12:00 a.m", Toast.LENGTH_SHORT).show();
                amount += "12:00 a.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but6 = (Button) findViewById(R.id.button6);
        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "1:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "1:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but7 = (Button) findViewById(R.id.button7);
        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "2:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "2:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but8 = (Button) findViewById(R.id.button8);
        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "3:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "3:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but9 = (Button) findViewById(R.id.button9);
        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "4:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "4:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but10 = (Button) findViewById(R.id.button10);
        but10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "5:00 p.m"", Toast.LENGTH_SHORT).show();
                amount += "5:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but11 = (Button) findViewById(R.id.button11);
        but11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "6:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "6:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but12 = (Button) findViewById(R.id.button12);
        but12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "7:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "7:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
        Button but13 = (Button) findViewById(R.id.button13);
        but13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "8:00 p.m", Toast.LENGTH_SHORT).show();
                amount += "8:00 p.m";

                Intent intent = new Intent(MeetingTimes.this, PreferredMeetingLocation.class);
                startActivity(intent);
            }
        })
        ;
    }
}