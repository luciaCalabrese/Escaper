package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageView

class tienda : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tienda)

        val atras =  findViewById<ImageView>(R.id.imageView2)

        atras.setOnClickListener {

            val cambiando = Intent(this, main::class.java)

            startActivity(cambiando)

        }
    }
}