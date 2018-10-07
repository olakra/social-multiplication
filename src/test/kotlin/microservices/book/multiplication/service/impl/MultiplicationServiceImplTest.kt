package microservices.book.multiplication.service.impl

import microservices.book.multiplication.service.MultiplicationService
import microservices.book.multiplication.service.RandomGeneratorService
import org.assertj.core.api.Assertions.assertThat
import org.junit.Test
import org.junit.runner.RunWith
import org.mockito.BDDMockito.given
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.boot.test.mock.mockito.MockBean
import org.springframework.test.context.junit4.SpringRunner

@RunWith(SpringRunner::class)
@SpringBootTest
class MultiplicationServiceImplTest {

    @MockBean
    lateinit var randomGeneratorService: RandomGeneratorService

    @Autowired
    lateinit var multiplicationService: MultiplicationService

    @Test
    fun createRandomMultiplicationTest() {
        // given -> our mocked Random Generator randomGeneratorService will return first 50, then 30
        given(randomGeneratorService.generateRandomFactor()).willReturn(50, 30)

        // when ->
        val multiplication = multiplicationService.createRandomMultiplication()

        // assert ->
        assertThat(multiplication.factorA).isEqualTo(50)
        assertThat(multiplication.factorB).isEqualTo(30)
        assertThat(multiplication.result).isEqualTo(1500)
    }
}