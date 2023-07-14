package com.example.promedio

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class actNotas : AppCompatActivity() {
    var Usuario="";
    lateinit var txtnota1:EditText;
    lateinit var txtnota2:EditText;
    lateinit var txtnota3:EditText;
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_act_notas)

        val bundle = intent.extras;
        Usuario = bundle?.getString("Usuario").toString()
        val  user  = findViewById<TextView>(R.id.lblusuario).apply {
            text = Usuario;
        }

        txtnota1  = findViewById<EditText>(R.id.txtnota1);
        txtnota2  = findViewById<EditText>(R.id.txtnota2);
        txtnota3  = findViewById<EditText>(R.id.txtnota3);
    }

    fun  ProcesarNotas(view: View) = //Aqui se ponde el codigo a ejecutar al hacer click en el btn
        if (txtnota1.text.toString().equals("") || txtnota2.text.toString().equals("") || txtnota3.text.toString().equals("")){
            Toast.makeText(this,"Ingrese notas", Toast.LENGTH_SHORT).show();
        }else{
            val  Nota1 = txtnota1.text.toString().toInt();
            val  Nota2 = txtnota2.text.toString().toInt();
            val  Nota3= txtnota3.text.toString().toInt();

            var menor = Nota1;

            if (Nota2 < menor){
                menor = Nota2
            }
            if (Nota3 < menor){
                menor < Nota3
            }

            var promedio:Int = Nota1 + Nota2 + Nota3;

            promedio = (promedio - menor)/2;

            var estado = "";

            if (promedio >= 13){
                estado = "Aprobado"
            }else if (promedio >= 10){
                estado = "Desaprovado"}
            else{
                estado = "Reprobado"
            }



            val intento = Intent(this, actFinal::class.java).apply {
                putExtra("Usuario",Usuario );
                putExtra("Promedio",promedio.toString());
                putExtra("estado",estado);
            }
            // Iniciar la actividad
            startActivity(intento);
        }
}