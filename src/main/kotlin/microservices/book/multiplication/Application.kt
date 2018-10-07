package microservices.book.multiplication

import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
open class Application {
    val greeting: String
        get() = "Hello world."

    companion object {
        @JvmStatic
        fun main(args: Array<String>) {
            println(Application().greeting)
        }
    }
}