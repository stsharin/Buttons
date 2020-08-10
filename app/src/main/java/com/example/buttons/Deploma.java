package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Deploma extends AppCompatActivity {

    PDFView deploma;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deploma);

        deploma=(PDFView) findViewById(R.id.pdf2);
        deploma.fromAsset("deploma.pdf").load();
    }
}
