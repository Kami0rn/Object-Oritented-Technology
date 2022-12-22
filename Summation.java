package week04.lab.lab1;

import java.util.Scanner;
public class Summation {
    public double name(){
        return(0);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        //double total = findSummation(n);
        printSummation(n,findSummation(n));
        System.out.print(name) ;
        sc.close();
    }
    public static double findSummation(int n) {
        double total = 0;
        for (int i = 1 ; i <=n; i++) {
            total += (double)(i+2)/(3*i);


        }
        return total ;
    }
    public static void printSummation(int n,double total) {
        System.out.printf("Summation of %d: %.3f", n, total);
    }
}