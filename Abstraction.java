// Abstract class
abstract class Shape {
    // Abstract method (no implementation)
    abstract double area();
}

// Concrete class that extends the abstract class
class Circle extends Shape {
    double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    // Implementation of the abstract method for calculating the area of a circle
    @Override
    double area() {
        return Math.PI * radius * radius;
    }
}

// Concrete class that extends the abstract class
class Rectangle extends Shape {
    double length;
    double width;

    Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementation of the abstract method for calculating the area of a rectangle
    @Override
    double area() {
        return length * width;
    }
}

public class Abstraction {
    public static void main(String[] args) {
        // Creating objects of concrete classes
        Circle circle = new Circle(5);
        Rectangle rectangle = new Rectangle(4, 6);

        // Calculating and printing the areas of the shapes
        System.out.println("Area of Circle: " + circle.area());
        System.out.println("Area of Rectangle: " + rectangle.area());
    }
}

