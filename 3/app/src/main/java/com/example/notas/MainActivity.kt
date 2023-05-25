package com.example.notas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var txtPro:EditText;
        lateinit var txtActi:EditText;
        lateinit var txtConcep:EditText;
        lateinit var btnCalcular:Button;
        lateinit var lblResultado:TextView;


        txtPro=findViewById(R.id.txtPro);
        txtActi=findViewById(R.id.txtActi);
        txtConcep=findViewById(R.id.txtCon);
        btnCalcular=findViewById(R.id.btnCalcular);
        lblResultado = findViewById(R.id.lblResultado);

        btnCalcular.setOnClickListener {

            val pro = txtPro.text.toString().toDouble();
            val act = txtActi.text.toString().toDouble();
            val con = txtConcep.text.toString().toDouble();

            val promedio = Math.round((pro+act+con)/3);

            lblResultado.text="Su promedio es: $promedio";

        }



    }
}