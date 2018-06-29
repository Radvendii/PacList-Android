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

public class ListActivity extends AppCompatActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_list);
    ListView listView = (ListView) findViewById(R.id.action_list);
    ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.simple_list_item, R.id.test_view, new String[]{"foo", "bar", "baz"});
    listView.setAdapter(adapter);
  }
}

// private class MyAdapter extends BaseAdapter {
//   @Override
//   public View getView(int position, View convertView, ViewGroup container) {
//     if (convertView == null) {
//       convertView = getLayoutInflater().inflate(R.layout.list_item, container, false);
//     }

//     ((TextView) convertView.findViewById(R.id.text1)).setText(getItem(position));
//     return convertView;
//   }
// }
