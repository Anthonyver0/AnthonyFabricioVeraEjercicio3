package com.example.anthonyfabricioveraejercicio3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val animal= ArrayList<Animal>()
        animal.add(Animal("Conejo", "Herbívoro" ,"Vivíparo"))
        animal.add(Animal("Gallina", "Omnívoro" ,"Ovíparo"))
        animal.add(Animal("Águila", "Carnívoro" ,"Ovíparo"))
        animal.add(Animal("Jirafa", "Herbívoro" ,"Vivíparo"))
        animal.add(Animal("Cocodrilo", "Carnívoro" ,"Ovíparo"))
        animal.add(Animal("Elefante", "Herbívoro" ,"Vivíparo"))
        animal.add(Animal("Gato", "Carnivoro" ,"Vivíparo"))
        animal.add(Animal("Raton", "Omnívoro" ,"Vivíparo"))
        animal.add(Animal("Murcielago", "Omnívoro" ,"Vivíparo"))
        animal.add(Animal("Perro", "Carnivoro" ,"Vivíparo"))
        animal.add(Animal("Pingüino", "Carnivoro" ,"Ovíparo"))
        animal.add(Animal("Abeja", "Herbívoro" ,"Ovíparo"))


        val adaptadorRecyclerView = AdaptadorAnimales(animal)


        val recyclerViewAnimal: RecyclerView
        recyclerViewAnimal = findViewById(R.id.recyclerViewAnimal)
        recyclerViewAnimal.layoutManager = LinearLayoutManager(this)
        // La línea que divide los elementos
        recyclerViewAnimal.addItemDecoration(
            DividerItemDecoration(
                this@MainActivity,
                LinearLayoutManager.VERTICAL
            )
        )
        // El adaptador que se encarga de toda la lógica
        recyclerViewAnimal.setAdapter(adaptadorRecyclerView)
    }
}