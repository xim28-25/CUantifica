package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class GraficasActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_graficas)

        // Botón "Atrás" que cierra esta pantalla
        val backLabel = findViewById<TextView>(R.id.backLabel)
        backLabel.setOnClickListener {
            finish()
        }

        // Imagen de gráfica lineal
        val lineChartImage = findViewById<ImageView>(R.id.lineChartImage)
        lineChartImage.setOnClickListener {
            val intent = Intent(this, LinealActivity::class.java)
            startActivity(intent)
        }

        // Imagen de gráfica de barras
        val barChartImage = findViewById<ImageView>(R.id.barChartImage)
        barChartImage.setOnClickListener {
            val intent = Intent(this, BarrasActivity::class.java)
            startActivity(intent)
        }
    }
}
