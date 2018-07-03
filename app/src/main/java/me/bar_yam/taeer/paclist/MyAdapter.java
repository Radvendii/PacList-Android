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

public class MyAdapter extends ArrayAdapter<Task> {

  ArrayList<Task> taskList = new ArrayList<>();

  public MyAdapter(Context context, int textViewResourceId, ArrayList<Task> objects) {
    super(context, textViewResourceId, objects);
    taskList = objects;
  }

  @Override
  public int getCount() {
    return super.getCount();
  }

  @Override
  public View getView(int position, View convertView, ViewGroup container) {
    View v = convertView;
    LayoutInflater inflater = (LayoutInflater) getContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    v = inflater.inflate(R.layout.list_item, null);

    TextView room = (TextView) v.findViewById(R.id.task_list_room);
    TextView bedNum = (TextView) v.findViewById(R.id.task_list_bed_num);
    TextView action = (TextView) v.findViewById(R.id.task_list_action);
    TextView time = (TextView) v.findViewById(R.id.task_list_time);

    room.setText(taskList.get(position).getRoom());
    bedNum.setText(taskList.get(position).getBedNum());
    action.setText(taskList.get(position).getAction());
    time.setText(taskList.get(position).getTime());
    return v;
  }
}
