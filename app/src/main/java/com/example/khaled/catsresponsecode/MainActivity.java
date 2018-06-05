package com.example.khaled.catsresponsecode;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

import com.bumptech.glide.Glide;

public class MainActivity extends AppCompatActivity {

    String code;
    EditText searchQuery;
    Button searchButton;
    ImageView catImageView;
    final String stringUrl="https://http.cat/";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        searchButton=findViewById(R.id.search);
        searchQuery=findViewById(R.id.status_code);
        catImageView=findViewById(R.id.code_image);

        searchButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                code=String.valueOf(searchQuery.getText());
                GlideApp.with(MainActivity.this)
                        .load(stringUrl+code)
                        .into(catImageView);
            }
        });
    }
}
