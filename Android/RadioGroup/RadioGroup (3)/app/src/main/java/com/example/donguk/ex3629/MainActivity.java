package com.example.donguk.ex3629;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdg;
    ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdg=(RadioGroup)findViewById(R.id.rdg);
        img=(ImageView)findViewById(R.id.img);

        rdg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        switch(i) {
            case R.id.rdb1 :
                img.setImageResource(R.drawable.tae);
                break;
            case R.id.rdb2 :
                img.setImageResource(R.drawable.hani);
                break;
            case R.id.rdb3 :
                img.setImageResource(R.drawable.dah);
                break;
        }
    }
}
