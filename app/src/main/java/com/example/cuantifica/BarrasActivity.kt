package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class BarrasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_barras)

        // Botón Atrás
        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            // Volver explícitamente a GraficasActivity
            val intent = Intent(this, GraficasActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP)
            startActivity(intent)
            finish()
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

        // Spinner Magnitud
        val spinnerMagnitud = findViewById<Spinner>(R.id.spinnerMagnitud)
        val adapterMagnitud = ArrayAdapter.createFromResource(
            this,
            R.array.magnitudes,
            R.layout.custom_spinner_item
        )
        adapterMagnitud.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMagnitud.adapter = adapterMagnitud

        // Botón Agregar
        val btnAgregar = findViewById<Button>(R.id.btnAgregar)
        btnAgregar.setOnClickListener {
            val unidad = spinnerUnidad.selectedItem.toString()
            val magnitud = spinnerMagnitud.selectedItem.toString()

            if (unidad == "Selecciona una unidad" || magnitud == "Selecciona una magnitud") {
                Toast.makeText(this, "Por favor selecciona unidad y magnitud.", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Datos agregados correctamente.", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
