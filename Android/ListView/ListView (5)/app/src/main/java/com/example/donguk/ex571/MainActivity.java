package com.example.donguk.ex571;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    String[] loca;
    LinearLayout img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        loca = getResources().getStringArray(R.array.loca);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,loca));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        img=(LinearLayout) findViewById(R.id.img);

        if(loca[position].equals("왼쪽")){
            img.setGravity(Gravity.LEFT);
        }else if(loca[position].equals("오른쪽")){
            img.setGravity(Gravity.RIGHT);
        }else{
            img.setGravity(Gravity.CENTER);
        }
    }
}
