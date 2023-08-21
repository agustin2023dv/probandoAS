package com.example.calculadora

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora.ui.theme.CalculadoraTheme

class MainActivity : ComponentActivity() {

    // Declaro variable
    var tvResultado:TextView?=null;


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)
        //Linkeo la variable buscando x id

        tvResultado = findViewById(R.id.tvResultado);

    }
 // No entiendo bien porque la funcion debe ir afuera del anterior metodo
    fun calcular(view:View){
        var boton = view as Button
        var textoBoton= boton.text.toString()
        var concatenar = tvResultado?.text.toString()+textoBoton
        var mostrar = quitarCerosIzq(concatenar)

        if(textoBoton=="="){
            var resultado = 0.0

        }
    };

    fun quitarCerosIzq(str:String):String{
        var i=0;
        while(i<str.length && str[i]=='0')i++
        val sb = StringBuffer(str)
        sb.replace(0,i,"")
        return sb.toString()
    }
}







