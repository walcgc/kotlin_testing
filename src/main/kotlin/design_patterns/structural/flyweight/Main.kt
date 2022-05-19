package design_patterns.structural.flyweight

import design_patterns.structural.flyweight.ShapeFactory.getCircle

object Main {
    val colors = arrayOf("Red", "Green", "Blue", "White", "Black")

    @JvmStatic
    fun main(args: Array<String>) {
        for (i in 0..19) {
            val circle = getCircle(getRandomColor()) as Circle
                //getCircle(getRandomColor()!!) as Circle
            circle.x = getRandomX()
            circle.y = getRandomY()
            circle.radius = 100
            circle.draw()
        }
    }

    private fun getRandomColor(): String {
        return colors[(Math.random() * colors.size).toInt()]
    }

    private fun getRandomX(): Int {
        return (Math.random() * 100).toInt()
    }

    private fun getRandomY(): Int {
        return (Math.random() * 100).toInt()
    }
}