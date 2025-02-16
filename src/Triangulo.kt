class Triangulo(color: String, val base: Double, val altura: Double, val lado1: Double, val lado2: Double, val lado3: Double) : Figura(color) {
    override fun area(): Double {
        return (base * altura) / 2
    }

    override fun perimetro(): Double {
        return lado1 + lado2 + lado3
    }
}