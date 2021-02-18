package com.example.dautonismoview

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.BindingBuildInfo
import androidx.databinding.DataBindingUtil
import androidx.databinding.DataBindingUtil.setContentView
import androidx.lifecycle.ViewModelProvider
import com.example.dautonismoview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    lateinit var viewmodel: MainViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        viewmodel=ViewModelProvider(this).get(MainViewModel::class.java)

        binding.viewmodel = viewmodel
        //falta colocar o vielw mmodel aqui com o binding
        binding.lifecycleOwner=this


        binding.buttonTeste1.setOnClickListener {
            intent = Intent(this,teste::class.java)
            val bundle=Bundle()
           // bundle.putInt("botao",1)
            //bundle.putParcelable("view",viewmodel);
            intent.putExtra("view",viewmodel);

            startActivityForResult(intent,1);
        }
        binding.buttonTeste2.setOnClickListener {
            intent = Intent(this,teste::class.java)
            val bundle=Bundle()
            bundle.putInt("botao",2)
            intent.putExtras(bundle)
            startActivityForResult(intent,2);
        }
        binding.button3.setOnClickListener {
            intent = Intent(this,teste::class.java)
            val bundle=Bundle()
            bundle.putInt("botao",3)
            intent.putExtras(bundle)
            startActivityForResult(intent,3);
        }
    }


    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {

        //Toast.makeText(this,"onActiviti!",Toast.LENGTH_SHORT).show()
        super.onActivityResult(requestCode, resultCode, data)


        val parametro:Bundle? = data?.extras
        val botao = parametro?.getInt("botao")
        parametro?.getInt("resposta")

        when(resultCode) {
            Activity.RESULT_CANCELED -> {
                // Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
            }
            else -> {
                when {

                    requestCode == 1 -> {
//                        resposta_1 = parametro!!.getInt("resposta1");
//                        binding.texto?.resp_1 = parametro.getString("usuario")!!;
                        binding.invalidateAll()
                    }
                    requestCode == 2 -> {
//                        resposta_2 = parametro!!.getInt("resposta2");
//                        binding.texto?.resp_2 = parametro.getString("usuario")!!;
                        binding.invalidateAll()
                    }
                    requestCode == 3 -> {

//                        resposta_3 = parametro!!.getInt("resposta3");
//                        binding.texto?.resp_3 = parametro.getString("usuario")!!;
                        binding.invalidateAll()
                    }
                    else -> {

                        Toast.makeText(this, "algo deu errado no onactivity!", Toast.LENGTH_SHORT)
                            .show()
                    }
                }
            }


        }

    }


}