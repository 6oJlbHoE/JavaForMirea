package Pr2.Pr2Task6;

public class Circle {
    private double xCenter;
    private double yCenter;
    private double radius;

    public double getxCenter() {
        return xCenter;
    }

    public void setxCenter(double xCenter) {
        this.xCenter = xCenter;
    }

    public double getyCenter() {
        return yCenter;
    }

    public void setyCenter(double yCenter) {
        this.yCenter = yCenter;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double area(){
        return 3.14 * radius * radius;
    }
    public double length(){
        return 2 * 3.14 * radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "xCenter=" + xCenter +
                ", yCenter=" + yCenter +
                ", radius=" + radius +
                '}';
    }

    public Circle(double xCenter, double yCenter, double radius) {
        this.xCenter = xCenter;
        this.yCenter = yCenter;
        this.radius = radius;
    }

    public void compare(Circle other){
        double areaThis = this.area();
        double areaOther = other.area();
        if(areaThis > areaOther){
            System.out.println("This circle higher than second circle.\n");
        }else if(areaThis == areaOther){
            System.out.println("This circle eqal with second circle.\n");
        }else{
            System.out.println("Second circle higher than this circle.\n");
        }
    }
}
