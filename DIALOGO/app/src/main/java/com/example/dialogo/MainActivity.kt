package com.example.dialogo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}


fun AlertDialog.createSimpleDialog(view: View){
    val builder = AlertDialog.Builder(this.context)
    builder.setTitle("Dialog Title")
    builder.setMessage("Dialog Message")
    builder.setPositiveButton("OK") { dialog, which ->
        // Do something when the positive button is clicked
    }
    builder.setNegativeButton("Cancel") { dialog, which ->
        // Do something when the negative button is clicked
    }
    val dialog = builder.create()
    dialog.show()


}