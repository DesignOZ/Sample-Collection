package com.example.donguk.ex3630;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView txt;
    String[] items={"빨강", "노랑", "파랑"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt=(TextView)findViewById(R.id.txt);
        Spinner spin=(Spinner)findViewById(R.id.spin);

        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spin.setAdapter(aa);

        spin.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        if(items[i].equals("빨강")) {
            txt.setTextColor(Color.RED);
        } else if(items[i].equals("노랑")) {
            txt.setTextColor(Color.YELLOW);
        } else {
            txt.setTextColor(Color.BLUE);
        }


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
