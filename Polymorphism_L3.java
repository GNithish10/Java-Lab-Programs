class Shape {
    public void draw() {
        System.out.println("drawing a shape! ");
    }
   
    public void erase() {
        System.out.println("erasing a shape! ");
    }
   
     public double area() {
        return 0; 
    }
   }
   
   class Circle extends Shape {
    private double radius;
   
    // Constructor
    public Circle(double radius) {
        this.radius = radius;
    }
   
     public void draw() {
        System.out.println("drawing a circle! ");
    }
   
     public void erase() {
        System.out.println("erasing a circle! ");
    }
   
     public double area() {
        return Math.PI * radius * radius;                   // area = πr²
    }
   }
   
   //triangle class that extends Shape
   class Triangle extends Shape {
    private double base;
    private double height;
   
    // constructor
    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
   
     public void draw() {
        System.out.println("drawing a Triangle! ");
    }
   
    public void erase() {
        System.out.println("erasing a Triangle! ");
    }
   
     public double area() {
        return 0.5 * base * height;                                // area = 0.5 * base * height
    }
   }
   
   //square class that extends Shape
   class Square extends Shape {
    private double side;
   
    // constructor
    public Square(double side) {
        this.side = side;
    }
   
    public void draw() {
        System.out.println("drawing a Square! ");
    }
   
     public void erase() {
        System.out.println("erasing a Square! ");
    }
   
     public double area() {
        return side * side; // area = side²
    }
}
   
public class Polymorphism_L3 {
    public static void main(String[] args) {
        Shape[] shapes = new Shape[3];                                        // array of Shape references to 3 objects
   
        // Creating instances(objects) of each shape
        shapes[0] = new Circle(5);                                                 // Circle with radius 5
        shapes[1] = new Triangle(4, 3);                                         // Triangle with base 4 and height 3
        shapes[2] = new Square(2);                                               // Square with side length 2
     
        // demonstrating polymorphism
        for (Shape shape : shapes) {
            shape.draw();                                                                 // Calling the draw method
            System.out.println("area: " + shape.area());              // Calling the area method
            shape.erase();                                                                // Calling the erase method
            System.out.println(); 
        }
    }
}