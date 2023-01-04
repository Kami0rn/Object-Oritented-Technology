package week02.lab;
import java.util.Scanner;
public class MyCurrency {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the desied currency: ");
        String tryp = sc.next();
        System.out.print("Enter the amouot of moneya: ");
        double n = sc.nextDouble();
        double bath = 0;
        if(tryp.equals("GBP")){
            bath = n*42.50;
            System.out.println("It is equal to " + bath + " THB." );
        } else if(tryp.equals("EUR")){
            bath = n*36.66;
            System.out.println("It is equal to " + bath + " THB." );
        } else {
            System.out.println("Please choose the proper currency (either GBP or EUR).");
            }
        sc.close();
    }
}
