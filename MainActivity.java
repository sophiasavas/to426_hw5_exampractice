package com.example.sophia.homework5_practiceexam;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends Activity implements View.OnClickListener {

    //creates local variables for the functionality in the XML
    private Button buttonLogin;
    private Button buttonRegister;
    private EditText editTextEmail;
    private EditText editTextPassword;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //connects the local variables to the objects in the XML
        buttonLogin = findViewById(R.id.buttonLogin);
        buttonRegister = findViewById(R.id.buttonRegister);
        editTextEmail = findViewById(R.id.editTextEmail);
        editTextPassword = findViewById(R.id.editTextPassword);

        //methods that allow the Java file to be ready to recognize if a button has been clicked
        buttonLogin.setOnClickListener(this);
        buttonRegister.setOnClickListener(this);

    }

    //method that performs an action when a button is clicked
    @Override
    public void onClick(View v) {
        if (v == buttonLogin) {

        }
        else if (v == buttonRegister) {

        }
    }
}
