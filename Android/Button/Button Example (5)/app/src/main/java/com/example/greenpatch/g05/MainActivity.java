package com.example.greenpatch.g05;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 안드로이드 버튼구현 - 5
 * 뷰(View)의 리스너(Listener) 상속을 통해 버튼을 구현했을 때
 * 버튼이 2개 이상일 경우 이를 switch문을 통해 구별합니다.
 */

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button button1, button2;    // 버튼을 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼의 id를 받아온다.
        button1 = (Button) findViewById(R.id.Button1);
        button2 = (Button) findViewById(R.id.Button2);

        // 리스너 장착
        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        // 스위치문을 통한 구별
        switch (v.getId()) {

            case R.id.Button1:
                //버튼이 제대로 구현되었는지 확인하기위해 Toast문을 사용
                Toast.makeText(MainActivity.this, "1번 버튼", Toast.LENGTH_SHORT).show();
                break;

            case R.id.Button2:
                Toast.makeText(MainActivity.this, "2번 버튼", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
