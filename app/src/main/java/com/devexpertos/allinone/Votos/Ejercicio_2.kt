package com.devexpertos.allinone.Votos

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import com.devexpertos.allinone.R
import kotlinx.android.synthetic.main.activity_ejercicio_2.*

class Ejercicio_2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_2)

        val bucket = buket.text

        btnAgregar.setOnClickListener {
            if (bucket.isEmpty())
            Toast.makeText(this, "Los campos no deben estar vacios", Toast.LENGTH_SHORT).show()

        }
    }
}