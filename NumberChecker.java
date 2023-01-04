package week02.lab;
import java.util.Scanner;
public class NumberChecker {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        double n = sc.nextDouble();
        System.out.print(n+" is the ");
        if(n<0){
            System.out.print("negative ");
        } else if(n>0) {
            System.out.print("positive ");
        }
        if((int)n%2==0){
            System.out.print("even ");
        } else {
            System.out.print("odd ");
        }
        if((int)n == n){
            System.out.print("integer number");
        } else{
            System.out.print("real number");
        }
    }
}
