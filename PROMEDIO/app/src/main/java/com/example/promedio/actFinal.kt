package com.example.promedio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class actFinal : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_final)

        val bundle = intent.extras;
        val Usuario = bundle?.getString("Usuario").toString()
        val Promedio = bundle?.getString("Promedio").toString()
        val Estado = bundle?.getString("estado").toString()
        val  lbluser  = findViewById<TextView>(R.id.lblNombre).apply {
            text = Usuario;
        }

        val  lblnota  = findViewById<TextView>(R.id.lblpromedio).apply {
            text = Promedio;
        }
        val  lblestado  = findViewById<TextView>(R.id.lblestado).apply {
            text = Estado;
        }


    }
}