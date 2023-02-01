package week08.lab.lab2;


public class Square extends Geometry {
    public Square(int length) {

        super(length);
    }
    
    @Override

    public double calculateArea() {

        double area = Math.pow(getLength(), 2) ;
        super.setArea(area);

        return super.getArea();
    }

    public double calculatePerimeter() {

        double perimeter = getLength() * 4;
        super.setPerimeter(perimeter);

        return  super.getPerimeter();
    }

}

