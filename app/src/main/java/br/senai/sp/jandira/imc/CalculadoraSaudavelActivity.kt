package br.senai.sp.jandira.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class CalculadoraSaudavelActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_saudavel_calculadora)

        val buttonNecessidadesCaloricas = findViewById<Button>(R.id.button_necessidades_caloricas)
        val buttonIMC = findViewById<Button>(R.id.button_imc)

        buttonIMC.setOnClickListener {
            val abrirActivityIMC = Intent(this, IMCActivity::class.java)

            startActivity(abrirActivityIMC)
        }

        buttonNecessidadesCaloricas.setOnClickListener {
            val abrirActivityNecessidadesCalorica = Intent(this, NecessidadeCaloricaActivity::class.java)

            startActivity(abrirActivityNecessidadesCalorica)
        }
    }
}