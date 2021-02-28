package com.devexpertos.allinone.Salarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.*
import com.devexpertos.allinone.R
import kotlinx.android.synthetic.main.activity_ejercicio_3.*

class Ejercicio_3 : AppCompatActivity() {

    lateinit var option: Spinner
    lateinit var cargo: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ejercicio_3)

        val nomb = findViewById<EditText>(R.id.nombre)
        val apel = findViewById<EditText>(R.id.apellidos)
        val sal = findViewById<EditText>(R.id.salarioBase)
        val hrs = findViewById<EditText>(R.id.hrs)
        var afp = 0.075
        var isss = 0.03
        var renta = 0.10





            /*option = findViewById(R.id.spinnerMenu) as Spinner
            cargo = findViewById(R.id.cargo) as TextView

            val options = arrayOf("Gerente", "Asistente", "Secretaria")

            option.adapter = ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, options)

            option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                override fun onItemSelected(
                    parent: AdapterView<*>?,
                    view: View?,
                    position: Int,
                    id: Long
                ) {
                    cargo.text = options[position]
                }
                override fun onNothingSelected(parent: AdapterView<*>?) {
                    cargo.text = "Seleccione una opcion"
                }

        }*/

    }

}
