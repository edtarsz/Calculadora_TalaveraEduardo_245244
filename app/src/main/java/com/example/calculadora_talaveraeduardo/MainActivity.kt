package com.example.calculadora_talaveraeduardo

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.calculadora_talaveraeduardo.ui.theme.Calculadora_TalaveraEduardoTheme

// Hecho por: Eduardo Talavera Ramos 245244
class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val punto: Button = findViewById(R.id.punto)

        val cero: Button = findViewById(R.id.cero)
        val uno: Button = findViewById(R.id.uno)
        val dos: Button = findViewById(R.id.dos)
        val tres: Button = findViewById(R.id.tres)
        val cuatro: Button = findViewById(R.id.cuatro)
        val cinco: Button = findViewById(R.id.cinco)
        val seis: Button = findViewById(R.id.seis)
        val siete: Button = findViewById(R.id.siete)
        val ocho: Button = findViewById(R.id.ocho)
        val nueve: Button = findViewById(R.id.nueve)

        val suma: Button = findViewById(R.id.btnSuma)
        val resta: Button = findViewById(R.id.btnResta)
        val multi: Button = findViewById(R.id.btnMulti)
        val dividir: Button = findViewById(R.id.btnDividir)
        val igual: Button = findViewById(R.id.btnIgual)
        val limpiar: Button = findViewById(R.id.limpiar)

        val resultado: TextView = findViewById(R.id.resultado)

        var accion = ""
        var operation = false
        var n1 = 0.0
        var n2 = 0.0

        suma.setOnClickListener{
            if(!operation){
                accion = "suma"
                n1 = resultado.text.toString().toDouble()
                resultado.text = ""
                operation = true
            }
        }

        resta.setOnClickListener{
            if(!operation){
                accion = "resta"
                n1 = resultado.text.toString().toDouble()
                resultado.text = ""
                operation = true
            }
        }

        multi.setOnClickListener{
            if(!operation){
                accion = "multi"
                n1 = resultado.text.toString().toDouble()
                resultado.text = ""
                operation = true
            }
        }

        dividir.setOnClickListener{
            if(!operation){
                accion = "division"
                n1 = resultado.text.toString().toDouble()
                resultado.text = ""
                operation = true
            }
        }

        limpiar.setOnClickListener{
            resultado.text = ""
            operation = false
            accion = ""
            n1 = 0.0
            n2 = 0.0
        }

        punto.setOnClickListener {
            if(!resultado.text.contains(".")){
                resultado.append(".")
            }
        }

        // Numeros
        cero.setOnClickListener {
            resultado.append("0")
        }

        uno.setOnClickListener {
            resultado.append("1")
        }

        dos.setOnClickListener {
            resultado.append("2")
        }

        tres.setOnClickListener {
            resultado.append("3")
        }

        cuatro.setOnClickListener {
            resultado.append("4")
        }

        cinco.setOnClickListener {
            resultado.append("5")
        }
        seis.setOnClickListener {
            resultado.append("6")
        }

        siete.setOnClickListener {
            resultado.append("7")
        }

        ocho.setOnClickListener {
            resultado.append("8")
        }

        nueve.setOnClickListener {
            resultado.append("9")
        }

        igual.setOnClickListener{
            n2 = resultado.text.toString().toDouble()

            when (accion) {
                "suma" ->  resultado.text = (n1 + n2).toString()
                "resta" ->  resultado.text = (n1 - n2).toString()
                "multi" ->  resultado.text = (n1 * n2).toString()
                "division" ->  resultado.text = (n1 / n2).toString()
            }

            operation = false
            accion = ""
            n1 = 0.0
            n2 = 0.0
        }

    }
}
