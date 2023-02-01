package week08.lab.lab2;

public class Circle extends Geometry {

    public Circle(int length) {
        super(length);
    }

    @Override
    public double calculateArea() {
        double area = Math.PI * Math.pow(getLength(), 2);
        super.setArea(area);

        return super.getArea();
    }

    public double calculatePerimeter() {

        double perimeter = 2 * Math.PI * getLength();
        super.setPerimeter(perimeter);

        return  super.getPerimeter();
    }
}

