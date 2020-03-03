
package br.senai.sp.jandira.imc

import android.content.Intent
import android.content.IntentSender
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Instanciando as classes referentes aos componentes(View) da activity.
        val editTextPeso = findViewById<EditText>(R.id.edit_text_peso)
        val editTextAltura = findViewById<EditText>(R.id.edit_text_altura)
        val buttonCalcular = findViewById<Button>(R.id.button_calcular)

        // Cria um ouvinte para o botão abrir, que vai abriroutra activity.
        buttonCalcular.setOnClickListener {
            val abrirActivityResultado = Intent(this, ResultadoActivity::class.java)

            abrirActivityResultado.putExtra("peso", editTextPeso.text.toString())
            abrirActivityResultado.putExtra("altura", editTextAltura.text.toString())

            startActivity(abrirActivityResultado)
        }
    }
}
