package com.example.areacirculo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var txtarea:EditText;
        lateinit var btnarea:Button;
        lateinit var lblResultado:TextView;

        txtarea = findViewById(R.id.txtRadio);
        lblResultado = findViewById(R.id.lblResultado);
        btnarea = findViewById(R.id.btnCalcular)
        btnarea.setOnClickListener {
            //Declaraciòn variables
            val radio:Double;
            val pi:Double;
            val area:Double;
            pi = 3.1416

            radio = txtarea.text.toString().toDouble();

            area = pi*(radio*radio);

            lblResultado.text = "Àrea del circulo es : $area";


        }


    }
}