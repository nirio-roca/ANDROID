package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class actSecundario : AppCompatActivity() {
    @SuppressLint("WrongViewCast", "MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_secundario)

        val bundle = intent.extras;

        val usuario= bundle?.getString("Usuario")

        val lblusuario = findViewById<TextView>(R.id.lblusuarioexites).apply {
            text = usuario
        }

        val lblnivel = findViewById<TextView>(R.id.lblnivel).apply {
            when (usuario){
                "admin" -> {
                    text = "Administrador"
                }
                "Cajero1" -> {
                    text = "Caja"

                }
                "Cajero2" -> {
                    text = "Caja"

                }
                "Vendedor1" -> {
                    text = "Ventas"

                }
                "Vendedor2" -> {
                    text = "Ventas"

                }
                "Contador" -> {
                    text = "Contabilidad"

                }
                "Soporte" -> {
                    text = "Mantenimiento"

                }
                else -> {
                    text = "Usuario no existe"
                }
            }
        }


    }
    fun  CerraSesion(view:View){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent);
    }


}