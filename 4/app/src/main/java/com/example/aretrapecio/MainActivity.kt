package com.example.aretrapecio

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.aretrapecio.R.id.lblresultado

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //A=(a+b)/2 x h
        lateinit var txtBmenor:EditText;
        lateinit var txtBmayor:EditText;
        lateinit var txtAltura:EditText;
        lateinit var btnCalcular:Button;
        lateinit var lblResultado:TextView;

        txtBmenor = findViewById(R.id.txtBmenor);
        txtBmayor = findViewById(R.id.txtBmayor);
        txtAltura = findViewById(R.id.txtAltura);

        btnCalcular = findViewById(R.id.btnCalcular);

        lblResultado = findViewById(lblresultado);

        btnCalcular.setOnClickListener {

            val a = txtBmenor.text.toString().toDouble();
            val b = txtBmayor.text.toString().toDouble();
            val h = txtAltura.text.toString().toDouble();
            //A=(a+b)/2 x h
            val areaTra = ((a+b)/2)*h;

            lblResultado.text="Área Trapecio: $areaTra";
        }

    }
}