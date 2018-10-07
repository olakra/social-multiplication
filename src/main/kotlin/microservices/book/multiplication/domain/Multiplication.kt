package microservices.book.multiplication.domain

data class Multiplication(val factorA: Int, val factorB: Int) {
    val result = factorA * factorB

    override fun toString(): String {
        return """
            Multiplication {
                'factorA': $factorA,
                'factorB': $factorB,
                'result': $result
            }
        """.trimIndent()
    }
}