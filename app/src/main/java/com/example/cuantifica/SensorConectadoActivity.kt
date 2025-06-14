package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SensorConectadoActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensor_conectado)

        // Botón atrás → regresa a activity_sensores
        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            finish() // Regresa a SensoresActivity si se abrió desde ahí
        }

        // Botón siguiente → ejemplo para seguir el flujo
        val btnSiguiente = findViewById<Button>(R.id.btnSiguiente)
        btnSiguiente.setOnClickListener {
            val intent = Intent(this, InterpretacionLinealActivity::class.java)
            startActivity(intent)
        }
    }
}
