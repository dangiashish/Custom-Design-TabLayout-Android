package com.android.design.tablayout;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Toolbar toolbar;

    TextView tab1, tab2, tab3, select;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        tab1 = findViewById(R.id.tab1);
        tab2 = findViewById(R.id.tab2);
        tab3 = findViewById(R.id.tab3);
        select = findViewById(R.id.textSelected);


        tab1.setOnClickListener(this);
        tab2.setOnClickListener(this);
        tab3.setOnClickListener(this);



    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.tab1){
            tab1.setTextColor(getResources().getColor(R.color.white));
            tab2.setTextColor(getResources().getColor(R.color.colorPrimary));
            tab3.setTextColor(getResources().getColor(R.color.colorPrimary));
            select.animate().x(0).setDuration(60);

            // do anything here
            Toast.makeText(this, "tab 1 clicked", Toast.LENGTH_SHORT).show();
        } else
        if (v.getId() == R.id.tab2){
            tab1.setTextColor(getResources().getColor(R.color.colorPrimary));
            tab2.setTextColor(getResources().getColor(R.color.white));
            tab3.setTextColor(getResources().getColor(R.color.colorPrimary));
            int size = tab2.getWidth();
            select.animate().x(size).setDuration(60);

            Toast.makeText(this, "tab 2 clicked", Toast.LENGTH_SHORT).show();

        }

        else if (v.getId() == R.id.tab3){
            tab1.setTextColor(getResources().getColor(R.color.colorPrimary));
            tab2.setTextColor(getResources().getColor(R.color.colorPrimary));
            tab3.setTextColor(getResources().getColor(R.color.white));
            int size = tab2.getWidth() * 2 ;
            select.animate().x(size).setDuration(60);

            Toast.makeText(this, "tab 3 clicked", Toast.LENGTH_SHORT).show();

        }

    }
}