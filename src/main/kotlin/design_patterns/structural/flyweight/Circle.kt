package design_patterns.structural.flyweight

class Circle(val color: String) : Shape {
    var x = 0
    var y = 0
    var radius = 0

    override fun draw() {
        println("Circle: Draw() [Color : $color, x : $x, y : $y, radius : $radius]")
    }

    fun drawMessage(): String {
        return "Circle: Draw() [Color : $color, x : $x, y : $y, radius : $radius]"
    }
}