package com.example.anthonyfabricioveraejercicio3

import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ViewHolderAnimal(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val textViewAnimal: TextView
    val texViewAlimentacion: TextView
    val textViewReproduc: TextView
    val textViewTipoAlim: TextView
    val textViewTipoMami: TextView

    init {
        //El filaTitulo y FilaDirector vienen desde el layout Fila Pelicula
        textViewAnimal = itemView.findViewById(R.id.filaAnimal)
        texViewAlimentacion = itemView.findViewById(R.id.filaAlimentacion)
        textViewReproduc = itemView.findViewById(R.id.filaReproducción)
        textViewTipoAlim = itemView.findViewById(R.id.filatipo_ali)
        textViewTipoMami = itemView.findViewById(R.id.filatipoMami)


    }

}