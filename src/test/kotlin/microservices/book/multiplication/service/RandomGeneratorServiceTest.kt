package microservices.book.multiplication.service

import microservices.book.multiplication.service.RandomGeneratorService
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.test.context.junit4.SpringRunner
import java.util.stream.Collectors
import java.util.stream.IntStream

@RunWith(SpringRunner::class)
@SpringBootTest
class RandomGeneratorServiceTest {

    @Autowired
    private lateinit var randomGeneratorService: RandomGeneratorService

    @Test
    @Throws(Exception::class)
    fun generateRandomFactorIsBetweenExpectedLimits() {
        //when -> a good sample of randomly generated factors are generated
        val randomFactors = IntStream.range(0, 1000)
                .map { i -> randomGeneratorService.generateRandomFactor() }
                .boxed().collect(Collectors.toList())

        //then -> all of them sould be between 11 and 100
        assertThat(randomFactors).containsOnlyElementsOf(
                IntStream.range(11, 100).boxed()
                        .collect(Collectors.toList())
        )
    }
}