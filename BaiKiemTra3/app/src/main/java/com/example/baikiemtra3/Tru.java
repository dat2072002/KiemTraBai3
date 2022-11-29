package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Tru extends AppCompatActivity {
    EditText edtsoA;
    TextView tvKQ;
    Button btTinh;
    Button btback;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tru);

        //anh xa
        edtsoA = findViewById(R.id.soaT);
        btTinh = findViewById(R.id.btketquaT);
        tvKQ = findViewById(R.id.tvketquaT);
        btback = findViewById(R.id.btback);

        btTinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String x;
                x=edtsoA.getText().toString();
                tvKQ.setText(String.valueOf(x));
                Toast.makeText(Tru.this,  x  , Toast.LENGTH_SHORT).show();
            }

        });
        btback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tru.this,MainActivity.class);
                startActivity(i);
            }
        });
    }
}