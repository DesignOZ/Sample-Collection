package com.example.donguk.ex2629;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdg;
    LinearLayout bck;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdg = (RadioGroup) findViewById(R.id.rdg);
        bck=(LinearLayout)findViewById(R.id.bck);

        rdg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch(i) {
            case R.id.yl :
                bck.setBackgroundColor(Color.YELLOW);
                break;
            case R.id.bl :
                bck.setBackgroundColor(Color.BLUE);
                break;
            case R.id.gr :
                bck.setBackgroundColor(Color.GREEN);
                break;
        }


    }
}


