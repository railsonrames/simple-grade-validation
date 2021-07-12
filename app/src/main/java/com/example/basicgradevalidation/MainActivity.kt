package com.example.basicgradevalidation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCalcular = botaoCalcular
        val resultado = resultado

        btnCalcular.setOnClickListener {

            val nota1 = primeiraNota.text.toString().toDouble()
            val nota2 = segundaNota.text.toString().toDouble()
            val media = (nota1 + nota2) / 2
            val qtdFaltas = Integer.parseInt(totalDeFaltas.text.toString())

            if (media >= 6 && qtdFaltas <= 10)
            {
                resultado.setText("Foi aprovado hein malandrão\nNota final: $media\nQuantidade de faltas: $qtdFaltas")
            }
            else
            {
                resultado.setText("Pau na moleira seu vagabundo\nNota final: $media\nQuantidade de faltas: $qtdFaltas")
            }
        }
    }
}