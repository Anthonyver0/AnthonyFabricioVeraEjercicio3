package com.example.anthonyfabricioveraejercicio3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class AdaptadorAnimales : RecyclerView.Adapter<ViewHolderAnimal> {

    private var Animales: MutableList<Animal>
    constructor(anim: MutableList<Animal>) {
        this.Animales = anim
    }
    constructor() {
        Animales = ArrayList<Animal>()
    }
    fun setAnimales(anim: MutableList<Animal>){
        this.Animales = anim
        notifyDataSetChanged()
    }
    fun agregarAnimal(anim: Animal) {
        Animales.add(anim)
        notifyItemInserted(Animales.size - 1)
    }
    fun eliminar(indice: Int) {
        if (indice < 0 || indice >= this.itemCount) return
        Animales.removeAt(indice)
        notifyItemRemoved(indice)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolderAnimal {
        // inflamos la vista (fila_pelicula.xml)
        val vista: View = LayoutInflater.from(parent.context).inflate(R.layout.fila_animal,
            parent, false)
        // Crear el viewholder a partir de esta vista.
        val viewHolder = ViewHolderAnimal(vista)
        return viewHolder
    }
    override fun getItemCount(): Int {
        return this.Animales.size
    }
    override fun onBindViewHolder(holder: ViewHolderAnimal, position: Int) {
        // Dibujar la fila de la peli con los datos de la peli actualmente solicitada según la variable position
        val anim: Animal = this.Animales[position]
        holder.textViewAnimal.text = anim.nombre
        holder.textViewTipoAlim.text = anim.tipo_ali
        holder.textViewTipoMami.text = anim.tipo_repro
    }
}