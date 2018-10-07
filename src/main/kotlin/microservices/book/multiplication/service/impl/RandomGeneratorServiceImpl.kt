package microservices.book.multiplication.service.impl

import microservices.book.multiplication.service.RandomGeneratorService
import org.springframework.stereotype.Service

@Service
class RandomGeneratorServiceImpl: RandomGeneratorService {
    override fun generateRandomFactor(): Int = 0
}