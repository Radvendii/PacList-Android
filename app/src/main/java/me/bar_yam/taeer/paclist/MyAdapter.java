package me.bar_yam.taeer.paclist;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.LayoutInflater;
import android.widget.TextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.ArrayAdapter;

import java.util.ArrayList;

public class MyAdapter extends ArrayAdapter<TodoItem> {

  ArrayList<TodoItem> todoList = new ArrayList<>();

  public MyAdapter(Context context, int textViewResourceId, ArrayList<TodoItem> objects) {
    super(context, textViewResourceId, objects);
    todoList = objects;
  }

  @Override
  public int getCount() {
    return super.getCount();
  }

  @Override
  public View getView(int position, View convertView, ViewGroup container) {
    View v = convertView;
    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    v = inflater.inflate(R.layout.simple_list_item, null);

    TextView room = (TextView) v.findViewById(R.id.todo_list_room);
    TextView bedNum = (TextView) v.findViewById(R.id.todo_list_bed_num);
    TextView action = (TextView) v.findViewById(R.id.todo_list_action);
    TextView time = (TextView) v.findViewById(R.id.todo_list_time);

    room.setText(todoList.get(position).getRoom());
    bedNum.setText(todoList.get(position).getBedNum());
    action.setText(todoList.get(position).getAction());
    time.setText(todoList.get(position).getTime());
    return v;
  }
}
