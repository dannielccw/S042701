package com.example.yvtc.s042701;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import java.io.StringBufferInputStream;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent it =getIntent();
        String msg = it.getStringExtra("msg");
        if (msg !=null )
        {
            TextView tv = (TextView) findViewById(R.id.textView);
            tv.setText(msg);
        }
    }
}
