package me.bar_yam.taeer.paclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    final AlertDialog.Builder loginResponse = new AlertDialog.Builder(this)
      .setPositiveButton("OK", new DialogInterface.OnClickListener() {
        public void onClick(DialogInterface dialog, int id){
          dialog.cancel();
        }
      });

    final Button loginButton = (Button) findViewById(R.id.login_button);
    loginButton.setOnClickListener(new View.OnClickListener() {
      public void onClick(View v) {
        String name     = ((EditText) findViewById(R.id.name_edit)).getText().toString();
        String username = ((EditText) findViewById(R.id.username_edit)).getText().toString();
        String password = ((EditText) findViewById(R.id.password_edit)).getText().toString();
        if(username.equals("") || password.equals("")){
          loginResponse.setTitle("Error");
          loginResponse.setMessage("Please enter both a username and password.");
          loginResponse.show();
        }
        else if(username.equals("foo") && password.equals("bar")){
          startActivity(new Intent(getApplicationContext(), ListActivity.class));
        }
        else {
          loginResponse.setTitle("Try Again");
          loginResponse.setMessage("Incorrect information was entered. Please send an email to request the username and password.");
          loginResponse.show();
        }
      }
    });
  }
}
