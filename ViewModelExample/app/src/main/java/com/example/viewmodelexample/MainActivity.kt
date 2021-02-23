package com.example.viewmodelexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.widget.addTextChangedListener
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelexample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding : ActivityMainBinding;
    lateinit var viewModel: ActivityMainViewModel;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding= DataBindingUtil.setContentView(this,R.layout.activity_main)
        viewModel= ViewModelProvider(this).get(ActivityMainViewModel::class.java);
        binding.viewmodel = viewModel; //ligção do viel model com a variavel view model
        binding.lifecycleOwner=this; //binde se torna dono do ciclo de vida

        //binding.contTexto.setText(viewModel.cont.toString());
//        viewModel.cont.observe(this, Observer{
//            binding.contTexto.text=it.toString()
//        })
//        viewModel.texto.observe(this, Observer {
//
//            binding.textotextView.text=it;
//        })
//
//        binding.TextoeditText.addTextChangedListener{
//            viewModel.texto.value =it.toString()
//            //binding.textotextView.text=viewModel.texto
//        }

    }
}
//priemeira implementação.

//binding.TextoeditText.addTextChangedListener{
//    viewModel.texto =it.toString()
//    binding.textotextView.text=viewModel.texto
//}
//binding.buttonCont.setOnClickListener(){
//
//    viewModel.cont++;
//    binding.contTexto.setText(viewModel.cont.toString())
//    binding.invalidateAll();
//}