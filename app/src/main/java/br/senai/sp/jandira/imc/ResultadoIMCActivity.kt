package br.senai.sp.jandira.imc

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class ResultadoIMCActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc_resultado)

        var peso = intent.getStringExtra("peso")
        var altura = intent.getStringExtra("altura")

        Toast.makeText(this, "Eu sou um toast", Toast.LENGTH_LONG).show()
        Toast.makeText(this, peso, Toast.LENGTH_SHORT).show()
        Toast.makeText(this, altura, Toast.LENGTH_SHORT).show()
    }
}
