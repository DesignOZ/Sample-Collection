package com.example.greenpatch.g07_button_count;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * 안드로이드 버튼구현 - 7
 * 버튼을 누를때마다 카운트를 세는 예제입니다.
 */

public class MainActivity extends AppCompatActivity {

    Button btn_count;   // 카운트 버튼
    TextView tv_count;  // 카운트를 표시할 텍스트뷰
    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼과 텍스트뷰의 id를 받아옴
        btn_count = (Button) findViewById(R.id.btn_count);
        tv_count = (TextView) findViewById(R.id.tv_count);

        btn_count.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                count++;    // count에 1을 더한다.

                tv_count.setText(Integer.toString(count));
                // TextView.setText()를 통해 tv_count로 출력할 내용을 입력한다.
                // 텍스트뷰는 문자(또는 문자열)을 출력하기 때문에 정수형 변수 count를 출력하기 위해서는 문자열로 변환해줄 필요가 있다.
                // 이때 변환을 위해 Integer.toString() 문을 사용.
            }
        });

    }
}
