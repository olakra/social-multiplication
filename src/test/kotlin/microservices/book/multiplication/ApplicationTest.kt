package microservices.book.multiplication

import org.junit.Test
import org.junit.Assert.*

class ApplicationTest {
    @Test
    fun testAppHasAGreeting() {
        val classUnderTest = Application()
        assertNotNull("Application should have a greeting", classUnderTest.greeting)
    }
}