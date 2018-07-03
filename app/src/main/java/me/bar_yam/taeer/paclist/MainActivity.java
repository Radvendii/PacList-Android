package me.bar_yam.taeer.paclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.Context;

public class MainActivity extends AppCompatActivity {

  public static final String _LoginPrefs = "LoginInfo";
  public static final String _Name = "nameKey";
  public static final String _Username = "usernameKey";
  public static final String _Password = "passowrdKey";

  SharedPreferences sharedPrefs;

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);

    sharedPrefs = getSharedPreferences(_LoginPrefs, Context.MODE_PRIVATE);
    EditText name     = (EditText) findViewById(R.id.name_edit);
    EditText username = (EditText) findViewById(R.id.username_edit);
    EditText password = (EditText) findViewById(R.id.password_edit);

    name.setText(sharedPrefs.getString(_Name, ""));
    username.setText(sharedPrefs.getString(_Username, ""));
    password.setText(sharedPrefs.getString(_Password, ""));

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

        SharedPreferences.Editor editor = sharedPrefs.edit();

        editor.putString(_Name, name);

        if(username.equals("") || password.equals("")){
          loginResponse.setTitle("Error");
          loginResponse.setMessage("Please enter both a username and password.");
          loginResponse.show();
        }
        else if(username.equals("foo") && password.equals("bar")){
          editor.putString(_Username, username);
          editor.putString(_Password, password);
          startActivity(new Intent(getApplicationContext(), ListActivity.class));
        }
        else {
          loginResponse.setTitle("Try Again");
          loginResponse.setMessage("Incorrect information was entered. Please send an email to request the username and password.");
          loginResponse.show();
        }
        editor.commit();
      }
    });
  }
}
