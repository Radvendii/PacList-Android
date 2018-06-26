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

        final Button loginButton = (Button) findViewById(R.id.login_button);
        loginButton.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
            EditText name     = (EditText) findViewById(R.id.name_edit);
            EditText username = (EditText) findViewById(R.id.username_edit);
            EditText password = (EditText) findViewById(R.id.password_edit);
            final AlertDialog.Builder adb = new AlertDialog.Builder(this);
            adb.setTitle("foo");
            AlertDialog ad = adb.create();
            ad.show();
          }
        });
    }
}
