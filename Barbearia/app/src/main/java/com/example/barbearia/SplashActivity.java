package com.example.barbearia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;

import com.example.barbearia.MainActivity;
import com.example.barbearia.R;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
//ESCONDER A ACTION BAR
    getSupportActionBar().hide();
    //ACTIVITI EXIBIDA EM FULL ESCRENN

    getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);

    new Handler().postDelayed(new Runnable() {
        @Override
        public void run() {
            //agente passsa para main activite
            startActivity(new Intent(getBaseContext(), MainActivity.class));
            //para que essa activite seja destruida apos a primeira entrada.
            finish();
        }
        //5 segundos em milisegudos
    },3000);
    }
}