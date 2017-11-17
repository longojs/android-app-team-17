package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileCreator extends AppCompatActivity {
<<<<<<< HEAD

    String name;
    String email;
=======
    View view;
    String Name, Email;
>>>>>>> 389dddcc0f8b039e3faab81cc086a5ee45827896

    EditText nameInput;
    EditText emailInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creator);
        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);

<<<<<<< HEAD
        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                UserProfile profile = new UserProfile(name, email);
                Intent userData = new Intent(ProfileCreator.this, ProfileEditor.class);
                userData.putExtra("Name", name);
                userData.putExtra("Email", email);
                startActivity(userData);
=======
        view = this.getWindow().getDecorView();

        submitButton= (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = nameInput.getText().toString();
                Email = emailInput.getText().toString();
                UserProfile profile = new UserProfile(Name, Email);
                startActivity(new Intent(ProfileCreator.this, ProfileEditor.class));
>>>>>>> 389dddcc0f8b039e3faab81cc086a5ee45827896
            }
        });

    }

    public void goNightMode (View v)
    {
        view.setBackgroundResource(R.color.nightmode);
    }

}
