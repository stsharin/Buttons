package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btn_concern, btn_deploma, btn_defense, btn_internship, btn_ltreg, btn_semdrop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_concern=(Button) findViewById(R.id.button1);
        btn_deploma=(Button) findViewById(R.id.button2);
        btn_defense=(Button) findViewById(R.id.button3);
        btn_internship=(Button) findViewById(R.id.button4);
        btn_ltreg=(Button) findViewById(R.id.button5);
        btn_semdrop=(Button) findViewById(R.id.button6);


        btn_concern.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(MainActivity.this,Concern.class);
                startActivity(i);
            }
        });


        btn_deploma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent i2= new Intent(MainActivity.this,Deploma.class);
                startActivity(i2);
            }
        });


        btn_defense.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i3= new Intent(MainActivity.this,Final_Defence.class);
                startActivity(i3);

            }
        });


        btn_internship.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i4= new Intent(MainActivity.this,Internship.class);
                startActivity(i4);

            }
        });

        btn_ltreg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i5= new Intent(MainActivity.this,Late_registration.class);
                startActivity(i5);

            }
        });


        btn_semdrop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i6= new Intent(MainActivity.this,Semester_Drop.class);
                startActivity(i6);

            }
        });




    }
}
