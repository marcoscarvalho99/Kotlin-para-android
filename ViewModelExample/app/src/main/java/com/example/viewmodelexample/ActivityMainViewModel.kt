package com.example.viewmodelexample

import android.text.Editable
import android.view.View
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.liveData

class ActivityMainViewModel : ViewModel() {
    var cont =MutableLiveData<Int>(0);
   private  var _texto=MutableLiveData<String>("");
    var texto : LiveData<String> = _texto;
    fun incrementa(){
        cont.value=cont.value!!.plus(1);
    }
    fun afterTextChanged(editable: Editable){
        _texto.value=editable.toString();
    }
}