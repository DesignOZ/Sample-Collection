package com.example.donguk.ex371;

import android.app.ListActivity;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends ListActivity {
    String[] txtColor;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.txt);

        txtColor = getResources().getStringArray(R.array.txtColor);
        setListAdapter(new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,txtColor));

    }

    @Override
    protected void onListItemClick(ListView l, View v, int position, long id) {
        super.onListItemClick(l, v, position, id);

        if(txtColor[position].equals("빨강")){
            txt.setTextColor(Color.RED);
        }else if(txtColor[position].equals("노랑")){
            txt.setTextColor(Color.YELLOW);
        }else{
            txt.setTextColor(Color.BLUE);
        }
    }
}
