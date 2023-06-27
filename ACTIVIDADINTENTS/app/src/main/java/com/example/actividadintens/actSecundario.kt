package com.example.actividadintens

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import androidx.core.text.set

class actSecundario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_secundario)
        //Obtener el mensaje extra que viene del otro formulario

        // BUNDLE Son espacion de memoria que acompañan a los procedimientos y administra los putExtra
        // Parcelas entre estos dos administra los putExtra
        val bundle = intent.extras
        // Se pone ? por no se saben que variable contien
        val NombreP = bundle?.getString("NombreP").toString()
        val NombreS = bundle?.getString("NombreS").toString()
        val ApellidoP = bundle?.getString("ApellidoP").toString()
        val ApellidoM = bundle?.getString("ApellidoM").toString()
        val Edad = bundle?.getString("Edad").toString()
        val Genero = bundle?.getString("Genero").toString()

        val txtNombres = findViewById<EditText>(R.id.txtNombres)
        val txtApellidos = findViewById<EditText>(R.id.txtApellidos)
        val txtEdad = findViewById<EditText>(R.id.txtEdad)
        val txtGenero = findViewById<EditText>(R.id.txtGenero)

        // Completos

        val Nombres = "$NombreP $NombreS"
        val Apellidos = "$ApellidoP $ApellidoM"


        txtNombres.setText(Nombres);
        txtApellidos.setText(Apellidos);
        txtEdad.setText(Edad);
        txtGenero.setText(Genero);

    }
}