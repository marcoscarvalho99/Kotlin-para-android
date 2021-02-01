package com.example.kotlinmisera

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView


class tela2 : AppCompatActivity() {

    lateinit var texto1: TextView
     lateinit var buto1:Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        texto1=findViewById(R.id.resultadoNome)
        buto1=findViewById(R.id.btn)
        buto1?.setOnClickListener {

            val bundle=Bundle();
            var parametro = intent.extras
           val nom= parametro?.getString("nome")
            parametro?.putString("cadastro","deus")
            bundle.putInt("valor",1)
            intent.putExtras(bundle)

             texto1?.setText(nom)
            intent= Intent(this,MainActivity::class.java)
            setResult(5,intent)
            startActivity(intent);
        }
    }





}