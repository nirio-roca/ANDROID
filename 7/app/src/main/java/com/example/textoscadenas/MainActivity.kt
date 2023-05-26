package com.example.textoscadenas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var  txtsoles:EditText;
    lateinit var  btnconveritr:Button;
    lateinit var  lblresultado:TextView;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //val txtsoles = findViewById<EditText>(R.id.txtsoles)
        txtsoles = findViewById(R.id.txtsoles);
        btnconveritr = findViewById(R.id.btnconvertir);

        lblresultado = findViewById(R.id.lblresultado);

        btnconveritr.setOnClickListener {
            val Soles  = txtsoles.text.toString().toDouble();
            val Dodalar:Double;

            Dodalar = Soles/3.70;
            lblresultado.isVisible = true;
            lblresultado.setText(String.format("El monto equivalente en dòlares\n\tEs: %.2f",Dodalar))

        }

        //setText(String.format("El monto equivalente en dòlares\nEs: %.2f"))
    }
}