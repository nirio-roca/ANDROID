package com.example.bascara

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView

class actsecundario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_actsecundario)

            val bundle = intent.extras;
            val a = bundle?.getString("a").toString().toDouble();
            val b = bundle?.getString("b").toString().toDouble();
            val c = bundle?.getString("c").toString().toDouble();
            val respos:Double;
            val respnega:Double;
            val auxillar:Double;


            auxillar = (Math.pow(b.toDouble(),2.toDouble())) - 4*a*c;

            respos = (-b + (Math.sqrt(auxillar)))/2*a;
            respnega = (-b - (Math.sqrt(auxillar)))/2*a;

            val txtx1= findViewById<EditText>(R.id.txtx1)
            val txtx2= findViewById<EditText>(R.id.txtx2);

            val lblobser = findViewById<TextView>(R.id.lblobservacion);

            if ( a == 0.0 || auxillar < 0.0){
                lblobser.text="No se puede realizar la operación"
            }else{
                txtx1.setText(respos.toString());
                txtx2.setText(respnega.toString());
            }



    }

    fun  volver(view:View){
        val intento = Intent(this,MainActivity::class.java)

        startActivity(intento);
    }


}