public class Circle extends Shape {
    private double radio;

    public Circle(double radius) {
        this.radio = radius;
    }

    @Override
    public String toString() {
        return "Circle: " +
                " Radio = " + this.radio;
    }
    @Override
    public double calculateArea() {
        return 4 * Math.PI * Math.pow(radio, 2);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * Math.PI * radio;
    }

}
