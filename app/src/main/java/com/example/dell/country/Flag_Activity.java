package com.example.dell.country;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Flag_Activity extends AppCompatActivity {

    private TextView title;
    private ImageView img;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_flag_);

        title =  findViewById(R.id.txttitle);
        img =  findViewById(R.id.country_flag);

        // Recieve data
        Intent intent = getIntent();
        String Title = intent.getExtras().getString("Title");
        int image = intent.getExtras().getInt("Img_flags");


        // Setting values

        title.setText(Title);
        img.setImageResource(image);


    }
}

