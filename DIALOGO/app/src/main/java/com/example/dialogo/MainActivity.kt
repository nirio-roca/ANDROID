package com.example.dialogo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnalert = findViewById<Button>(R.id.btnllamar)

        btnalert.setOnClickListener {
            createSimpleDialog("Este es la alert")
        }

    }
    fun createSimpleDialog(titulo:String):AlertDialog{
        val builder = AlertDialog.Builder(this)
        builder.setTitle(titulo)
        builder.setMessage("Dialog Message")
        builder.setPositiveButton("Aceptar") { dialog, which ->
            aceptar()
        }
        builder.setNegativeButton("Cancelar") { dialog, which ->
            cancelar()
        }
        val dialog = builder.create()
        dialog.show()
        return  dialog;
    }
    fun  aceptar(){
        Toast.makeText(this, "Bienvenido", Toast.LENGTH_SHORT).show()
    }
    fun  cancelar(){
        Toast.makeText(this, "Cancelado", Toast.LENGTH_SHORT).show()
    }
}

