package me.bar_yam.taeer.paclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder loginResponse = new AlertDialog.Builder(this);
        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
            EditText name     = ((EditText) findViewById(R.id.name_edit)).getText().toString();
            EditText username = ((EditText) findViewById(R.id.username_edit)).getText().toString();
            EditText password = ((EditText) findViewById(R.id.password_edit)).getText().toString();
            if(username == "" || password == ""){
              loginResponse.setTitle("Error");
              loginResponse.setMessage("Please enter both a username and password.");
            }
            else if(username == "foo" && password == "bar"){
              loginResponse.setTitle("Sucess");
              loginResponse.setMessage("Username and Password are correct!");
            }
            else {
              loginResponse.setTitle("Try Again");
              loginResponse.setMessage("Incorrect information was entered. Please send an email to request the username and password.");
            }
            loginResponse.show();
          }
        });
    }
}
