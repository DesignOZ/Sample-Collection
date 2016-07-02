package com.example.donguk.ex171;

import android.app.ListActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends ListActivity {
    String[] bckColor;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bckColor = getResources().getStringArray(R.array.bckColor);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,bckColor));


    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        Toast.makeText(MainActivity.this, "내가 좋아하는 색은" + bckColor[position], Toast.LENGTH_SHORT).show();

    }
}
