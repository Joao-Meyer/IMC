package br.senai.sp.jandira.imc.model

import android.graphics.drawable.Drawable

data class Imc (
    val valor: Double,
    val imagem: Drawable,
    val classificacao: String,
    val niveRisco: String,
    val dica: String ) {

}