package com.example.barbearia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.example.barbearia.telas.CadastroActivity;

public class MainActivity extends AppCompatActivity {

    private EditText email;
    private  EditText senha;
    private TextView resultado;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        email = findViewById(R.id.email);
        senha = findViewById(R.id.senha);
        resultado = findViewById(R.id.resultado);
    }

    public void irTelaCadastro(View view){
        Intent intent = new Intent(MainActivity.this, CadastroActivity.class);
        startActivity(intent);

    }
    public void Logar(View view){
        if(senha.getText().toString().isEmpty() || email.getText().toString().isEmpty()){

            resultado.setText("Por favor preenchar os campos senha e email corretamentes");

        }else{

        resultado.setText("sistema incompleto bd caro cliente:" + email.getText().toString());

        }

    }
}