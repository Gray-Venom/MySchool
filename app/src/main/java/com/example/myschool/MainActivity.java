package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lib.School;

public class MainActivity extends AppCompatActivity {
    Button button;
    EditText tw;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button);
        tw = (EditText) findViewById(R.id.editTextSchoolName);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                School.SCHOOL = new School(tw.getText().toString(), "Псков");
                Intent i;
                i = new Intent(MainActivity.this, ActionListActivity.class);
                startActivity(i);
            }
        };
        button.setOnClickListener(listener);
    }
}