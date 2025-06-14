package com.example.cuantifica

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MateriasActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_materias)

        val backLabel = findViewById<TextView>(R.id.backLabel)
        backLabel.setOnClickListener {
            finish()
        }

        val cardQuimica = findViewById<LinearLayout>(R.id.cardQuimica)
        cardQuimica.setOnClickListener {
            startActivity(Intent(this, SensoresActivity::class.java))
        }

        val fisicaImage = findViewById<ImageView>(R.id.fisica)
        fisicaImage.setOnClickListener {
            startActivity(Intent(this, BarrasActivity::class.java))
        }

        val biologiaCard = findViewById<LinearLayout>(R.id.biologia)
        biologiaCard.setOnClickListener {
            startActivity(Intent(this, LinealActivity::class.java))
        }
    }
}
