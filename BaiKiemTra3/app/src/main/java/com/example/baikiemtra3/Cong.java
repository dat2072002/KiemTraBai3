package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Cong extends AppCompatActivity {

    EditText edtsoA;
    TextView tvKQ;
    Button btTinh;
    Button btback;




    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cong);

        //anh xa
        edtsoA = findViewById(R.id.soaC);
        btTinh = findViewById(R.id.btketquaC);
        tvKQ = findViewById(R.id.tvketquaC);
        btback = findViewById(R.id.btback);


        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String x;
                x=edtsoA.getText().toString();
                tvKQ.setText(String.valueOf(x));
                Toast.makeText(Cong.this,  x  , Toast.LENGTH_SHORT).show();
            }

        });
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Cong.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}