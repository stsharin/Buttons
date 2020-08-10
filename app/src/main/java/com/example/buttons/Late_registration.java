package com.example.buttons;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.github.barteksc.pdfviewer.PDFView;

public class Late_registration extends AppCompatActivity {

    PDFView ltreg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_late_registration);

        ltreg=(PDFView) findViewById(R.id.pdf5);
        ltreg.fromAsset("latereg.pdf").load();
    }
}
