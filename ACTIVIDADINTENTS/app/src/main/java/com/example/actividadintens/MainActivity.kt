package com.example.actividadintens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import org.w3c.dom.Text


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun  enviarDatos(view:View) {
        // Declarar y crear el intent


        // PRIEMERA FORMA DE INTENS
        val intento = Intent(this, actSecundario::class.java);
        intento.putExtra("NombreP", "Nirio");
        intento.putExtra("NombreS", "Nicols");
        intento.putExtra("ApellidoP", "Rocca");
        intento.putExtra("ApellidoM", "Apaza");
        intento.putExtra("Edad", "20");
        intento.putExtra("Genero", "Masculino");

        // SEGUNDA FORMA DE INNTENTS

        val intento2 = Intent(this, actSecundario::class.java).apply {
            putExtra("NombreP", "Nirio");
            putExtra("NombreS", "Nicols");
            putExtra("ApellidoP", "Rocca");
            putExtra("ApellidoM", "Apaza");
            putExtra("Edad", "20");
            putExtra("Genero", "Masculino");
        }



        // Iniciar la actividad
        startActivity(intento);

    }
}