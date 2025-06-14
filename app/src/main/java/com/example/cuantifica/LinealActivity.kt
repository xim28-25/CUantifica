package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class LinealActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lineal)

        // Botón Atrás
        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Regresa a activity_graficas.xml
        }

        // Spinner Unidad
        val spinnerUnidad = findViewById<Spinner>(R.id.spinnerUnidad)
        val adapterUnidad = ArrayAdapter.createFromResource(
            this,
            R.array.unidades,
            R.layout.custom_spinner_item
        )
        adapterUnidad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerUnidad.adapter = adapterUnidad
        spinnerUnidad.setSelection(0) // Muestra "pH"

        // Spinner Magnitud
        val spinnerMagnitud = findViewById<Spinner>(R.id.spinnerMagnitud)
        val adapterMagnitud = ArrayAdapter.createFromResource(
            this,
            R.array.magnitudes,
            R.layout.custom_spinner_item
        )
        adapterMagnitud.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMagnitud.adapter = adapterMagnitud
        spinnerMagnitud.setSelection(0) // Muestra "0–14"

        // Botón Agregar
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        btnAgregar.setOnClickListener {
            val unidad = spinnerUnidad.selectedItem.toString()
            val magnitud = spinnerMagnitud.selectedItem.toString()

            // Aquí puedes usar los datos, pero por ahora solo pasamos a la siguiente pantalla:
            val intent = Intent(this, InterpretacionLinealActivity::class.java)
            intent.putExtra("unidad", unidad)
            intent.putExtra("magnitud", magnitud)
            startActivity(intent)
        }
    }
}
