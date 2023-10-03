const val numeroFlotante = 28f
const val Pi = 3.1416
fun main(){
    val numero1 = 15
    var numero2 = 22
    numero2 = 33

    println("El numero 1 es: $numero1")
    println("El numero 2 es: $numero2")
    println("El numero 3 es: $numeroFlotante")
    println()
    println("El valor del dato por defecto es: ${numero1::class.simpleName}")
    println()
    val decimal = 10
    var perimetro = Pi * (decimal * 2)
    println("El perimetro cuando el valor decimal es $decimal es: $perimetro")
}