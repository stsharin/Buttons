package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Semester_Drop extends AppCompatActivity {

    PDFView semdrop;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_semester__drop);

        semdrop=(PDFView) findViewById(R.id.pdf6);
        semdrop.fromAsset("semdrop.pdf").load();
    }
}
