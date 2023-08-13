package com.example.prefe

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import android.widget.Toast.LENGTH_SHORT



class MainActivity : AppCompatActivity() {


    lateinit var txtCodigo:EditText;
    lateinit var txtNombre:EditText;
    lateinit var txtNota1:EditText;
    lateinit var txtNota2:EditText;
    lateinit var txtPromedio:EditText;



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        txtCodigo = findViewById(R.id.txtcodigo);
        txtNombre = findViewById(R.id.txtnombre);
        txtNota1 = findViewById(R.id.txtNota1);
        txtNota2 = findViewById(R.id.txtNota2);
        txtPromedio = findViewById(R.id.txtpromedio);
    }
    fun limpiar(view: View){
        txtCodigo.setText("");
        txtNombre.setText("");
        txtNota1.setText("");
        txtNota2.setText("");
        txtPromedio.setText("");

    }
    fun grabar(view: View){
        if (txtCodigo.text.toString().equals("") || txtNombre.text.toString().equals("") ||  txtNota1.text.toString().equals("") ||  txtNota2.text.toString().equals("")){
            Toast.makeText(this,"Ingrese todos los datos",Toast.LENGTH_SHORT).show();
        }else{
            val codigo = txtCodigo.text.toString();
            var nombre = txtNombre.text.toString();
            var nota1 = txtNota1.text.toString().toInt();
            var nota2 = txtNota2.text.toString().toInt();
            if ((nota1 < 0 || nota1 > 20) || (nota2 < 0 || nota2 > 20)){
                Toast.makeText(this,"Notas Incorrectas...!",Toast.LENGTH_SHORT).show();
            }else{
                var promedio = (nota1 + nota2) / 2;
                val Listadedatos: List<String> = listOf("$nombre","$nota1","$nota2","$promedio")
                val StringDedatos = Listadedatos.joinToString(separator = ",")
                var SharedPreferences=getSharedPreferences("misdatos",MODE_PRIVATE)
                val editor = SharedPreferences.edit()
                editor.putString(codigo, StringDedatos)
                editor.apply()
                Toast.makeText(this,"Datos gurdados...!",Toast.LENGTH_SHORT).show();
            }
        }
    }
    fun recuperar(view: View){

        var SharedPreferences=getSharedPreferences("misdatos",MODE_PRIVATE)
        if (txtCodigo.text.toString().equals("")){
            Toast.makeText(this,"Ingrese el codigo",Toast.LENGTH_SHORT).show();
        }else{
            val codigo = txtCodigo.text.toString();
            val valor = SharedPreferences.getString(codigo, null)
            val ListaDatos = valor?.split(",") ?: emptyList()

            if (ListaDatos.isEmpty()){
                Toast.makeText(this,"No existe ese alumno",Toast.LENGTH_SHORT).show();
            }else{
                txtNombre.setText(ListaDatos[0])
                txtNota1.setText(ListaDatos[1])
                txtNota2.setText(ListaDatos[2])
                txtPromedio.setText(ListaDatos[3])
            }
        }
    }
}