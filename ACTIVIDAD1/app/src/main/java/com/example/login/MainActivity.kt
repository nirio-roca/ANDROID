package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun  enviarDato(view:View) {
        // Declarar y crear el intent
        val txtusuario = findViewById<EditText>(R.id.txtusuario);

        val usuario = txtusuario.text.toString();

        // PRIEMERA FORMA DE INTENS
        val intento = Intent(this, actSecundario::class.java);
        intento.putExtra("Usuario", usuario);
        // Iniciar la actividad
        startActivity(intento);

    }


}