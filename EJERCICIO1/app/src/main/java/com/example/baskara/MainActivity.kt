package com.example.baskara

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var  txta:EditText;
    lateinit var  txtb:EditText;
    lateinit var  txtc:EditText;

    lateinit var  btnresultado:Button;
    lateinit var  lblresultado:TextView;

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txta = findViewById(R.id.txta);
        txtb = findViewById(R.id.txtb);
        txtc = findViewById(R.id.txtc)

        lblresultado = findViewById(R.id.lblresultado);

        btnresultado  =findViewById(R.id.btncalcular);

        btnresultado.setOnClickListener {
            val a = txta.text.toString().toDouble();
            val b = txtb.text.toString().toDouble();
            val c = txtc.text.toString().toDouble();
            val respos:Double;
            val respnega:Double;
            val auxillar:Double;
            auxillar = (Math.pow(b.toDouble(),2.toDouble())) - 4*a*c;

            respos = (-b + (Math.sqrt(auxillar)))/2*a;
            respnega = (-b - (Math.sqrt(auxillar)))/2*a;

            lblresultado.text="Valor de X+: $respos\nValor de X-: $respnega"












        }



    }
}