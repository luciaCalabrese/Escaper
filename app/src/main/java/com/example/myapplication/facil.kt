package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class facil : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_facil)

        val botonfacil =  findViewById<ImageView>(R.id.imageView17)

        botonfacil.setOnClickListener {

            val cambiando = Intent(this, MainActivity2::class.java)

            startActivity(cambiando)

        }
    }
}