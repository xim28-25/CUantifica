package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class ConexionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conexion)

        val btnConectar = findViewById<Button>(R.id.btnConectar)

        btnConectar.setOnClickListener {
            val intent = Intent(this, MateriasActivity::class.java)
            startActivity(intent)
        }
    }
}

