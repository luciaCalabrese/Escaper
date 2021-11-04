package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val botonfacil =  findViewById<Button>(R.id.button)

        botonfacil.setOnClickListener {

            val cambiando = Intent(this, facil::class.java)

            startActivity(cambiando)

        }
    }


}