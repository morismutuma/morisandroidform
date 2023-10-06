package org.meicode.registrationform1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onRegisterBtnClick(View view) {

        //text view
        TextView textViewFirstName = findViewById(R.id.textViewFirstNAme);
        TextView textViewLastName  = findViewById(R.id.textViewLastName);
        TextView textViewEmail     = findViewById(R.id.textViewEmail);

        //edit text

        EditText editTextFirstname = findViewById(R.id.editTextFirstName);
        EditText editTextLastName  = findViewById(R.id.editTextLastName);
        EditText editTextEmail     = findViewById(R.id.editTextEmail);

        //to access

        textViewFirstName.setText("First Name: " + editTextFirstname.getText().toString() );
        textViewLastName.setText("Last Name: " + editTextLastName.getText().toString());
        textViewEmail.setText("Email: " + editTextEmail.getText().toString());

    }
}