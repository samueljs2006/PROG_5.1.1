class Rectangulo(color: String, val ancho: Double, val alto: Double) : Figura(color) {
    override fun area(): Double {
        return ancho * alto
    }

    override fun perimetro(): Double {
        return 2 * (ancho + alto)
    }
}