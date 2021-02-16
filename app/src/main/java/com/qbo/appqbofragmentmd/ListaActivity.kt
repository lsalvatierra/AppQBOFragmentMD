package com.qbo.appqbofragmentmd

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.qbo.appqbofragmentmd.adapter.AndroidAdapter
import com.qbo.appqbofragmentmd.databinding.ActivityListaBinding
import com.qbo.appqbofragmentmd.model.Android

class ListaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListaBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListaBinding.inflate(layoutInflater)
        val vista = binding.root
        setContentView(vista)
        val lstAndroid : ArrayList<Android> = ArrayList();
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image1,
            "Apple Pie",
            "Android 1.0"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image2,
            "Banana Bread",
            "Android 1.1"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image3,
            "Cupcake",
            "Android 1.5"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image4,
            "Donut",
            "Android 1.6"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image5,
            "Eclair",
            "Android 2.0-2.1"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image6,
            "Froyo",
            "Android 2.2"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image7,
            "Gingerbread",
            "Android 2.3"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image8,
            "Honeycomb",
            "Android 3.0"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image9,
            "Ice cream sandwich",
            "Android 4.0"))
        lstAndroid.add(Android(lstAndroid.size +1,
            R.drawable.image10,
            "Jelly bean",
            "Android 4.1-4.2-4.3"))

        binding.rvandroid.adapter = AndroidAdapter(lstAndroid, this)
        binding.rvandroid.layoutManager = LinearLayoutManager(this)
    }



}