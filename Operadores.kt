fun main() {
    println("Ingrese las cordenadas del primer punto (x1, y1): ")
    print("x1: ")
    val x1: Int = readln().toInt()
    print("y1: ")
    val y1: Int = readln().toInt()

    println("Ingrese las cordenadas del segundo punto (x2 y2): ")
    print("x2: ")
    val x2: Int = readln().toInt()
    print("y2: ")
    val y2: Int = readln().toInt()

    val y = y2.minus(y1)
    val x = x2.minus(x1)

    val pendiente1 = y/x
    val pendiente2 = y.toFloat()/x.toFloat()

    println("El valor de la pendiente es: $pendiente1")
    println("El valor correcto de la pendiente es: $pendiente2")
}