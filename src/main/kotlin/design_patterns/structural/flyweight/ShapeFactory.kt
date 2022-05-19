package design_patterns.structural.flyweight


object ShapeFactory {

    private var circleMap =  HashMap<String, Circle>()

    fun getCircle(color: String): Shape {
        var circle = circleMap[color] as Circle?
        if (circle == null) {
            circle = Circle(color)
            circleMap[color] = circle
            //println("Creating circle of color : $color")
        }
        return circle
    }
}



