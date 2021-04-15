package com.qbo.appqbofragmentmd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import com.qbo.appqbofragmentmd.adapter.AndroidAdapter
import com.qbo.appqbofragmentmd.databinding.FragmentGaleriaBinding
import com.qbo.appqbofragmentmd.databinding.FragmentHomeBinding
import com.qbo.appqbofragmentmd.datos.DatosAndroid

class GaleriaFragment : Fragment() {

    private  var _binding: FragmentGaleriaBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!


    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        _binding = FragmentGaleriaBinding.inflate(inflater, container, false)
        val datosAndroid = DatosAndroid()
        binding.rvandroidfrag.adapter = AndroidAdapter(datosAndroid.listaVersionesAndroid()
            , requireActivity())
        binding.rvandroidfrag.layoutManager = LinearLayoutManager(requireActivity())
        return binding.root
    }

}