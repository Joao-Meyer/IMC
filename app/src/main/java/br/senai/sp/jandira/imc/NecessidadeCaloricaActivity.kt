package br.senai.sp.jandira.imc

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class NecessidadeCaloricaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_caloricas_necessidades)

        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        buttonCalcular.setOnClickListener{
            val abrirResultadoNecessidadeCaloricaActivity = Intent(this, ResultadoNecessidadeCaloricaActivity::class.java)

            startActivity(abrirResultadoNecessidadeCaloricaActivity)
        }
    }
}