package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SensoresActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sensores)

        // Botón "Atrás"
        val backLabel = findViewById<TextView>(R.id.backLabel)
        backLabel.setOnClickListener {
            finish()
        }

        // Ícono de usuario que navega al perfil
        val userIcon = findViewById<ImageView>(R.id.userIcon)
        userIcon.setOnClickListener {
            val intent = Intent(this, PerfilActivity::class.java)
            startActivity(intent)
        }

        // Puedes agregar aquí listeners para sensores si los necesitas
    }
}
