package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class PreferredDay extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preferred_day);

        Button but30 = (Button) findViewById(R.id.button18);
        but30.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, PreferredDay.class);
                startActivity(intent);

            }
        })
        ;
        Button but31 = (Button) findViewById(R.id.button19);
        but31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, HomeScreen.class);
                startActivity(intent);

            }
        })
        ;
        Button but32 = (Button) findViewById(R.id.button20);
        but32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, HomeScreen.class);
                startActivity(intent);

            }
        })
        ;
        Button but33 = (Button) findViewById(R.id.button21);
        but33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, HomeScreen.class);
                startActivity(intent);

            }
        })
        ;
        Button but34 = (Button) findViewById(R.id.button22);
        but34.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, HomeScreen.class);
                startActivity(intent);

            }
        })
        ;
        Button but35 = (Button) findViewById(R.id.button23);
        but35.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, HomeScreen.class);
                startActivity(intent);

            }
        })
        ;
        Button but36 = (Button) findViewById(R.id.button24);
        but36.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(PreferredDay.this, HomeScreen.class);
                startActivity(intent);

            }
        })
        ;








    }
}
