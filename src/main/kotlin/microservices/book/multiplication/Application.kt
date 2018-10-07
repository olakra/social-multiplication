package microservices.book.multiplication

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Application {
    val greeting = "Hello There!"
}

fun main(args: Array<String>) {
    SpringApplication.run(Application::class.java, *args)
}