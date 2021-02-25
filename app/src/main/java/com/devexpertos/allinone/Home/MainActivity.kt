package com.devexpertos.allinone.Home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.devexpertos.allinone.Ecuacion_Cuadratica.Ejercicio_1
import com.devexpertos.allinone.R
import com.devexpertos.allinone.Salarios.Ejercicio_3
import com.devexpertos.allinone.Votos.Ejercicio_2
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        ecuacion.setOnClickListener {
            val ecuacion = Intent(this, Ejercicio_1::class.java)
            startActivity(ecuacion)
        }

        votos.setOnClickListener {
            val votos = Intent(this, Ejercicio_2::class.java)
            startActivity(votos)
        }

        salarios.setOnClickListener {
            val salario = Intent(this, Ejercicio_3::class.java)
            startActivity(salario)
        }







    }
}