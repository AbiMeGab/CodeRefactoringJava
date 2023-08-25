public class Triangle extends Shape {
    double height;
    double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    public String toString() {
        return "Triangle: " +
                " Height = " + this.height +
                " Base = " + this.base;
    }
    @Override
    public double calculateArea() {
        return 0.5 * (Math.sqrt((height * height) - (base * base) / 4 )* base);
    }

    @Override
    public double calculatePerimeter() {
        return 2 * (height + base);
    }

}
