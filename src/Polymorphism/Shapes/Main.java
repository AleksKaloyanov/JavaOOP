package Polymorphism.Shapes;

public class Main {
    public static void main(String[] args) {
        Shape rectangle = new Rectangle(10D, 5D);
        Shape circle = new Circle(10D);

        System.out.println(rectangle.calculateArea());
        System.out.println(rectangle.calculatePerimeter());
        System.out.println(circle.calculateArea());
        System.out.println(circle.calculatePerimeter());
    }
}
