import java.util.*

fun main(args: Array<String>) {
    println("Hello World!")

    /*
    * scribir un programa que muestre en pantalla los números del 1 al 100
    * , sustituyendo los múltiplos de 3 por la palabra “fizz”, los múltiplos de 5 por “buzz” y los múltiplos de ambos
    * , es decir, los múltiplos de 3 y 5 (o de 15), por la palabra “fizzbuzz”. Devolverme ademas la cantidad de fizz,
    *  la cantidad de buzz,
    * la cantidad de fizzbuzz y la cantidad de numeros sin estas combinaciones. Ordenado por mayor a menor
    *
    * val list = (0..100).toList()

        Collections.replaceAll(list,4, "")

    *
    *
    * fun <T> merge(first: List<T>, second: List<T>): List<T> {
    val list: MutableList<T> = ArrayList()
    list.addAll(first)
    list.addAll(second)
    return list
}
    * */
    val list = (0..100).toList()

    for (e in 0..100){
        if (e % 3 ==0 ){
            Collections.replaceAll(list,e, "bizz")
            println(list)

        }
    }





}