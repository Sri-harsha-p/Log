package com.example.log;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.os.Bundle;
import android.text.TextPaint;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class adminpage extends AppCompatActivity {
    Button btn;
    EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adminpage);
        btn = findViewById(R.id.logbtn);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.apass);

            btn.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (email.getText().toString().equals("admin@gmail.com") && pass.getText().toString().equals("admin@1234")) {
                    Toast.makeText(adminpage.this, "login successful", Toast.LENGTH_SHORT).show();
                    startActivity(new Intent(adminpage.this, admindash.class));
                }else {
                        Toast.makeText(adminpage.this, "wrong email or password", Toast.LENGTH_SHORT).show();
                    }
                                            }
     });
}
}