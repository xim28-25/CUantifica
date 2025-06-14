package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import androidx.appcompat.app.AppCompatActivity

class LoadingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loading)

        // Espera 2 segundos y cambia a la pantalla de conexión
        Handler(Looper.getMainLooper()).postDelayed({
            val intent = Intent(this, ConexionActivity::class.java)
            startActivity(intent)
            finish() // Finaliza la actividad splash
        }, 2000) // 2000 ms = 2 segundos
    }
}
