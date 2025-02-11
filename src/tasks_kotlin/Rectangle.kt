package tasks_kotlin

interface Shape {
    fun getArea(): Double
}

class Rectangle(
    private val width: Double,
    private val height: Double,
    ): Shape {
    override fun getArea(): Double {
        return width*height
    }

}

class Circle(
    private val radius: Double,
): Shape {
    override fun getArea(): Double {
        return radius * Math.pow(3.14, 2.0)
    }
}

class Triangle(
    private val width: Double,
    private val height: Double,
): Shape {
    override fun getArea(): Double {
        return width*height*0.5
    }

}