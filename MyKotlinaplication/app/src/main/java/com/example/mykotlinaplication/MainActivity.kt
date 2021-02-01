package com.example.mykotlinaplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
val senhaPad: String ="12345"
val emailPad: String ="marcos"
var buton: Button? = null;
var email: EditText? = null
var senha: EditText? = null
var resultado:TextView? =null

class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

         buton = this.findViewById(R.id.logar)
         email = this.findViewById(R.id.email)
         senha = this.findViewById(R.id.senha)
         resultado=this.findViewById(R.id.resultado);




    }



    override fun onClick(v: View?) {

        this.validar()

    }


    public fun irMenu(){
        intent =  Intent(this,MainActivity2::class.java)
        startActivity(intent)
    }

    public  fun validar() {
        if (email!!.text.isEmpty()|| senha!!.text.isEmpty()){
            resultado!!.setText("senha ou login invalidos")

        }else if (senhaPad != senha!!.text.toString() && emailPad==email!!.text.toString()){
            resultado!!.setText("senha não existe")
        }else if(senhaPad != senha!!.text.toString() && emailPad!=email!!.text.toString()){
            resultado!!.setText("email e senha não batem")
        }
        else{
            this.irMenu()
        }
    }

}