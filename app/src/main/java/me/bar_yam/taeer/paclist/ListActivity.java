package me.bar_yam.taeer.paclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class ListActivity extends AppCompatActivity {
  ArrayList<TodoItem> todoList = new ArrayList<>();
  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    todoList.add(new TodoItem("PACU", "10", "Signout", "16:30:17"));
    todoList.add(new TodoItem("PACU", "46", "Signout", "16:33:00"));
    ListView listView = (ListView) findViewById(R.id.action_list);
    MyAdapter adapter = new MyAdapter(this, R.layout.simple_list_item, todoList);
    listView.setAdapter(adapter);
  }
}
