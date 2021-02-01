package com.example.testedautonismo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.testedautonismo.databinding.ActivityTela2Binding

class Tela2 : AppCompatActivity() {
    lateinit var binding :ActivityTela2Binding
    var botao:Int?=null
    val bundle=Bundle()
    var texto=Texto ("Resposta 1","Resposta 2","Resposta 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)
        binding=DataBindingUtil.setContentView(this,R.layout.activity_tela2)
        binding.texto =texto

        var parametro :Bundle?= intent.extras
        botao = parametro?.getInt("botao")

        when {
             botao == 1 ->  binding.imageView.setImageResource(R.drawable.teste_1)
            botao == 2 -> binding.imageView.setImageResource(R.drawable.teste_2)
            botao == 3 -> binding.imageView.setImageResource(R.drawable.teste_3)
            else -> Toast.makeText(this,"Erro no Sistema", Toast.LENGTH_SHORT).show()
        }

        binding.buttonOk.setOnClickListener {

            if (binding.TextUsuario.text!!.isEmpty()){
                Toast.makeText(this,"Por favor insira um dado", Toast.LENGTH_SHORT).show()
            }else{

                intent = Intent(this,MainActivity::class.java)

                when{
                    botao ==1 ->{
                        if (binding.TextUsuario.text.toString() =="16"){

                            bundle.putInt("resposta1",1)

                            //Toast.makeText(this,binding.TextUsuario.text.toString(), Toast.LENGTH_SHORT).show()
                        }else{

                            bundle.putInt("resposta1",2)
                          //  Toast.makeText(this,binding.TextUsuario.text.toString(), Toast.LENGTH_SHORT).show()
                        }
                    }
                    botao ==2 ->{
                        if (binding.TextUsuario.text.toString() =="2"){
                           // Toast.makeText(this,binding.TextUsuario.text.toString(), Toast.LENGTH_SHORT).show()
                            bundle.putInt("resposta2",1)
                        }else{

                            bundle.putInt("resposta2",2)
                        }

                    }
                    botao ==3 ->{
                        if (binding.TextUsuario.text.toString() =="74"){
                           // Toast.makeText(this,binding.TextUsuario.text.toString(), Toast.LENGTH_SHORT).show()
                            bundle.putInt("resposta3",1)
                        }else{

                            bundle.putInt("resposta3",2)
                        }
                    }

                    else -> Toast.makeText(this,"Erro no Sistema", Toast.LENGTH_SHORT).show()
                }
                bundle.putString("usuario",binding.TextUsuario.text.toString())
                intent.putExtras(bundle)


                setResult(Activity.RESULT_OK,intent)
                finish()
            }


        }
        binding.buttonCancelar.setOnClickListener {
            intent = Intent()
            intent.putExtra("btnCancelar", "Cancelado")
            setResult(Activity.RESULT_CANCELED,intent)
            //startActivity(intent);
            finish()
        }

    }



}