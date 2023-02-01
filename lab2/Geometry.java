package week08.lab.lab2;


public class Geometry {
    private int length;
    private double perimeter;
    private double area;

    public Geometry(int length) {
        this.length = length;
    }

    public double calculateArea() {
        return this.length;
    }

    public double calculatePerimeter() {
        return this.length;
    }

    public String getGeoType() {
        return this.getClass().getSimpleName();
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public double getPerimeter() {
        return perimeter;
    }

    public void setPerimeter(double perimeter) {
        this.perimeter = perimeter;
    }


    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    


}


