package com.example.cuantifica

import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class PerfilActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_alumno)

        // Botón "Atrás"
        val backLabel = findViewById<TextView>(R.id.backLabel)
        backLabel.setOnClickListener {
            finish()
        }

        // Botón de usuario (puedes enlazarlo con configuración o perfil)
        val userIcon = findViewById<ImageView>(R.id.userIcon)
        userIcon.setOnClickListener {
            // Aquí puedes navegar a una pantalla de perfil o configuración si lo deseas
        }

        // Aquí puedes añadir listeners a cada ítem si deseas que abran nuevas actividades
        // Por ejemplo:
        // val homeItem = findViewById<LinearLayout>(R.id.itemHome)
        // homeItem.setOnClickListener {
        //     startActivity(Intent(this, HomeActivity::class.java))
        // }
    }
}
