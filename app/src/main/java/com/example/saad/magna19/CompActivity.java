package com.example.saad.magna19;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.FrameLayout;
import android.widget.ListView;

import static com.example.saad.magna19.comp_info.comp;
import static com.example.saad.magna19.comp_info.imgid;
import static com.example.saad.magna19.comp_info.rules;

public class CompActivity extends AppCompatActivity {

    ListView lst;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.comp_activity);

        android.support.v7.widget.Toolbar toolbar = (android.support.v7.widget.Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        lst = (ListView) findViewById(R.id.listview);
        Custom_Comp custom_comp = new Custom_Comp(this, comp, imgid);
        lst.setAdapter(custom_comp);

//        displayComp(0);

        lst.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView parent, View view, int position, long id) {
                if (position == 0) {
                    displayComp(position);
                }
                if (position == 1) {
                    displayComp(position);
                }
                if (position == 2) {
                    displayComp(position);
                }
                if (position == 3) {
                    displayComp(position);
                }
                if (position == 4) {
                    displayComp(position);
                }
                if (position == 5) {
                    displayComp(position);
                }
                if (position == 6) {
                    displayComp(position);
                }
                if (position == 7) {
                    displayComp(position);
                }
                if (position == 8) {
                    displayComp(position);
                }
                if (position == 9) {
                    displayComp(position);
                }
                if (position == 10) {
                    displayComp(position);
                }
                if (position == 11) {
                    displayComp(position);
                }
                if (position == 12) {
                    displayComp(position);
                }
                if (position == 13) {
                    displayComp(position);
                }
                if (position == 14) {
                    displayComp(position);
                }
                if (position == 15) {
                    displayComp(position);
                }
                if (position == 16) {
                    displayComp(position);
                }
            }
        });
    }
    private void displayComp(int position) {
        Intent myIntent = new Intent(getApplicationContext(), DetailActivity.class);
        Bundle bundle = new Bundle();
        bundle.putString("name",comp[position]);
        bundle.putString("rules",rules[position]);
//        myIntent.putExtra("bundle", bundle);
//        startActivity(myIntent);

        FragmentManager fm;
        FragmentTransaction ft;
//        Bundle bundle;

        DetailFrag detailFrag = new DetailFrag();
        detailFrag.setArguments(bundle);

        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        ft.replace(R.id.detailfrag, detailFrag);
        ft.addToBackStack("details");

        FrameLayout fl = findViewById(R.id.detailfrag);
        fl.setVisibility(View.VISIBLE);

        ft.commit();

    }
}
