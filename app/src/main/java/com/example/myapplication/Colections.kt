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

    // Mengubah data di dalam list Mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}

//Set adalah Kumpulan data yang tidak memiliki posisi atau urutan tertentu dan hannya menyimpan data unik(tidak ada duplikasi)
//Set berfifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
//Set berfungsi mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diuabah
//Set Read-Only menggunakan setOf
//Set Mutable Menggunakan mutableOf
fun ContohSet() {
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)
}
