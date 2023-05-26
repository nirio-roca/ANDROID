package com.example.unoporciento

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.lang.Integer.parseInt
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    lateinit var txtenero:EditText;
    lateinit var txtfebrero:EditText;
    lateinit var txtmarzo:EditText;
    lateinit var txtabril:EditText;
    lateinit var btncalcula:Button;
    lateinit var lblresultado:TextView;
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        /*
        * Ejercicio 02
Dadas las ventas de los meses:
Enero   12500
Febrero 24600
Marzo   64000
Abril   35000
Calcular la suma total y el % de cada mes
        * */

        txtenero = findViewById(R.id.txtenero);
        txtfebrero = findViewById(R.id.txtfebrero);
        txtmarzo = findViewById(R.id.txtmarzo);
        txtabril = findViewById(R.id.txtabril);
        btncalcula = findViewById(R.id.btncalcular)
        lblresultado = findViewById(R.id.lblresultado);

        btncalcula.setOnClickListener(View.OnClickListener {
            val Enero:Double= txtenero.text.toString().toDouble();
            val Febrero:Double= txtfebrero.text.toString().toDouble();
            val Marzo:Double=  txtmarzo.text.toString().toDouble();
            val Abril:Double=  txtabril.text.toString().toDouble();

            val  DecimalFormat = DecimalFormat("#.##");





            val sumatotal: String = DecimalFormat.format(Enero + Febrero + Marzo + Abril);

            val  Eneropor =  (parseInt(sumatotal.toString()) / parseInt(Enero.toString()))* 100;
            val  Febreropor = DecimalFormat.format((Febrero*0.01)*100);
            val  Marzopor = DecimalFormat.format((Marzo*0.01)*100);
            val  Abrilpor = DecimalFormat.format((Abril*0.01)*100);



            lblresultado.text = """
|- SUMA TOTAL ENERO - ABRIL  : $sumatotal
|- DE ENERO               : $Eneropor % 
|- DE FEBRERO             : $Febreropor %   
|- DE MARZO               : $Marzopor % 
|- DE ABRIL               : $Abrilpor % """.trimMargin()
        })









    }
}