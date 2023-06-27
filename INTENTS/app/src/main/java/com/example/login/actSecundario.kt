package com.example.login

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView

class actSecundario : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_secundario)
        //Obtener el mensaje extra que viene del otro formuladio

        val Mensaje = intent.getStringExtra(MENSAJE_EXTRA);

        val lblnombre = findViewById<TextView>(R.id.lblnombre).apply {
            text = Mensaje;
        }

    }
    fun  CerraSesion(view:View){
        val intent = Intent(this,MainActivity::class.java)

        startActivity(intent);
    }


}