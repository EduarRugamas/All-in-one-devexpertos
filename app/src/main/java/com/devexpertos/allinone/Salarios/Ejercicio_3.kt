package com.devexpertos.allinone.Salarios

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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

        //calcSueldo.setOnClickListener {
        // Toast.makeText(this, "Los campos estan vacios", Toast.LENGTH_SHORT).show()
        //}

        option = findViewById(R.id.spinnerMenu) as Spinner
        cargo = findViewById(R.id.cargo) as TextView

        val options = arrayOf("Gerente", "Asistente", "Secretaria")

        option.adapter = ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,options)

        option.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onItemSelected(
                parent: AdapterView<*>?,
                view: View?,
                position: Int,
                id: Long
            ) {
                cargo.text = options.get(position)

            }

            override fun onNothingSelected(parent: AdapterView<*>?) {
                cargo.text = "Seleccione una opcion"
            }

        }

    }
}

