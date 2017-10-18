package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreferredMeetingLocation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferred_meeting_location);

        Button but20 = (Button) findViewById(R.id.button);
        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredMeetingLocation.this, PreferredDay.class);
                startActivity(intent);

            }
        })
        ;
        Button but21 = (Button) findViewById(R.id.button15);
        but21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredMeetingLocation.this, PreferredDay.class);
                startActivity(intent);
            }
        })
        ;
        Button but22 = (Button) findViewById(R.id.button16);
        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredMeetingLocation.this, PreferredDay.class);
                startActivity(intent);
            }
        })
        ;
        Button but23 = (Button) findViewById(R.id.button17);
        but20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredMeetingLocation.this, PreferredDay.class);
                startActivity(intent);
            }
        })
        ;
    }
}








