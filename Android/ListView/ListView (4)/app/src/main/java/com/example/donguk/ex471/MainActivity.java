package com.example.donguk.ex471;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;

public class MainActivity extends ListActivity {
    String[] idol;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.img);

        idol = getResources().getStringArray(R.array.idol);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,idol));
    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(idol[position].equals("태연")){
            img.setImageResource(R.drawable.tae);
        }else if(idol[position].equals("하니")){
            img.setImageResource(R.drawable.hani);
        }else{
            img.setImageResource(R.drawable.dah);
        }
    }
}
