package tasks_java;

interface Shape {
    double getArea();
}
class Rectangle implements Shape{
    private double width;
    private double height;

    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height;
    }
}

class Circle implements Shape{
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return radius*Math.pow(3.14, 2);
    }
}

class Triangle implements Shape{
    private double width;
    private double height;

    Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    @Override
    public double getArea() {
        return width*height*0.5;
    }
}


