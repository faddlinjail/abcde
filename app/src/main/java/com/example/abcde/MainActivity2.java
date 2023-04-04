package com.example.abcde;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        String name =getIntent().getStringExtra("Name");
        String chipset =getIntent().getStringExtra("CHIPSET");
        String storage=getIntent().getStringExtra("STORAGE");
        int image = getIntent().getIntExtra("IMAGE",0);

        TextView nameTextView = findViewById(R.id.modtextView);
        TextView chipsetTextview= findViewById(R.id.chiptextView6);
        TextView storageTextView = findViewById(R.id.ramtextView2);
        ImageView aaimage= findViewById(R.id.aaimageView);

        nameTextView.setText(name);
        chipsetTextview.setText(chipset);
        storageTextView.setText(storage);
        aaimage.setImageResource(image);
    }
}