package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileCreator extends AppCompatActivity {


    String name;
    String email;
    String password;
    View view;



    EditText nameInput;
    EditText emailInput;
    EditText passwordInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creator);
        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);

        //passwordInput = (EditText) findViewById(R.id.passwordInput);

        passwordInput = (EditText) findViewById(R.id.passwordInput);

        view = this.getWindow().getDecorView();
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {


            @Override
            public void onClick(View temp1) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                password = passwordInput.getText().toString();
                //UserProfile profile = new UserProfile(name, email);
                Intent userData = new Intent(ProfileCreator.this, ProfileEditor.class);
                //userData.putExtra("Name", name);
                //userData.putExtra("Email", email);
                startActivity(userData);

            }

        });

    }


}

