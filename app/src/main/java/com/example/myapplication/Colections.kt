package com.example.myapplication

fun ContohList() {
    println("== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //list Mutable
    val shape: MutableList<String> = mutableListOf("Circle", "square", "Triangle")
    println(shape)

    // Menambahkan data ke dalam List Mutable
    shape.add("Circle")
    println(shape)

    //Menghapus data dari List Mutbale
    shape.remove("Triangle")
    println(shape)
}
