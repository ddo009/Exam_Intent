package com.choinisae.donghaechoi.exam_intent;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Intent intent = getIntent();
        Toast.makeText(Main2Activity.this, intent.getStringExtra("id") + " , " + intent.getStringExtra("password"), Toast.LENGTH_SHORT).show();

        TextView text = (TextView) findViewById(R.id.text_1);
        text.setText(intent.getStringExtra("id") + "님 환영합니다.");

        findViewById(R.id.btn_1).setOnClickListener(this);
        findViewById(R.id.btn_2).setOnClickListener(this);
        findViewById(R.id.btn_3).setOnClickListener(this);


    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btn_1: {
                Toast.makeText(Main2Activity.this, "고객관리", Toast.LENGTH_SHORT).show();
                finish();
                break;
            }

            case R.id.btn_2: {
                Toast.makeText(Main2Activity.this, "메츨관리", Toast.LENGTH_SHORT).show();
                finish();
                break;
            }
            case R.id.btn_3: {
                Toast.makeText(Main2Activity.this, "상품관리", Toast.LENGTH_SHORT).show();
                finish();
                break;
            }
        }
    }
}
