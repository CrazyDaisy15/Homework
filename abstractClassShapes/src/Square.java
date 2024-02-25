public class Square extends Shape {

    @Override
    public String getArea(double a) {
        double result = a * a;
        return String.format("%.2f", result);
    }
    @Override
    public String getPerimeter(double a) {
        double result = a * 4;
        return String.format("%.2f", result);
    }
    public static void sayHello() {
        System.out.println("Square1");
    }
    public void sayHello2() {
        System.out.println("Square2");
    }
}