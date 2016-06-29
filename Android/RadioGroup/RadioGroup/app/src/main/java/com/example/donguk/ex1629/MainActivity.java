package com.example.donguk.ex1629;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    RadioGroup rdg;
    Button btn1;
    TextView txt;
    RadioButton rdb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        rdg=(RadioGroup)findViewById(R.id.rdg);
        btn1=(Button)findViewById(R.id.btn1);
        txt=(TextView)findViewById(R.id.txt);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int aa = rdg.getCheckedRadioButtonId();
                RadioButton rdb=(RadioButton)findViewById(aa);

                txt.setText(rdb.getText().toString());
            }
        });
    }
}
