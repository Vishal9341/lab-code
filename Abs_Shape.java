public class Abs_Shape {
      public static void main(String[] args) {
        Shape s = new Rectangle();
        s.area();
        s = new Triangle();
        s.area();
        s = new Circle();
        s.area();
    }  
}
abstract class Shape {
    abstract void area();
}

class Rectangle extends Shape {
    void area() {
         System.out.println("Area of Rectangle"); 
        }
}

class Triangle extends Shape {
    void area() { 
        System.out.println("Area of Triangle"); 
    }
}

class Circle extends Shape {
    void area() { 
        System.out.println("Area of Circle"); 
    }
}