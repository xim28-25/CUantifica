package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PhSensorActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_ph_sensor)

        // Botón "Atrás"
        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            finish()
        }

        // Botón "Siguiente"
        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val intent = Intent(this, GraficasActivity::class.java)
            startActivity(intent)
            // finish() // Descomenta esta línea si quieres cerrar esta pantalla al avanzar
        }
    }
}
