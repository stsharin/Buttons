package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Concern extends AppCompatActivity {

    PDFView concern;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_concern);

        concern=(PDFView) findViewById(R.id.pdf1);
        concern.fromAsset("concern.pdf").load();
    }
}
