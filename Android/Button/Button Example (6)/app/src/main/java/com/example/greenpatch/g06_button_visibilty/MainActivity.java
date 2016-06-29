package com.example.greenpatch.g06_button_visibilty;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * 안드로이드 버튼구현 - 6
 * 버튼의 visibility(보여지는) 속성을 이용한 예제
 * 버튼의 기능을 직관적으로 파악하기위해 내부 무명클래스 사용
 */

public class MainActivity extends AppCompatActivity {

    Button visible, invisible;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // 버튼 id를 받아옴
        visible = (Button) findViewById(R.id.visible);
        invisible = (Button) findViewById(R.id.invisible);

        visible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 보이지 않는 버튼을 보이도록 한다
                invisible.setVisibility(View.VISIBLE);
            }
        });

        invisible.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // 버튼을 보이지 않도록 한다
                invisible.setVisibility(View.INVISIBLE);
            }
        });


    }
}
