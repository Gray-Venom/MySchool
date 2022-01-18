package com.example.myschool;

import android.os.Bundle;

import com.example.lib.School;
import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;
import androidx.recyclerview.widget.RecyclerView;

import com.example.myschool.databinding.ActivityListLearnersBinding;

public class ListLearnersActivity extends AppCompatActivity {
    RecyclerView l_list;
    TextView l_slist;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_learners);

        //l_list = (RecyclerView) findViewById(R.id.l_list);
        l_slist = (TextView) findViewById(R.id.learners_slist);
        Log.wtf("!!!", School.SCHOOL.getListLearners());
        l_slist.setText(School.SCHOOL.getListLearners());
        //l_list
    }
}