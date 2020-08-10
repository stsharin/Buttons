package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Final_Defence extends AppCompatActivity {

    PDFView defense;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_final__defence);

        defense=(PDFView) findViewById(R.id.pdf3);
        defense.fromAsset("finaldefence.pdf").load();
    }
}
