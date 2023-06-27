package com.example.bascara

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

    fun enviardatos(view:View){

        // Declaracion

        val txta = findViewById<EditText>(R.id.txta);
        val txtb = findViewById<EditText>(R.id.txtb);
        val txtc = findViewById<EditText>(R.id.txtc);

        val intento =Intent(this,actsecundario::class.java).apply {
            putExtra("a",txta.text.toString());
            putExtra("b",txtb.text.toString());
            putExtra("c",txtc.text.toString());
        }
        startActivity(intento);

    }

}