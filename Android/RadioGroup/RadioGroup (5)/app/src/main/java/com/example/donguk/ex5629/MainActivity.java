package com.example.donguk.ex5629;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button button1, button2, button3;
    EditText editText, editText2, editText3;
    TextView textView, textView2, textView3;
    RadioGroup rdGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1 = (Button)findViewById(R.id.button1);
        button2 = (Button)findViewById(R.id.button2);
        button3 = (Button)findViewById(R.id.button3);
        editText = (EditText)findViewById(R.id.editText);
        editText2 = (EditText)findViewById(R.id.editText2);
        editText3 = (EditText)findViewById(R.id.editText3);
        textView = (TextView)findViewById(R.id.textView);
        textView2 = (TextView)findViewById(R.id.textView2);
        textView3 = (TextView)findViewById(R.id.textView3);
        rdGroup = (RadioGroup)findViewById(R.id.rdGroup);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int value = Integer.parseInt(editText.getText().toString());
                int value2 = Integer.parseInt(editText2.getText().toString());
                int sum = 0;
                if (rdGroup.getCheckedRadioButtonId() == R.id.add) {
                    sum = value + value2;
                } else if (rdGroup.getCheckedRadioButtonId() == R.id.sub) {
                    sum = value - value2;
                } else if (rdGroup.getCheckedRadioButtonId() == R.id.mul) {
                    sum = value * value2;
                } else if (rdGroup.getCheckedRadioButtonId() == R.id.div) {
                    sum = value / value2;
                }

                editText3.setText(Integer.toString(sum));

            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                editText.setText(null);
                editText2.setText(null);
                editText3.setText(null);

            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                System.exit(0);

            }
        });



            }
}
