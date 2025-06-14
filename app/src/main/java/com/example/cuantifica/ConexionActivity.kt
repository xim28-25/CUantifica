package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class ConexionActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_conexion)

        val editTextIp = findViewById<EditText>(R.id.editTextIp)
        val btnConectar = findViewById<Button>(R.id.btnConectar)

        btnConectar.setOnClickListener {
            val ip = editTextIp.text.toString().trim()

            if (ip.isEmpty()) {
                Toast.makeText(this, "Por favor ingresa una IP", Toast.LENGTH_SHORT).show()
            } else {
                // Aquí podrías guardar o validar la IP antes de avanzar
                val intent = Intent(this, MainActivity::class.java)
                intent.putExtra("ip", ip)
                startActivity(intent)
            }
        }
    }
}
