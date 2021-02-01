package com.example.kotlinmisera

import android.app.Instrumentation
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(),View.OnClickListener {

    var botao: Button?=null
    var senha: EditText?= null
    var email: EditText?= null
    var textoResultado:TextView?=null
    val senhaPad: String ="12345"
    val emailPad: String ="marcos"





    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        botao=findViewById(R.id.login)
        senha=findViewById(R.id.rsrs)
        email=findViewById(R.id.email)
        textoResultado=findViewById(R.id.resultado)
    }



    override fun onClick(v: View?) {
        if (email!!.text.isEmpty()|| senha!!.text.isEmpty()){
            textoResultado?.setText("senha ou login invalidos")

        }else if (senhaPad != senha!!.text.toString() && emailPad==email!!.text.toString()){
            textoResultado?.setText("senha não existe")
        }else if(senhaPad != senha!!.text.toString() && emailPad!=email!!.text.toString()){
            textoResultado?.setText("email e senha não batem")
        }
        else {
            intent = Intent(this,tela2::class.java)
            val bundle=Bundle()
            bundle.putString("nome",email!!.text.toString())
           // bundle.putFloat("num", 10.0F)
            intent.putExtras(bundle)
            startActivityForResult(intent,1)
        }
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        var parametro=data?.extras

        textoResultado?.text="o resultado"
    }

}