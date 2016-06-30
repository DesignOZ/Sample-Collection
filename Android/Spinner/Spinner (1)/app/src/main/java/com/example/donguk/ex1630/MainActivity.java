package com.example.donguk.ex1630;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemSelectedListener {
    TextView txt;
    String[] items ={"월요일", "화요일", "수요일","목요일"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        txt=(TextView)findViewById(R.id.txt);
        Spinner spi=(Spinner)findViewById(R.id.spi);


        ArrayAdapter<String> aa= new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,items);
        aa.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spi.setAdapter(aa);
        spi.setOnItemSelectedListener(this);
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
        txt.setText(items[i]);


    }

    @Override
    public void onNothingSelected(AdapterView<?> adapterView) {

    }
}
