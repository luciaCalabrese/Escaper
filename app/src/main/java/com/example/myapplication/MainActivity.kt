package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val boton1 = findViewById<Button>(R.id.bton)
        val botontienda =  findViewById<Button>(R.id.button2)

        boton1.setOnClickListener {

            val cambiando = Intent(this, MainActivity2::class.java)

            startActivity(cambiando)

        }
        botontienda.setOnClickListener {

            val cambiando = Intent(this, MainActivity3::class.java)

            startActivity(cambiando)

        }

    }
}