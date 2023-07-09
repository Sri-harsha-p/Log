package com.example.log;

import static java.lang.System.exit;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class admindash extends AppCompatActivity {
FloatingActionButton btn;
View card;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_admindash);
        btn=findViewById(R.id.adminout);
        card=findViewById(R.id.cmpview);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(admindash.this,LoginActivity.class));
                exit(0);
            }
        });

        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(admindash.this,fetchdata.class));
            }
        });
    }
}