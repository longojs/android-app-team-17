package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);

        Button butbut = (Button) findViewById(R.id.button14);
        butbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, MeetingTimes.class);
                startActivity(intent);
            }
        })
        ;

        Button butbut2 = (Button) findViewById(R.id.button27);
        butbut2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(HomeScreen.this, ProfileEditor.class);
                startActivity(intent);
            }
        })
        ;

   }
}
