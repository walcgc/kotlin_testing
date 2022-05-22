package junit_test.singleton_tests

import junit_test.state_tests.StateTestRunner
import org.junit.Assert.*
import org.junit.Test
import java.util.logging.Logger

class SingletonTestRunner {

    private val logger = Logger.getLogger(SingletonTestRunner::class.java.name)

    @Test
    fun helloIsTrueXXX1() {
        assertTrue(booleanMessage("Hello"))
        logger.info("SingleObject is equal to the string.")
    }

    @Test
    fun helloIsFalseXXX1() {
        assertFalse(booleanMessage("Hello!"))
        logger.info("SingleObject is not equal to the string.")
    }

    @Test
    fun returnsInstanceXXX1() {
        assertNotNull(objectExists())
        logger.info("The object exists.")
    }

    @Test
    fun sameObjectXXX1() {
        assertTrue(sameObject())
        logger.info("Same object returned.")
    }
}

