package com.example.loginh

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Button
import androidx.core.view.isVisible

class MainActivity : AppCompatActivity() {

    lateinit var  txtusuario: EditText;
    lateinit var  txtclave: EditText;
    lateinit var  btninciar: Button;
    lateinit var  lblresultado: TextView;
    lateinit var  lblcontador: TextView;

    var usuario:String ="Nirio"
    var clave:String ="1234Nirio"
    var contador:Int = 3;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtusuario = findViewById(R.id.txtusuario);
        txtclave = findViewById(R.id.txtclave);
        btninciar = findViewById(R.id.btniniciar);
        lblresultado = findViewById(R.id.lblresultado);
        lblcontador = findViewById(R.id.lblcontador);

        btninciar.setOnClickListener {
            val usuarioin:String = txtusuario.text.toString();
            val clavein:String = txtclave.text.toString();


            if (contador <= 3 && contador > 0){
                if(usuario === usuarioin && clave === clavein){
                    lblresultado.text="SESION INICIADA"
                }else{
                    contador -=1;
                    lblcontador.text="$contador";
                }
            }else{
                  btninciar.isActivated=false;
               lblresultado.text="Ya no tiene mas intentos"
            }


        }



    }
    //FUNCION
    fun llamarActividad(view:View){

    }







}