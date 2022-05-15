package design_patterns.behavioral.strategy.strategies

interface Strategy {
    fun doOperation(num1: Int, num2: Int): Int
}