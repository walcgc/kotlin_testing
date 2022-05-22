package junit_test.strategy_tests

import design_patterns.behavioral.strategy.Context
import design_patterns.behavioral.strategy.strategies.OperationAdd
import design_patterns.behavioral.strategy.strategies.OperationSubtract
import design_patterns.behavioral.strategy.strategies.OperationMultiply
import org.junit.Assert
import org.junit.Test

class StrategyTestRunner {
    var number1 = 10
    var number2 = 5
    @Test
    fun validateSum() {
        val referenceResult = StrategyTestCases.calculateReferenceSum(number1, number2)
        val context = Context(OperationAdd())
        val testResult = context.executeStrategy(number1, number2)
        Assert.assertEquals(testResult.toLong(), referenceResult.toLong())
        Assert.assertTrue(StrategyTestCases.isCorrectResult(testResult, referenceResult))
    }

    @Test
    fun validateDifference() {
        val referenceResult = StrategyTestCases.calculateReferenceDifference(number1, number2)
        val context = Context(OperationSubtract())
        val testResult = context.executeStrategy(number1, number2)
        Assert.assertEquals(testResult.toLong(), referenceResult.toLong())
        Assert.assertTrue(StrategyTestCases.isCorrectResult(testResult, referenceResult))
    }

    @Test
    fun validateProduct() {
        val referenceResult = StrategyTestCases.calculateReferenceProduct(number1, number2)
        val context = Context(OperationMultiply())
        val testResult = context.executeStrategy(number1, number2)
        Assert.assertEquals(testResult.toLong(), referenceResult.toLong())
        Assert.assertTrue(StrategyTestCases.isCorrectResult(testResult, referenceResult))
    }

    @Test
    fun testContextSwitching() {
        val referenceResult =
            StrategyTestCases.calculateReferenceProduct(number1, number2) - StrategyTestCases.calculateReferenceSum(
                number1,
                number2
            )
        var context = Context(OperationMultiply())
        val testResult1 = context.executeStrategy(number1, number2)
        context = Context(OperationAdd())
        val testResult2 = context.executeStrategy(number1, number2)
        context = Context(OperationSubtract())
        val finalTestResult = context.executeStrategy(testResult1, testResult2)
        Assert.assertEquals(finalTestResult.toLong(), referenceResult.toLong())
        Assert.assertTrue(StrategyTestCases.isCorrectResult(finalTestResult, referenceResult))
    }

    @Test
    fun testContextChaining() {
        val referenceResult = StrategyTestCases.calculateReferenceProduct(
            StrategyTestCases.calculateReferenceSum(number1, number2),
            StrategyTestCases.calculateReferenceDifference(number1, number2)
        )
        val context = Context(OperationAdd())
        val context2 = Context(OperationSubtract())
        val context3 = Context(OperationMultiply())

        val finalTestResult = context3.executeStrategy(
            context.executeStrategy(number1, number2),
            context2.executeStrategy(number1, number2)
        )
        Assert.assertEquals(finalTestResult.toLong(), referenceResult.toLong())
        Assert.assertTrue(StrategyTestCases.isCorrectResult(finalTestResult, referenceResult))
    }
}