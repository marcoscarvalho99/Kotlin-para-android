package com.example.dautonismoview

import android.content.Intent
import android.os.Parcel
import android.os.Parcelable
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.versionedparcelable.ParcelField
import com.example.dautonismoview.databinding.ActivityMainBinding

class MainViewModel() : ViewModel(), Parcelable {
    var valor1 = MutableLiveData<String>("resultado");
    var valor2 = MutableLiveData<String>("resultado");
    var valor3 = MutableLiveData<String>("resultado");

    constructor(parcel: Parcel) : this() {

    }

    fun prencher(){

        valor1.value="acessou"
        //intent =Intent(MainActivity::class.java,MainActivity2::class.java)
    }
    fun verificar(){
//setar no testo resultado o resultado
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {

    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<MainViewModel> {
        override fun createFromParcel(parcel: Parcel): MainViewModel {
            return MainViewModel(parcel)
        }

        override fun newArray(size: Int): Array<MainViewModel?> {
            return arrayOfNulls(size)
        }
    }
}

