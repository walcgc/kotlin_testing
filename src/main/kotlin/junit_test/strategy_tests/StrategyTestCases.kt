package junit_test.strategy_tests


import java.util.logging.Level
import java.util.logging.Logger

object StrategyTestCases {
    private val logger = Logger.getLogger(StrategyTestCases::class.java.name)
    fun isCorrectResult(testResult: Int, referenceResult: Int): Boolean {

        //set initial value to false
        var result = false

        //check if test value and reference value are equal
        if (testResult == referenceResult) {
            logger.log(Level.INFO, "The strategy was implemented correctly.")

            //System.out.println("The strategy was implemented correctly.");
            result = true
        } else {
            logger.log(Level.WARNING, "The strategy was NOT implemented correctly.")
            //System.out.println("The strategy was NOT implemented correctly.");
        }
        //return result
        return result
    }

    fun calculateReferenceSum(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun calculateReferenceDifference(number1: Int, number2: Int): Int {
        return number1 - number2
    }

    fun calculateReferenceProduct(number1: Int, number2: Int): Int {
        return number1 * number2
    }
}