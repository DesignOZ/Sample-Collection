package com.example.donguk.ex4630;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    LinearLayout bck;
    Spinner spin;
    String[] items ={"노랑", "파랑", "초록"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bck=(LinearLayout)findViewById(R.id.bck);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        spin.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(items[i].equals("노랑")) {
            bck.setBackgroundColor(Color.YELLOW);
        }else if(items[i].equals("파랑")){
            bck.setBackgroundColor(Color.BLUE);
        }else{
            bck.setBackgroundColor(Color.GREEN);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
