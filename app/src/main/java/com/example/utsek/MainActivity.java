package com.example.utsek;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewAnimator;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button Masuk = findViewById(R.id.btnSignin);
        Masuk.setOnClickListener( btnMasuk);



    }
    private  View.OnClickListener btnMasuk = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            Intent intent = new Intent(MainActivity.this,MenuDosenActivity.class);
            startActivity(intent);
        }
    };
}
