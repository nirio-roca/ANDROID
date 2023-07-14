package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun  inciar(view:View) {

        //Aqui se ponde el codigo a ejecutar al hacer click en el btn
        val txtUsuario  = findViewById<EditText>(R.id.txtuser);
        val txtClave  = findViewById<EditText>(R.id.txtpass);
        var Usuario:String = txtUsuario.text.toString();
        var Clave:String = txtClave.text.toString();

        if (Usuario == "Nirio" && Clave == "123"){
            //llamar a otra actividad
            // Declarar y crear el intent

            val intento = Intent(this, actNotas::class.java).apply {
                putExtra("Usuario",Usuario );
            }
            // Iniciar la actividad
            startActivity(intento);

        }else{
            txtClave.text.clear();
            txtUsuario.text.clear();
            Toast.makeText(this,"No esta registrado",Toast.LENGTH_SHORT).show();
        }



    }
}