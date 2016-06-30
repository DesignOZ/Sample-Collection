package com.example.donguk.ex5630;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    ImageView img;
    Spinner spin;
    String[] items ={"태연", "하니", "다현"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        img=(ImageView)findViewById(R.id.img);
        spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        spin.setOnItemSelectedListener(this);


    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(items[i].equals("태연")){
            img.setImageResource(R.drawable.tae);
        }else if(items[i].equals("하니")){
            img.setImageResource(R.drawable.hani);
        }else{
            img.setImageResource(R.drawable.dah);
        }

    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
