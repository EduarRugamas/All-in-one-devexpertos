package com.devexpertos.allinone.Ecuacion_Cuadratica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import com.devexpertos.allinone.R

class Ejercicio_1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_1)

        val cantidad=findViewById<View>(R.id.buket) as EditText

    }
}