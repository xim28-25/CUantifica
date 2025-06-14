package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AppCompatActivity

class InterpretacionLinealActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_interpretacion)

        // ← Botón "Atrás"
        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Regresa a LinealActivity
        }

        // Recibir datos
        val unidad = intent.getStringExtra("unidad")
        val magnitud = intent.getStringExtra("magnitud")

        // Spinners
        val spinnerUnidad = findViewById<Spinner>(R.id.spinnerUnidad)
        val spinnerMagnitud = findViewById<Spinner>(R.id.spinnerMagnitud)

        val adapterUnidad = ArrayAdapter.createFromResource(
            this,
            R.array.unidades,
            android.R.layout.simple_spinner_item
        )
        adapterUnidad.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerUnidad.adapter = adapterUnidad

        val adapterMagnitud = ArrayAdapter.createFromResource(
            this,
            R.array.magnitudes,
            android.R.layout.simple_spinner_item
        )
        adapterMagnitud.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
        spinnerMagnitud.adapter = adapterMagnitud

        // Mostrar valores recibidos desde LinealActivity
        unidad?.let {
            val index = adapterUnidad.getPosition(it)
            if (index >= 0) spinnerUnidad.setSelection(index)
        }

        magnitud?.let {
            val index = adapterMagnitud.getPosition(it)
            if (index >= 0) spinnerMagnitud.setSelection(index)
        }

        // Botón Eliminar
        val btnEliminar = findViewById<Button>(R.id.btnEliminar)
        btnEliminar.setOnClickListener {
            // Regresa a la pantalla de gráficas
            val intent = Intent(this, GraficasActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }


        // Botón Siguiente
        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            // 👉 Lanzar la actividad EmailActivity
            val intent = Intent(this, EmailActivity::class.java)
            startActivity(intent)
        }
    }
}
