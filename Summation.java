package week03.lab;
import java.util.Scanner;
public class Summation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        printSummation(n,findSummation(n));
        sc.close();
        }
    public static double findSummation(int n){
        double total = 0;
            for (int i = 1; i<(n+1); i++){
                total += (double)(i+2)/(3*i);
            }
        return total;
    }
    public static void printSummation(int n, double total){
        System.out.printf("Summation of %d: %.3f", n, total);
    }
}
