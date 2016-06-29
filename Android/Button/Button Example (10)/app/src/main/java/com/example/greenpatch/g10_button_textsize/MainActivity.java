package com.example.greenpatch.g10_button_textsize;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 안드로이드 버튼구현 - 10
 * 버튼 내의 텍스트 크기를 조절하는 예제입니다.
 */

public class MainActivity extends AppCompatActivity {

    Button size_up, size_down;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼의 id를 받아옴
        size_up = (Button) findViewById(R.id.size_up);
        size_down = (Button) findViewById(R.id.size_down);

        size_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 텍스트 사이즈를 크게한다.
                size_up.setTextSize(25);
                size_down.setTextSize(25);
            }
        });

        size_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 텍스트 사이즈를 작게한다.
                size_up.setTextSize(10);
                size_down.setTextSize(10);
            }
        });

    }
}
