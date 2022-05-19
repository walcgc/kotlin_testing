package design_patterns.structural.flyweight

object TestFunctions {
    val colors = arrayOf("Red", "Green", "Blue", "White", "Black")
    val randomColor: String
        get() = colors[(Math.random() * colors.size).toInt()]
    val randomX: Int
        get() = (Math.random() * 100).toInt()
    val randomY: Int
        get() = (Math.random() * 100).toInt()
}