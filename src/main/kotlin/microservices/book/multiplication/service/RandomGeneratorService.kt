package microservices.book.multiplication.service

interface RandomGeneratorService {
    /**
     * @return a randomly-generated factor. It's always a number between 11 and 99.
     */
    fun generateRandomFactor(): Int
}