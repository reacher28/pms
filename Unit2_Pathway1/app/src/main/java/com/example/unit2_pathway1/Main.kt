package com.example.unit2_pathway1

fun main() {
    nullOrString()
    nullorInt()
    lengthIfNull()
    legnthIfNotNull()
    usingIfElse()
    elvis()
}

fun nullOrString() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor)

    favoriteActor = null
    println(favoriteActor)
}

fun nullorInt() {
    var number: Int? = 10
    println(number)

    number = null
    println(number)
}

fun lengthIfNull() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor?.length)
}

fun legnthIfNotNull() {
    var favoriteActor: String? = "Sandra Oh"
    println(favoriteActor!!.length)
}

fun usingIfElse() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = if (favoriteActor != null) {
        favoriteActor.length
    } else {
        0
    }

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}

fun elvis() {
    var favoriteActor: String? = "Sandra Oh"

    val lengthOfName = favoriteActor?.length ?: 0

    println("The number of characters in your favorite actor's name is $lengthOfName.")
}