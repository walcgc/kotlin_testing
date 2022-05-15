package design_patterns.behavioral.strategy

import kotlin.jvm.JvmStatic
import design_patterns.behavioral.strategy.strategies.OperationAdd
import design_patterns.behavioral.strategy.strategies.OperationSubtract
import design_patterns.behavioral.strategy.strategies.OperationMultiply

object Main {
    @JvmStatic
    fun main(args: Array<String>) {
        var context = Context(OperationAdd())
        println("10 + 5 = " + context.executeStrategy(10, 5))
        context = Context(OperationSubtract())
        println("10 - 5 = " + context.executeStrategy(10, 5))
        context = Context(OperationMultiply())
        println("10 * 5 = " + context.executeStrategy(10, 5))
    }
}