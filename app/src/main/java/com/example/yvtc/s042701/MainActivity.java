package com.example.yvtc.s042701;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

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

    public void clickSave(View v)
    {
        // Write a message to the database
        FirebaseDatabase database = FirebaseDatabase.getInstance();
        DatabaseReference myRef = database.getReference("message");
        EditText ed = (EditText) findViewById(R.id.editText);
        myRef.setValue(ed.getText().toString());
    }
}
