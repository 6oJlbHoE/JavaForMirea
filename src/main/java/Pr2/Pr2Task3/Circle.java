package Pr2.Pr2Task3;

public class Circle {
    private Point center = new Point(0, 0);
    private double radius;

    @Override
    public String toString() {
        return "Circle{" +
                "center=" + center +
                ", radius=" + radius +
                '}';
    }

    public Circle(double x, double y, double radius) {
        this.setCenter(x, y);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public void setCenter(double x, double y) {
        this.center.setX(x);
        this.center.setY(y);
    }

    public Point getCenter() {
        return center;
    }
}
