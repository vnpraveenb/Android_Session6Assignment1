package com.praveen.session6assignment1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import static com.praveen.session6assignment1.R.id.username;

public class MainActivity extends AppCompatActivity {

    EditText username, password;
    Button  loginButton;
    TextView signupText;
    String usernameText;
    String passwordText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = findViewById(R.id.username);
        password = findViewById(R.id.password);
        loginButton = findViewById(R.id.loginButton);
        signupText = findViewById(R.id.signupText);


        loginButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                usernameText = username.getText().toString();
                passwordText = password.getText().toString();
                Validation credentials = new Validation(usernameText, passwordText);

                if (credentials.isUsernameEmpty() || credentials.isPasswordEmpty())
                {
                    Toast.makeText(MainActivity.this, " Fields Empty, Incomplete Information, Try Again", Toast.LENGTH_LONG).show();

                }
                else if(credentials.checkCredentials("praveen","praveen"))
                {
                    Toast.makeText(MainActivity.this, "Credentials are correct. You may login. User:" + usernameText, Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(MainActivity.this, "Credentials are incorrect. Please check your username and password and try again", Toast.LENGTH_LONG).show();
                }
            }
        });


    }

}
