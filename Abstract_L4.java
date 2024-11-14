/*
Program 4: Develop a JAVA program to create an abstract class Shape with abstract methods calculate Area() 
and calculate Perimeter(). Create subclasses Circle and Triangle that extend the Shape class and 
implement the respective methods to calculate the area and perimeter of each shape. 
*/

// Abstract class Shape
abstract class Shape {

    abstract double area();                                                           // Abstract methods
    abstract double perimeter();
}

// Subclass Circle extends Shape
class Circle extends Shape {
    private double radius;                                                  //Instance variable radius

    // Constructor to initialize radius
    public Circle(double radius) {
        this.radius = radius;
    }

      double area() {                                                                   //Area calculation
        return Math.PI * radius * radius;
    }

      double perimeter() {                                                       //Perimeter calculation
        return 2 * Math.PI * radius;
    }
}

// Subclass Triangle extends Shape
class Triangle extends Shape {
    private double a, b, c;                                                        // Instance variables  sides and height of the triangle 
    private double height;                                       

    // Constructor to initialize sides and height
    public Triangle(double a, double b, double c, double height) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.height = height;
    }

     double area() {                                                                              //Area calculation
        return (b * height) / 2;
    }

    double perimeter() {                                                                      //Perimeter calculation
        return a + b + c;
    }
}

// Main class 

public class Abstract_L4 {
    public static void main(String[] args) {
       
        Shape circle = new Circle(5.0);                                                        //Creating an object "circle" with radius 5.0

        System.out.println("area of a Circle : " + circle.area());
        System.out.println("perimeter of a circle : " + circle.perimeter());

        
        Shape triangle = new Triangle(2.0, 4.0, 3.0, 5.0);                    //Creating an object "circle" with sides 2.0, 4.0, 3.0 and height 5.0

        System.out.println("area of a triangle :  " + triangle.area());
        System.out.println("perimeter of a triangle :  " + triangle.perimeter());
    }
}