package com.example.share

import android.annotation.SuppressLint
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var txtnombre:EditText;
    val SharedPreference = getSharedPreferences("mis_datos", MODE_PRIVATE);
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtnombre =findViewById(R.id.txtvalor)

    }

    fun grabar(view:View){
        val editor =SharedPreference.edit()
        editor.putString("Nombre",txtnombre.text.toString())
        editor.apply()
        txtnombre.setText("")
    }
    fun recuperar(view:View){
        val valor = SharedPreference.getString("Nombre","default value")
        txtnombre.setText(valor.toString())
    }
}