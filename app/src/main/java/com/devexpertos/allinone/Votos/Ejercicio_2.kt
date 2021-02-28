package com.devexpertos.allinone.Votos

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.EditText
import com.devexpertos.allinone.R

class Ejercicio_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_2)



        val votos = intArrayOf()


        val votos_1 = votos.filter { candidato -> candidato == 1 }
        val votos_2 = votos.filter { candidato -> candidato == 2 }
        Log.d("votos","cantidad de votos $votos_1")
        Log.d("votos","cantidad de votos $votos_2")
        val votos_total_1 = votos_1.size
        val votos_total_2 = votos_2.size

        Log.d("votos","cantidad de votos $votos_total_1")
        Log.d("votos","cantidad de votos $votos_total_2")


    }
}