package week08.lab.lab2;

import java.text.DecimalFormat;

public class MainClass {
    public static void main(String[] args) {

        Geometry[] geometries = new Geometry[3];
        geometries[0] = new Triangle(4);
        geometries[1] = new Square(5);
        geometries[2] = new Circle(6);

        printDetails(geometries);

        }
        public static void printDetails(Geometry[] geometries) {
            for (int i = 0; i < geometries.length; i++) {
                DecimalFormat m = new DecimalFormat("0.##");
                System.out.println("This is a " + geometries[i].getGeoType());
                System.out.println("Length: " + geometries[i].getLength());
                System.out.println("Perimeter: " + m.format(geometries[i].calculatePerimeter()));
                System.out.println("Area: " + m.format(geometries[i].calculateArea()));

                System.out.println();
                
                
                
            }
        }
}

