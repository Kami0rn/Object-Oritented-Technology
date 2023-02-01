package week08.lab.lab2;

public class Triangle extends Geometry {
    public Triangle(int length) {
        super(length);
    }
    
    @Override
    public double calculateArea() {

        double area = (Math.sqrt(3) / 4) * Math.pow(getLength(), 2);
        super.setArea(area);

        return super.getArea();
    }

    public double calculatePerimeter() {

        double perimeter = getLength() * 3;
        super.setPerimeter(perimeter);

        return  super.getPerimeter();
    }
}

