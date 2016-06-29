package com.example.donguk.ex4629;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    RadioGroup rdg;
    RadioButton rdb1, rdb2, rdb3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        rdg=(RadioGroup)findViewById(R.id.rdg);
        rdb1=(RadioButton)findViewById(R.id.rdb1);
        rdb2=(RadioButton)findViewById(R.id.rdb2);
        rdb3=(RadioButton)findViewById(R.id.rdb3);

        rdg.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup radioGroup, int i) {
        if(rdg.getCheckedRadioButtonId() == R.id.rdb1) {
            Toast.makeText(MainActivity.this, "햄버거", Toast.LENGTH_SHORT).show();
        } else if(rdg.getCheckedRadioButtonId() == R.id.rdb2) {
            Toast.makeText(MainActivity.this, "피자", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(MainActivity.this, "치킨", Toast.LENGTH_SHORT).show();
        }
    }
}
