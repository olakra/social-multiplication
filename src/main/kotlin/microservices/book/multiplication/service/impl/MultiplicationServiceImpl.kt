package microservices.book.multiplication.service.impl

import microservices.book.multiplication.domain.Multiplication
import microservices.book.multiplication.service.MultiplicationService
import microservices.book.multiplication.service.RandomGeneratorService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Component
import org.springframework.stereotype.Service

@Service
class MultiplicationServiceImpl @Autowired constructor(private val randomGeneratorService: RandomGeneratorService) : MultiplicationService {

    override fun createRandomMultiplication(): Multiplication {
        val factorA = randomGeneratorService.generateRandomFactor()
        val factorB = randomGeneratorService.generateRandomFactor()

        return Multiplication(factorA, factorB)
    }
}