package com.example.calculadora

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import kotlin.math.sqrt
import java.text.DecimalFormat

class MainActivity : AppCompatActivity() {

    // VARIABLES PRINCIPALES
    lateinit var  btn0:Button;
    lateinit var  btn1:Button;
    lateinit var  btn2:Button;
    lateinit var  btn3:Button;
    lateinit var  btn4:Button;
    lateinit var  btn5:Button;
    lateinit var  btn6:Button;
    lateinit var  btn7:Button;
    lateinit var  btn8:Button;
    lateinit var  btn9:Button;
    lateinit var  btnpunto:Button;
    lateinit var  btnsignos:Button;
    lateinit var  btncero:Button;
    lateinit var  btnigual:Button;
    lateinit var  btnmas:Button;
    lateinit var  btnmenos:Button;
    lateinit var  btnmulti:Button;
    lateinit var  btndivisi:Button;
    lateinit var  btnraiz:Button;
    lateinit var  btnporcentaje:Button;
    lateinit var  btninversa:Button;
    lateinit var lblpantalla:TextView;
    lateinit var lblsubpantalla:TextView;
    lateinit var btneliminarpornumero:Button;
    lateinit var btneliminar:Button;


    // VARIABLES AUXILLAES
    var valorInicial:Boolean = true;
    var valor1:Double = 0.0;
    var valor2:Double = 0.0;
    var Operador:String = " ";

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        btn0 = findViewById(R.id.btncero);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnsignos = findViewById(R.id.btnsignos);
        btnpunto = findViewById(R.id.btnpunto);
        btnigual = findViewById(R.id.btnigual);
        btnmas = findViewById(R.id.btnmas);
        btnmenos = findViewById(R.id.btnmenos);
        btnmulti = findViewById(R.id.btnmulti);
        btndivisi = findViewById(R.id.btndivi);
        btnporcentaje = findViewById(R.id.btnporcentaje);
        btninversa = findViewById(R.id.btninversa);
        btnraiz = findViewById(R.id.btnraiz);
        lblpantalla = findViewById(R.id.lblpantalla);
        lblsubpantalla = findViewById(R.id.lblsubpantalla);
        btneliminarpornumero = findViewById(R.id.btnporxmun);
        btneliminar  = findViewById(R.id.btneleiminar);


        // EVENTOS
        // numeros
        btn0.setOnClickListener { if (lblpantalla.text.toString() != "0"){ botonesnumeros("0"); } }
        btn1.setOnClickListener { botonesnumeros("1"); }
        btn2.setOnClickListener { botonesnumeros("2"); }
        btn3.setOnClickListener { botonesnumeros("3"); }
        btn4.setOnClickListener { botonesnumeros("4"); }
        btn5.setOnClickListener { botonesnumeros("5"); }
        btn6.setOnClickListener { botonesnumeros("6"); }
        btn7.setOnClickListener { botonesnumeros("7"); }
        btn8.setOnClickListener { botonesnumeros("8"); }
        btn9.setOnClickListener { botonesnumeros("9"); }
        btnpunto.setOnClickListener { if (valorInicial){ lblpantalla.setText("0.");valorInicial = false; }else{ if ("." !in lblpantalla.text.toString()) { lblpantalla.setText(lblpantalla.text.toString()+".");valorInicial = false; } } }
        btnsignos.setOnClickListener { if(lblpantalla.text.toString() != "0" && lblpantalla.text.toString().isNotBlank()){ if ("-" !in lblpantalla.text.toString()) { lblpantalla.setText("-"+lblpantalla.text.toString()); } } }




        //operaciones con dos variables
        btnmas.setOnClickListener { operadores("+");}
        btnmenos.setOnClickListener { operadores("-");}
        btnmulti.setOnClickListener { operadores("*");}
        btndivisi.setOnClickListener { operadores("/"); }

        //operaciones con !dos variables

        btnraiz.setOnClickListener {
            valor1 = lblpantalla.text.toString().toDouble();
            if(valor1 >= 0.0){
                lblsubpantalla.text = "√($valor1) = ";
                lblpantalla.setText(sqrt(valor1).toString());
                valor1 =  lblpantalla.text.toString().toDouble();
                valorInicial = true;
            }
        }

        btnporcentaje.setOnClickListener {
            valor1 = lblpantalla.text.toString().toDouble();
            if (valor1 != 0.0) {        //(10/100) * 100
                lblsubpantalla.text = "$valor1% = "
                lblpantalla.setText((valor1 * 0.01).toString());
                valor1 = lblpantalla.text.toString().toDouble();
                valorInicial = true;
            }
        }

        btninversa.setOnClickListener {

            valor1 = lblpantalla.text.toString().toDouble();
            if (valor1 != 0.0) {
                lblsubpantalla.text = "1/$valor1 = "
                lblpantalla.setText(String.format("%.2f", (1/valor1)).toString());
                valor1 = lblpantalla.text.toString().toDouble();
                valorInicial = true;
            }
        }



        // igualdad
        btnigual.setOnClickListener {
            valor2 = lblpantalla.text.toString().toDouble();
            when (Operador){
                "+" ->{
                    lblsubpantalla.text = lblsubpantalla.text.toString()+" "+ valor2+" =";
                    lblpantalla.text=(valor1+valor2).toString();
                    valor1 = lblpantalla.text.toString().toDouble();
                    valorInicial = true;
                }
                "-" ->{
                    lblsubpantalla.text = lblsubpantalla.text.toString()+" "+ valor2+" =";
                    lblpantalla.text=(valor1-valor2).toString();
                    valor1 = lblpantalla.text.toString().toDouble();
                    valorInicial = true;
                }
                "*" ->{
                    lblsubpantalla.text = lblsubpantalla.text.toString()+" "+ valor2+" =";
                    lblpantalla.text=(valor1*valor2).toString();
                    valor1 = lblpantalla.text.toString().toDouble();
                    valorInicial = true;
                }
                "/" ->{
                    if (valor2 != 0.0){
                        lblsubpantalla.text = lblsubpantalla.text.toString()+" "+ valor2+" =";
                        lblpantalla.text=(valor1/valor2).toString();
                        valor1 = lblpantalla.text.toString().toDouble();
                        valorInicial = true;
                    }else{
                        lblpantalla.text = "No se puede dividir entre cero";
                        valorInicial = true;
                    }

                }
            }


        }























        btneliminar.setOnClickListener {
            valorInicial = true;
            lblpantalla.text = "0";
            lblsubpantalla.text ="";
            valor1 = 0.0;
            valor2 = 0.0;

        }

        btneliminarpornumero.setOnClickListener {
            Eliminarpornumero();
        }





    }
    // FUNCIONES

    fun operadores(operador:String){
        valor1 = lblpantalla.text.toString().toDouble();
        lblsubpantalla.text = "$valor1 $operador";
        Operador = operador;
        valorInicial = true;
    }

    fun Eliminarpornumero() {
        val valoractual = lblpantalla.text.toString()
        if (!valoractual.isEmpty()) {
            val valornuevo = valoractual.substring(0, valoractual.length - 1)
            lblpantalla.setText(valornuevo);
        }
    }

    fun botonesnumeros(num:String){

        if (valorInicial){
            lblpantalla.setText(num);
            valorInicial = false;
        }else{
            lblpantalla.setText(lblpantalla.text.toString()+num);
        }
    }




}