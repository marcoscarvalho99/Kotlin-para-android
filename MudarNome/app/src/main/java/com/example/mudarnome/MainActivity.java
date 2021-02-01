package com.example.mudarnome;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void mudarNome(View view){

        TextView  texto  = findViewById(R.id.texto);

        Random aleatorio = new Random();
         int num = aleatorio.nextInt(10);
        texto.setText("texto  Alterado com Sucesso "+num);



    }
    public void mudarTela(View view){




    }
}