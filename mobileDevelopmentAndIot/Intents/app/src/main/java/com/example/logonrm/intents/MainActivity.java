package com.example.logonrm.intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrir(View view) {

        //abrir nova activity com uma intenção
        Intent it = new Intent(this, Tela2Acivity.class);
        startActivity(it);

    }
}
