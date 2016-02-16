package com.choinisae.donghaechoi.exam_intent;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private EditText mIdEditText;
    private EditText mPasswordEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mIdEditText = (EditText) findViewById(R.id.id_text);
        mPasswordEditText = (EditText) findViewById(R.id.password_text);

        findViewById(R.id.login_btn).setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, Main2Activity.class);
        intent.putExtra("id", mIdEditText.getText().toString());
        intent.putExtra("password", mPasswordEditText.getText().toString());
        startActivity(intent);

    }
}
