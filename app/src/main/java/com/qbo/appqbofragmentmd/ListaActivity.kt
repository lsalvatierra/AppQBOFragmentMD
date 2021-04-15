package com.qbo.appqbofragmentmd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.qbo.appqbofragmentmd.adapter.AndroidAdapter
import com.qbo.appqbofragmentmd.databinding.ActivityListaBinding
import com.qbo.appqbofragmentmd.datos.DatosAndroid
import com.qbo.appqbofragmentmd.model.Android

class ListaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaBinding.inflate(layoutInflater)
        val vista = binding.root
        setContentView(vista)
        val datosAndroid = DatosAndroid()
        binding.rvandroid.adapter = AndroidAdapter(datosAndroid.listaVersionesAndroid()
            , this)
        binding.rvandroid.layoutManager = LinearLayoutManager(this)
    }



}