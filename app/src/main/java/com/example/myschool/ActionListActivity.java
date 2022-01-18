package com.example.myschool;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.lib.School;

public class ActionListActivity extends AppCompatActivity {
    Button addLeranerBut;
    Button LearnerListBut;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_action_list);
        setTitle(School.SCHOOL.getName());
        addLeranerBut = findViewById(R.id.button3);
        LearnerListBut = findViewById(R.id.learners_list);
        View.OnClickListener listener = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ActionListActivity.this, AddLearnerActivity.class);
                startActivity(i);
            }
        };
        addLeranerBut.setOnClickListener(listener);

        View.OnClickListener listener2 = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i;
                i = new Intent(ActionListActivity.this, ListLearnersActivity.class);
                startActivity(i);
            }
        };
        LearnerListBut.setOnClickListener(listener2);
    }
}