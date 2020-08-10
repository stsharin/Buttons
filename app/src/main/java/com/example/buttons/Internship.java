package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Internship extends AppCompatActivity {

    PDFView internship;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_internship);

        internship=(PDFView) findViewById(R.id.pdf4);
        internship.fromAsset("Internship.pdf").load();
    }
}
