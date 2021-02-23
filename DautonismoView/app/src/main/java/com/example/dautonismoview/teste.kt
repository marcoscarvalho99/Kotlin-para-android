package com.example.dautonismoview

import android.app.Activity
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Parcelable
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import com.example.dautonismoview.databinding.ActivityMainBinding
import com.example.dautonismoview.databinding.ActivityTesteBinding

class teste : AppCompatActivity() {

    lateinit var binding: ActivityTesteBinding
    var botao:Int?=0;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_teste)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_teste)
        //val viewmodel = intent.extras?.getParcelable<MainViewModel>("view");
        //var viewmodel = intent.extras?.getParcelable<Parcelable>("view")

        var parametro :Bundle?= intent.extras
        botao = parametro?.getInt("botao")
        val viewmodel= parametro?.getParcelable<MainViewModel>("view")

       // viewmodel as MainViewModel;
        binding.viewmodelteste = viewmodel
        binding.lifecycleOwner=this

//fçã0


        when {
            //botao == 1 ->  binding.imageView.setImageResource(R.drawable.teste_1)
            //botao == 2 -> binding.imageView.setImageResource(R.drawable.teste_2)
            //botao == 3 -> binding.imageView.setImageResource(R.drawable.teste_3)
            else -> Toast.makeText(this,"Erro no Sistema", Toast.LENGTH_SHORT).show()
        }
//

    binding.buttonCancelar.setOnClickListener {
       viewmodel?.prencher();

        setResult(Activity.RESULT_CANCELED,intent)

        finish()

    }
    binding.buttonOk.setOnClickListener(){
        setResult(Activity.RESULT_OK,intent)
     finish()   ;
    }
    }


}