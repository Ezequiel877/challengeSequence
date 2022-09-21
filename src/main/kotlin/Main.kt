import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    /*
    * scribir un programa que muestre en pantalla los números del 1 al 100
    * , sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por “buzz” y los múltiplos de ambos
    * , es decir, los múltiplos de 3 y 5 (o de 15), por la palabra “fizzbuzz”. Devolverme ademas la cantidad de fizz,
    *  la cantidad de buzz,
    * la cantidad de fizzbuzz y la cantidad de numeros sin estas combinaciones. Ordenado por mayor a menor
    * */

    val listLoad: MutableList<Any> = ArrayList()
    var fizz=1
    var buzz=1
    var fizzbuzz=1

    for (e in 1..100) {
        if (e % 15 == 0) {
            println("fizzbuzz")
            fizzbuzz++

        }
        else if (e % 3 == 0){
            println("fizz")
            fizz++
            listLoad.add(e)
        }
        else if (e % 5 == 0) {
            println("buzz")
            buzz++
            listLoad.add(e)
        }

        else println(e)
    }

    println("la palabra fizz se imprio $fizz")
    println("la palabra buzz se imprio $buzz")
    println("y la combinacion de ambas palabras $fizzbuzz")
    println("la cantidad de numeros sin estas combinaciones ${listLoad.size}")
    println("Ordenado por mayor a menor ${listLoad.reversed()}")


}
