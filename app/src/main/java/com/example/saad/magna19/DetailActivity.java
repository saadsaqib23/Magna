package com.example.saad.magna19;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

public class DetailActivity extends AppCompatActivity {

    FragmentManager fm;
    FragmentTransaction ft;
    Bundle bundle;

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        bundle = getIntent().getBundleExtra("bundle");

        DetailFrag detailFrag = new DetailFrag();

        detailFrag.setArguments(bundle);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.replace(R.id.detailfrag, detailFrag);

        ft.commit();

    }
}