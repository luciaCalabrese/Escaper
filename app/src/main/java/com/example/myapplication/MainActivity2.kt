package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botonfacil =  findViewById<Button>(R.id.button)

        botonfacil.setOnClickListener {

            val cambiando = Intent(this, facil::class.java)

            startActivity(cambiando)

        }
        val botonIntermedio =  findViewById<Button>(R.id.button3)

        botonIntermedio.setOnClickListener {

            val cambiando = Intent(this, Nivelintermedio::class.java)

            startActivity(cambiando)

        }
        val atras =  findViewById<ImageView>(R.id.imageView)

        atras.setOnClickListener {

            val cambiando = Intent(this, MainActivity::class.java)

            startActivity(cambiando)

        }
        val dificiles=  findViewById<Button>(R.id.button4)

        dificiles.setOnClickListener {

            val cambiando = Intent(this, dificil::class.java)

            startActivity(cambiando)

        }
    }


}