package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActionBar;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.lib.Learner;
import com.example.lib.School;

public class AddLearnerActivity extends AppCompatActivity {
    Button a_but;
    EditText firstname;
    EditText secondname;
    EditText patronym;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_learner);
        //ActionBar actionBar = getActionBar();
        //actionBar.setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        a_but = (Button) findViewById(R.id.add_but);
        firstname = (EditText) findViewById(R.id.editTextFirstName);
        secondname = (EditText) findViewById(R.id.editTextTextSecondName);
        patronym = (EditText) findViewById(R.id.editTextTextPatronym);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Learner l = new Learner(firstname.getText()+" "+secondname.getText()+" "+patronym.getText(), 1,1);
                School.SCHOOL.addLearner(l);
                Intent i;
                i = new Intent(AddLearnerActivity.this, ActionListActivity.class);
                startActivity(i);
            }
        };
        a_but.setOnClickListener(listener);
    }
}