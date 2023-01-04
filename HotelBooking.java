package week02.lab;
import java.util.Scanner;
public class HotelBooking {
    final static int pc = 5000;
    final static int pe = 7000;
    final static int pbreakfast = 150;
    final static int prt = 500;
    final static double ps = 0.0175;
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Do you want to book the hotel room(s)?" );
        String book = sc.next();
        double total = 0;
        if(book.equals("yes")){
            System.out.println("Please choose a room type:" );
            String type = sc.next();
            if(type.equals("extra")){
                total = pe;
            } else if(type.equals("common")) {
                total = pc;
            }
            System.out.println("How many rooms?" );
            int room = sc.nextInt();
            total *= room;
            System.out.println("Breakfast included?" );
            String breakfast = sc.next();
            if(breakfast.equals("yes")){
                total += room*pbreakfast;
            }
        } else if(book.equals("no")){
            System.out.println("Do you want to reserve the table(s)?");
            String rt = sc.next();
            if(rt.equals("yes")){
                System.out.println("How many tables??" );
                int tabal = sc.nextInt();
                total = tabal*prt;
            }
        }
        total += total*ps;
        System.out.println("You need to pay "+total+" baht (service charge included).");
    }
}
