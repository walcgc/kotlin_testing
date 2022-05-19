package junit_test.singleton_tests

import org.junit.Assert.*
import org.junit.Test

class SingletonTestRunner {
    @Test
    fun helloIsTrueXXX1() {
        assertTrue(booleanMessage("Hello"))
    }

    @Test
    fun helloIsFalseXXX1() {
        assertFalse(booleanMessage("Hello!"))
    }

    @Test
    fun returnsInstanceXXX1() {
        assertNotNull(objectExists())
    }

    @Test
    fun sameObjectXXX1() {
        assertTrue(sameObject())
    }
}

