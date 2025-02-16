
fun main() {
    val circulo = Circulo("Rojo", 5.0)
    println("Círculo - Área: ${circulo.area()}, Perímetro: ${circulo.perimetro()}")

    val rectangulo = Rectangulo("Azul", 4.0, 6.0)
    println("Rectángulo - Área: ${rectangulo.area()}, Perímetro: ${rectangulo.perimetro()}")

    val triangulo = Triangulo("Verde", 5.0, 3.0, 5.0, 4.0, 6.0)
    println("Triángulo - Área: ${triangulo.area()}, Perímetro: ${triangulo.perimetro()}")
}
