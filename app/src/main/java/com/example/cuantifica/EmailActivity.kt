package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class EmailActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_email)

        val backButton = findViewById<TextView>(R.id.backButton)
        backButton.setOnClickListener {
            // Ir hacia la pantalla de interpretación
            val intent = Intent(this, InterpretacionLinealActivity::class.java)
            startActivity(intent)
            finish() // Opcional, para cerrar la pantalla actual
        }

        // Opcional: aquí podrías manejar validaciones del correo o envíos
    }
}
