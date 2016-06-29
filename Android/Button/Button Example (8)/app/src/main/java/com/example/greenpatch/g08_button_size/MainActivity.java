package com.example.greenpatch.g08_button_size;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

/**
 * 안드로이드 버튼구현 - 8
 * 버튼을 눌렀을 때 크기가 변하는 예제입니다.
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

        // 크기를 늘리는 버튼을 눌렀을 떄
        size_up.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Layout에서 버튼의 사이즈를 받아온다.
                ViewGroup.LayoutParams params = size_up.getLayoutParams();

                // 버튼의 사이즈를 재설정
                params.width = 400;
                params.height = 200;

                //재설정한 사이즈를 버튼에 적용한다.
                size_up.setLayoutParams(params);
                size_down.setLayoutParams(params);
            }
        });

        // 크기를 줄이는 버튼을 눌렀을 떄
        size_down.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // Layout에서 버튼의 사이즈를 받아온다.
                ViewGroup.LayoutParams params = size_up.getLayoutParams();

                // 버튼의 사이즈를 재설정
                params.width = 200;
                params.height = 100;

                // 재설정한 사이즈를 버튼에 적용한다.
                size_up.setLayoutParams(params);
                size_down.setLayoutParams(params);
            }
        });
    }
}
