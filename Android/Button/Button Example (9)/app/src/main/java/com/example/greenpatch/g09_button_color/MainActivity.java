package com.example.greenpatch.g09_button_color;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * 안드로이드 버튼구현 - 9
 * 버튼 내부 텍스트의 색상을 변경하는 예제입니다.
 */

public class MainActivity extends AppCompatActivity {

    Button btn_red, btn_blue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼의 id를 받아옴
        btn_red = (Button) findViewById(R.id.btn_red);
        btn_blue = (Button) findViewById(R.id.btn_blue);

        btn_red.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                // RGB값으로 텍스트의 컬러를 빨간색으로 변경
                btn_red.setTextColor(Color.rgb(255, 0, 0));
                btn_blue.setTextColor(Color.rgb(255, 0, 0));
            }
        });

        btn_blue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 기본 컬러 팔레트로 텍스트의 컬러를 파란색으로 변경
                btn_red.setTextColor(Color.BLUE);
                btn_blue.setTextColor(Color.BLUE);
            }
        });

    }
}
