
package br.senai.sp.jandira.imc

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import com.google.android.material.textfield.TextInputLayout

class IMCActivity : AppCompatActivity() {
    // Instanciando as classes referentes aos componentes(View) da activity.
    private lateinit var editTextPeso: EditText
    private lateinit var editTextAltura: EditText

    private lateinit var textInputLayoutPeso: TextInputLayout
    private lateinit var textInputLayoutAltura: TextInputLayout

    private lateinit var spinnerSexo: Spinner
    private lateinit var buttonCalcular: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_imc)

        // Instanciando as classes referentes aos componentes(View) da activity.
        editTextPeso = findViewById(R.id.edit_text_peso)
        editTextAltura = findViewById(R.id.edit_text_altura)

        textInputLayoutPeso = findViewById(R.id.text_input_layout_peso)
        textInputLayoutAltura = findViewById(R.id.text_input_layout_altura)

        spinnerSexo = findViewById(R.id.spinner_sexo)
        buttonCalcular = findViewById(R.id.button_calcular)

        // Lista que será carregada no Spinner
        val options = arrayOf("Feminino", "Masculino", "Não informar")

        // Configurar o Spinner
        spinnerSexo.adapter = ArrayAdapter<String>(this, R.layout.spinner_item, options)

        // Cria um ouvinte para o botão abrir, que vai abriroutra activity.
        buttonCalcular.setOnClickListener {
            // Testar se o formulário está preenchido corretamente
            //validaForm()

            if(!validaForm()){
                val abrirActivityResultado = Intent(this, ResultadoIMCActivity::class.java)

                abrirActivityResultado.putExtra("peso", editTextPeso.text.toString())
                abrirActivityResultado.putExtra("altura", editTextAltura.text.toString())

                startActivity(abrirActivityResultado)
            }
        }
    }

    private fun validaForm(): Boolean {
        var error = false

        if(editTextPeso.text.isEmpty()){
            textInputLayoutPeso.error = "Digite seu peso!"
            error = true
        }
        else{
            textInputLayoutPeso.error = ""
        }

        if(editTextAltura.text.isEmpty()){
            textInputLayoutAltura.error = "Digite sua altura!"
            error = true
        }
        else{
            textInputLayoutAltura.error = ""
        }

        //if(editTextPeso.text.isEmpty()){
        //    editTextPeso.error = "Digite seu peso!"
        //    error = true
        //}

        //if(editTextAltura.text.isEmpty()){
        //    editTextAltura.error = "Digite sua alturaa!"
        //    error = true
        //}

        return error
    }
}
