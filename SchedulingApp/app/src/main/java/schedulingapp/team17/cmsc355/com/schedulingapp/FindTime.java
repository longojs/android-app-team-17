package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;

public class FindTime extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_time1);


        Button findTimeToHome  = (Button) findViewById(R.id.btnFindTimeToHome); // Instantiates button object and casts using XML button ID

        findTimeToHome.setOnClickListener(new View.OnClickListener() // Button click method
        {
            public void onClick(View view)
            {
                Intent openHomeScreen = new Intent(FindTime.this, HomeScreen.class); //Intent object to open main screen
                startActivity(openHomeScreen);
            }
        });

    }
}
