package com.example.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.isVisible

const val  MENSAJE_EXTRA ="com.example.login.MESSAGE";
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun llamarActividad(view:View){
        //Aqui se ponde el codigo a ejecutar al hacer click en el btn
        val txtUsuario  = findViewById<EditText>(R.id.txtusuario);
        val txtClave  = findViewById<EditText>(R.id.txtclave);
        var Usuario:String = txtUsuario.text.toString();
        var Clave:String = txtClave.text.toString();

        if (Usuario == "Nirio" && Clave == "123"){
            //llamar a otra actividad
            val intent = Intent(this,actSecundario::class.java).apply {
                putExtra(MENSAJE_EXTRA,Usuario)
            }

            startActivity(intent);



        }else{
            txtClave.text.clear();
            txtUsuario.text.clear();
            Toast.makeText(this,"No esta registrado",Toast.LENGTH_SHORT).show();
        }


    }

}