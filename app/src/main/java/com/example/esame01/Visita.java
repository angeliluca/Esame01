package com.example.roseto;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class visita extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_visita);
    }
    public void open_cartina(View view) {
        Intent intent = new Intent(this,cartina.class);
        startActivity(intent); }
}
