package com.example.donguk.ex271;

import android.app.ListActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    String[] bckColor;
    LinearLayout bck;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bck=(LinearLayout)findViewById(R.id.bck);

        bckColor = getResources().getStringArray(R.array.bckColor);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bckColor));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(bckColor[position].equals("빨강")){
            bck.setBackgroundColor(Color.RED);
        }else if(bckColor[position].equals("노랑")){
            bck.setBackgroundColor(Color.YELLOW);
        }else{
            bck.setBackgroundColor(Color.BLUE);
        }
    }
}
