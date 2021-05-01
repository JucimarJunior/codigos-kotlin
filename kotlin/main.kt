fun main(){
    println(max1(a = 5, b = 10))

    //Alumgas formas de declarar variável

    // 1º
    var nome:String
    nome = "Jucimar"

    // 2º
    // val nome = "Jucimar"

    // 3º
    // var nome:String = "Jucimar"

    println(nome)
}

// Corpo de bloco

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

// Corpo de expressão

fun max1(a: Int, b: Int): Int = if (a > b) a else b