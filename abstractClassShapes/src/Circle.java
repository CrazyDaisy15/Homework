public class Circle extends Shape {
    @Override
    public String getArea(double radius) {
        double result =  Math.PI * Math.pow(radius, 2);
        return String.format("%.2f", result);
    }
    @Override
    public String getPerimeter(double radius) {
        double result = Math.PI * 2 * radius;
        return String.format("%.2f", result);
    }
}