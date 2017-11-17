package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class ProfileCreator extends AppCompatActivity {
    View view;
    String Name, Email;

    EditText nameInput;
    EditText emailInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile_creator);
        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);

        view = this.getWindow().getDecorView();

        submitButton= (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Name = nameInput.getText().toString();
                Email = emailInput.getText().toString();
                UserProfile profile = new UserProfile(Name, Email);
                startActivity(new Intent(ProfileCreator.this, ProfileEditor.class));
            }
        });

    }

    public void goNightMode (View v)
    {
        view.setBackgroundResource(R.color.nightmode);
    }

}
