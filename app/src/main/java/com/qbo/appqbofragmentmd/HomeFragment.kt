package com.qbo.appqbofragmentmd

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.google.android.material.snackbar.Snackbar
import com.qbo.appqbofragmentmd.databinding.FragmentHomeBinding


class HomeFragment : Fragment(), View.OnClickListener {

    private  var _binding: FragmentHomeBinding? = null
    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        //val view = binding.root
        binding.btnregistrar.setOnClickListener(this)
        return binding.root
        //return inflater.inflate(R.layout.fragment_home, container, false)
    }

    //2.
    fun obtenerGeneroSeleccinado():String{
        var genero = ""
        when(binding.rggenero.checkedRadioButtonId){
            R.id.rbmasculino -> {
                genero = binding.rbmasculino.text.toString()
            }
            R.id.rbfemenino -> {
                genero = binding.rbfemenino.text.toString()
            }
        }
        return genero
    }

    //1.
    fun enviarMensaje(vista: View, mensajeError: String){
        val snackbar = Snackbar.make(vista, mensajeError, Snackbar.LENGTH_LONG)
        val snackBarView: View = snackbar.view
        snackBarView.setBackgroundColor(
            ContextCompat.getColor(requireActivity(),
            R.color.success))
        snackbar.show()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    override fun onClick(v: View?) {
        var infousuario = "Usuario: ${binding.etusername.text.toString()}" +
                " - Password: ${binding.etpassword.text.toString()}  - Genero ${obtenerGeneroSeleccinado()}"
        enviarMensaje(v!!, infousuario)
    }

}