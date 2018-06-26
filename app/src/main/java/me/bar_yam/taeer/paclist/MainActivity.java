package me.bar_yam.taeer.paclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final AlertDialog.Builder adb = new AlertDialog.Builder(this);
        adb.setTitle("foo");
        final Button loginButton = findViewById(R.id.login_button);
        button.setOnClickListener(new View.OnClickListener() {
          public void onClick(View v) {
            EditText name = findViewById(R.id.name_edit);
            EditText username = findViewById(R.id.username_edit);
            EditText password = findViewById(R.id.password_edit);
            AlertDialog ad = adb.create();
            ad.show();
          }
        });
    }
}
