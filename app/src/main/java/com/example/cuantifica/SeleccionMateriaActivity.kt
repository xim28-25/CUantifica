package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class SeleccionMateriaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materias)

        // ← Botón Atrás
        val backLabel = findViewById<TextView>(R.id.backLabel)
        backLabel.setOnClickListener {
            finish() // Regresa a la pantalla anterior
        }

        // Imagen Química
        val quimicaImage = findViewById<ImageView>(R.id.quimica)
        quimicaImage.setOnClickListener {
            val intent = Intent(this, LinealActivity::class.java)
            startActivity(intent)
        }

        // Imagen Física
        val fisicaImage = findViewById<ImageView>(R.id.fisica)
        fisicaImage.setOnClickListener {
            val intent = Intent(this, BarrasActivity::class.java)
            startActivity(intent)
        }

        // Imagen Biología
        val biologiaImage = findViewById<ImageView>(R.id.biologia)
        biologiaImage.setOnClickListener {
            val intent = Intent(this, LinealActivity::class.java) // Cambia esto si usas otra actividad
            startActivity(intent)
        }
    }
}
