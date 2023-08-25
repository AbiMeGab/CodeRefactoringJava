public class Main {
    public static void main(String[] args) {
        System.out.println("** Calculate area and perimeter of shapes **");

        Shape[] shapes = {
                new Rectangle(2, 8),
                new Circle(5),
                new Triangle(4, 7)
        };

        for (Shape shape : shapes) {
            System.out.println(shape.toString());
            System.out.println("Area: " + shape.calculateArea());
            System.out.println("Perimeter: " + shape.calculatePerimeter());
        }
    }
}