package com.example.saad.magna19;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class TeamActivity extends AppCompatActivity {
    ImageView mImageView;
    String url = "http://magna.fccollege.edu.pk/wp-content/uploads/2018/12/Tallal-Bhatti.jpg";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.team_activity);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);



    }

}
