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


        Button profile = (Button) findViewById(R.id.btnProfile);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Intent openProfileCreator = new Intent(HomeScreen.this, ProfileCreator.class);
                startActivity(openProfileCreator);
            }
        });


    }
}


