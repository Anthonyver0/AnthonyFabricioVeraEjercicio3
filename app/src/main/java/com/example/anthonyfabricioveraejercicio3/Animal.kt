package com.example.anthonyfabricioveraejercicio3


class Animal (nombre: String, tipo_ali: String, tipo_repro: String, ) {
    var nombre: String
    var tipo_ali: String
    var tipo_repro:String

    //init es el constructor que es obligatoriamente llamado en todas las clases
    init {
        this.nombre = nombre;
        this.tipo_ali = tipo_ali;
        this.tipo_repro =tipo_repro;
    }
}