fun main(args: Array<String>) {
    println("Hola UPIICSA!")
    println(perimetro())
}

fun perimetro() {
    // Paso 1: Crear una variable denominada "decimal" del tipo flotante.
    val decimal: Float = 3.14f

    // Paso 2: Declarar una variable const val con el valor de PI y multiplica por 2 veces nuestra variable decimal para sacar el perímetro de un círculo.
    val PI: Float = 3.14159265f
    val perimetro = 2 * PI * decimal

    // Paso 4: Utilizar un String Template para imprimir el texto El perímetro del círculo es: [resultado] siendo resultado nuestra variable perímetro.
    println("El perímetro del círculo es: $perimetro")
}