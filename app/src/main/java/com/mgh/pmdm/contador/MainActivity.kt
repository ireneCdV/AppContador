package com.mgh.pmdm.contador

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.util.Log

class MainActivity : AppCompatActivity() {

    var contador=0
    val TAG="ESTADOS_CONTADOR"
   // a.toString()



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "En el metodo onCreate")
        setContentView(R.layout.activity_main)

        // Referencia al TextView
        val textViewContador=findViewById<TextView>(R.id.textViewContador)

        // Inicializamos el TextView con el contador a 0
        textViewContador.setText(contador.toString())

        // Referencia al botón
        val btAdd=findViewById<Button>(R.id.btAdd)
        val btResta=findViewById<Button>(R.id.btResta)

        // Asociaciamos una expresióin lambda
        // como respuesta (callback)
        // al evento Clic sobre el botón
        btAdd.setOnClickListener {
            contador++
            textViewContador.setText(contador.toString())
        }

        // Asociaciamos una expresióin lambda
        // como respuesta (callback)
        // al evento Clic sobre el botón
        btResta.setOnClickListener {
            contador--
            textViewContador.setText(contador.toString())
        }


    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "En el metodo onStart")
     }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "En el metodo onResume")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "En el metodo onPause")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "En el metodo onStop")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "En el metodo onRestart")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "En el metodo onDestroy")
    }

    override fun onSaveInstanceState(estadoAGuardar: Bundle) {
        super.onSaveInstanceState(estadoAGuardar)
        Log.d(TAG, "onSaveInstanceState. Guardo contador con valor "+ contador.toString())
        estadoAGuardar.putInt("CONTADOR", contador)
    }

    override fun onRestoreInstanceState(estadoARestaurar: Bundle) {
        super.onRestoreInstanceState(estadoARestaurar)
        contador=estadoARestaurar.getInt("CONTADOR")
        Log.d(TAG, "onRestoreInstanceState. Restauro al contador el valor " +contador.toString())

     val
             textViewContador:TextView=findViewById(R.id.textViewContador)
    textViewContador.setText(contador.toString())
    }
}