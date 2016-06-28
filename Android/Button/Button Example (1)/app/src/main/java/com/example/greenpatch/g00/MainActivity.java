package com.example.greenpatch.g00;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

/**
 * 안드로이드 버튼구현 - 1
 * 내부 클래스를 통한 버튼 구현 방법입니다.
 */

public class MainActivity extends AppCompatActivity {

    Button mButton;  // 버튼을 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mButton = (Button) findViewById(R.id.Button);   // 버튼의 id를 받아온다.
        mButton.setOnClickListener(new ButtonClick());  // 리스너를 장착
    }

    //내부 클래스를 하나 만들어줍니다.
    class ButtonClick implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            //버튼이 제대로 구현되었는지 확인하기위해 Toast문을 사용
            Toast.makeText(MainActivity.this, "내부 클래스를 이용한 버튼구현", Toast.LENGTH_SHORT).show();
        }
    }
}
