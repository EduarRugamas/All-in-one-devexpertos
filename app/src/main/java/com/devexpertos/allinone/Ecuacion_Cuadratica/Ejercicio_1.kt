package com.devexpertos.allinone.Ecuacion_Cuadratica

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.util.Log
import android.widget.Toast
import com.devexpertos.allinone.R
import kotlinx.android.synthetic.main.activity_ejercicio_1.*
import java.lang.Math.pow
import kotlin.math.pow
import kotlin.math.sqrt

class Ejercicio_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_1)



        val valo_A =  valorA.text
        val valor_B = valorB.text
        val valor_C = valorC.text


            calcularEcuacion.setOnClickListener {
                if (valo_A.isEmpty() || valor_B.isEmpty() || valor_C.isEmpty()){
                    Toast.makeText(this, "Los campos estan vacios", Toast.LENGTH_SHORT).show()
                }else {
                    calculo_ecuacion(valo_A, valor_B, valor_C)
                }
            }

    }

    @SuppressLint("SetTextI18n")
    private fun calculo_ecuacion(a:Editable, b:Editable, c:Editable){

        val A = a.toString().toDouble()
        val B = b.toString().toDouble()
        val C = c.toString().toDouble()

        val result_determinante:Double = B.pow(2) - (4*A*C)

        Log.d("determinante","variable result $result_determinante")

        when {
            result_determinante > 0 -> {

                val x1 = (-B + sqrt(result_determinante)) / 2*A
                val x2 = (-B - sqrt(result_determinante)) / 2*A

                Toast.makeText(this, "La ecuacion contiene dos respuestas", Toast.LENGTH_SHORT).show()

                resultado1.text = "Resultado con signo postivo $x1"
                resultado2.text = "Resultado con signo negativo $x2"

            }
            result_determinante == 0.0 -> {

                val x1 = (-B + sqrt(result_determinante)) / 2*A
                Toast.makeText(this, "La escuacion solo tiene una solucion", Toast.LENGTH_SHORT).show()
                resultado1.text = "Resultado unico de la ecuacion $x1"
                resultado2.text = "Se a obtenido 0 como resultado"
            }

            result_determinante < 0 -> {
                Toast.makeText(this, "No se puede calcular con numeros negativos", Toast.LENGTH_SHORT).show()
                resultado1.text = "La respuesta es un numero negativo por lo tanto no se puede calcular"
            }

        }

    }
}