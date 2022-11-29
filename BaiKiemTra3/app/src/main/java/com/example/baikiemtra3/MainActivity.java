package com.example.baikiemtra3;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout llC,llT,llN,llCH,llLOG,llMOD,llBP,llCAN;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //anh xa
        llC=findViewById(R.id.cPT);
        llT=findViewById(R.id.tPT);
        llN=findViewById(R.id.nPT);
        llCH=findViewById(R.id.chPT);
        llLOG=findViewById(R.id.logPT);
        llMOD=findViewById(R.id.modPT);
        llBP=findViewById(R.id.bpPT);
        llCAN=findViewById(R.id.canPT);


        llC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Cong.class);
                startActivity(i);
            }
        });


        llT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Tru.class);
                startActivity(i);
            }
        });


        llN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Nhan.class);
                startActivity(i);
            }
        });


        llCH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Chia.class);
                startActivity(i);
            }
        });

        llLOG.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Log.class);
                startActivity(i);
            }
        });

        llMOD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,Mod.class);
                startActivity(i);
            }
        });

        llBP.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,BinhPhuong.class);
                startActivity(i);
            }
        });

        llCAN.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this,CanBac2.class);
                startActivity(i);
            }
        });

    }
}