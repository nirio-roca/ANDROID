package com.example.areacilindro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //A = 2π r h + 2π r²

        lateinit var txtradio:EditText;
        lateinit var txtaltura:EditText;
        lateinit var btnCalcular:Button;
        lateinit var btlimpiar:Button;
        lateinit var lblresultado:TextView;

        txtradio  = findViewById(R.id.txtradio);
        txtaltura  = findViewById(R.id.txtaltura);
        btnCalcular  = findViewById(R.id.btncalcular);
        btlimpiar  = findViewById(R.id.btnlimpiar);
        lblresultado  = findViewById(R.id.lblresultado);

        btnCalcular.setOnClickListener {
            val r = txtradio.text.toString().toDouble();
            val h = txtaltura.text.toString().toDouble();
            val pi:Double;
                 pi = 3.1416
            val areaCir = Math.abs(2*pi*r*(r+h));
                //π.r²+h
            val periCir = Math.abs((pi*(r*r)*h));

            lblresultado.text="Area Cilindro: $areaCir \nVolumen Cilindro: $periCir";

        }

        btlimpiar.setOnClickListener {
            txtaltura.setText("");
            txtradio.setText("");
            lblresultado.text="";
        }




    }
}