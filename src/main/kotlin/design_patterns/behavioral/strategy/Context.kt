package design_patterns.behavioral.strategy

import design_patterns.behavioral.strategy.strategies.Strategy

class Context(private val strategy: Strategy) {
    fun executeStrategy(num1: Int, num2: Int): Int {
        return strategy.doOperation(num1, num2)
    }
}