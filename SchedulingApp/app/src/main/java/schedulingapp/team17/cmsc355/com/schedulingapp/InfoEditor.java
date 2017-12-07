package schedulingapp.team17.cmsc355.com.schedulingapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class InfoEditor extends AppCompatActivity {

    String name;
    String email;

    EditText nameInput;
    EditText emailInput;

    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_editor);
        nameInput = (EditText) findViewById(R.id.nameInput);
        emailInput = (EditText) findViewById(R.id.emailInput);

        submitButton = (Button) findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                name = nameInput.getText().toString();
                email = emailInput.getText().toString();
                Intent userData = new Intent(InfoEditor.this, ProfileEditor.class);
                //userData.putExtra("Name", name);
                //userData.putExtra("Email", email);
                startActivity(userData);
                //on Next Iteration, this button will overwrite the data on the person's profile
            }
        });
    }
}
