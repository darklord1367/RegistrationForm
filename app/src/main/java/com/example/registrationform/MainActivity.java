package com.example.registrationform;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    public String FirstName ;
    public String LastName ;
    public String EmailId ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }


    public void displayRegistrationData(View view) {

        FirstName = GetUserEnteredData(findViewById(R.id.enterFirstName));
        LastName = GetUserEnteredData(findViewById(R.id.enterLastName));
        EmailId = GetUserEnteredData(findViewById(R.id.enterEmailID));

        this.DisplayUserEnteredData ("First Name", findViewById(R.id.displayName), FirstName);
        this.DisplayUserEnteredData ("Last Name", findViewById(R.id.displayLastName), LastName);
        this.DisplayUserEnteredData ("Email", findViewById(R.id.displayEmailID), EmailId);

    }

    public String GetUserEnteredData(EditText userEnteredData)
    {
        return userEnteredData.getText().toString();
    }

    public void DisplayUserEnteredData(String parameter, TextView displayUserEnteredData, String userData)
    {
        displayUserEnteredData.setText(parameter + ": " + userData);
    }


}