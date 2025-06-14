package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ConfirmacionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_confirmacion)

        // Botón Atrás: regresa a la pantalla de interpretación
        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            val intent = Intent(this, InterpretacionLinealActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP
            startActivity(intent)
        }

        // Botón "Regresar al inicio" (opcional)
        val btnInicio = findViewById<Button>(R.id.btnVolverInicio)
        btnInicio.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK
            startActivity(intent)
            finish()
        }
    }
}
