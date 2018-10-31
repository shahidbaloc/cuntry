package com.example.dell.country;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    // this is list of model class
    List<FlagModle> lstFlagModle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // an arraylist for view items
        lstFlagModle = new ArrayList<>();
        lstFlagModle.add(new FlagModle("The Pakistan",R.drawable.pakistan));
        lstFlagModle.add(new FlagModle("The Africa",R.drawable.africa));
        lstFlagModle.add(new FlagModle("The Bandiera",R.drawable.bandiera));
        lstFlagModle.add(new FlagModle("The Brazil",R.drawable.brazil));
        lstFlagModle.add(new FlagModle("The Britain",R.drawable.britain));
        lstFlagModle.add(new FlagModle("The china",R.drawable.china));
        lstFlagModle.add(new FlagModle("The Eritrea",R.drawable.eritrea));
        lstFlagModle.add(new FlagModle("The guyana",R.drawable.guyana));
        lstFlagModle.add(new FlagModle("The Haiti",R.drawable.haiti));
        lstFlagModle.add(new FlagModle("The Jordan",R.drawable.jordan));
        lstFlagModle.add(new FlagModle("The Malaysia",R.drawable.malaysia));

        lstFlagModle.add(new FlagModle("The Pakistan",R.drawable.pakistan));
        lstFlagModle.add(new FlagModle("The Africa",R.drawable.africa));
        lstFlagModle.add(new FlagModle("The Bandiera",R.drawable.bandiera));
        lstFlagModle.add(new FlagModle("The Brazil",R.drawable.brazil));
        lstFlagModle.add(new FlagModle("The Britain",R.drawable.britain));
        lstFlagModle.add(new FlagModle("The china",R.drawable.china));
        lstFlagModle.add(new FlagModle("The Eritrea",R.drawable.eritrea));
        lstFlagModle.add(new FlagModle("The guyana",R.drawable.guyana));
        lstFlagModle.add(new FlagModle("The Haiti",R.drawable.haiti));
        lstFlagModle.add(new FlagModle("The Jordan",R.drawable.jordan));
        lstFlagModle.add(new FlagModle("The Malaysia",R.drawable.malaysia));

        // dedining recycleviw from the main XML
        RecyclerView myrv =  findViewById(R.id.recyclerview_id);
        // defining adpter
        RecyclerViewAdapter myAdapter = new RecyclerViewAdapter(this, lstFlagModle);
        myrv.setLayoutManager(new GridLayoutManager(this,4));
        myrv.setAdapter(myAdapter);


    }
}
