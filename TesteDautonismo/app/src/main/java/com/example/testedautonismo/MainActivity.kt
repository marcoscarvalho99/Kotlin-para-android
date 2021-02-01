package com.example.testedautonismo

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import com.example.testedautonismo.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    var resposta_1:Int= 0;
    var resposta_2:Int= 0;
    var resposta_3:Int= 0;
    var texto=Texto ("Resposta 1","Resposta 2","Resposta 3")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        binding.texto= texto;

        binding.buttonTest1.setOnClickListener {

          //  Toast.makeText(this,"botao1", Toast.LENGTH_SHORT).show()
            intent = Intent(this,Tela2::class.java)
            val bundle=Bundle()
            bundle.putInt("botao",1)
            intent.putExtras(bundle)
            startActivityForResult(intent,1);
        }
        binding.buttonTest2.setOnClickListener {

            //Toast.makeText(this,"clicou botao2",Toast.LENGTH_SHORT).show()

            intent = Intent(this,Tela2::class.java)
            val bundle=Bundle()
            bundle.putInt("botao",2)
            intent.putExtras(bundle)
            val s= startActivityForResult(intent,2);
        }
        binding.buttonTest3.setOnClickListener {

            //Toast.makeText(this,"clicou botao 3",Toast.LENGTH_SHORT).show()
            intent = Intent(this,Tela2::class.java)
            val bundle=Bundle()
            bundle.putInt("botao",3)
            intent.putExtras(bundle)
            startActivityForResult(intent,3);
        }
        binding.buttonVerificar.setOnClickListener {

        if (resposta_1==0 || resposta_2==0 || resposta_2==0){
            Toast.makeText(this,"clicou resultado, precisa antes ter todas as respostas",Toast.LENGTH_SHORT).show()
        }else {
            if (resposta_1 == 1 && resposta_2 == 1 && resposta_3 == 1) {
                binding.textViewResultado.text =
                    "você acertou todas não precisa se preocupar não sofre de Dutonismo"
            } else if (resposta_1 == 1 && resposta_2 == 2 && resposta_3 == 1) {
                binding.textViewResultado.text =
                    "você acertou a primeira e ultima não precisa se preocupar tanto, mas procure um medico"
            } else if (resposta_1 == 1 && resposta_2 == 1 && resposta_3 == 2) {
                binding.textViewResultado.text =
                    "você acertou a primeira e segunda não precisa se preocupar tanto, mas procure um medico"
            } else if (resposta_1 == 1 && resposta_2 == 2 && resposta_3 == 2) {
                binding.textViewResultado.text =
                    "você acertou a primeira(qualquer pessoa ver) mas precisa se preocupar errou as duas opções que ajudam a saber se você sofre de Dutonismo, procure um medico"
            } else if (resposta_1 == 2 && resposta_2 == 1 && resposta_3 == 1) {
                binding.textViewResultado.text =
                    "não tem daltonismo voçê pode ter problema de vista errou a primeira"
            } else if (resposta_1 == 2 && resposta_2 == 1 && resposta_3 == 2) {
                binding.textViewResultado.text =
                    "você errou a primeira e a terceira,  procure um medico talvez tennha problema de vista"
            } else if (resposta_1 == 2 && resposta_2 == 2 && resposta_3 == 1) {
                binding.textViewResultado.text =
                    "você errou a primeira e a segunda,  procure um medico voçê pode ter problema de vista"
            } else if (resposta_1 == 2 && resposta_2 == 2 && resposta_3 == 2) {
                binding.textViewResultado.text =
                    "você errou todas,  pode ter daltonismo e problema de vista procure um medico"
            } else {
                Toast.makeText(this, "algo deu errado me desculpe!", Toast.LENGTH_SHORT).show()
            }

        }
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
                        resposta_1 = parametro!!.getInt("resposta1");
                        binding.texto?.resp_1 = parametro.getString("usuario")!!;
                        binding.invalidateAll()
                    }
                    requestCode == 2 -> {
                        resposta_2 = parametro!!.getInt("resposta2");
                        binding.texto?.resp_2 = parametro.getString("usuario")!!;
                        binding.invalidateAll()
                    }
                    requestCode == 3 -> {

                        resposta_3 = parametro!!.getInt("resposta3");
                        binding.texto?.resp_3 = parametro.getString("usuario")!!;
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