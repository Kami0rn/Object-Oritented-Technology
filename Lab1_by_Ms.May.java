package week4.lab;
import java.util.Scanner;
public class Lab1{
    public static void main(String[] agse){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int num = sc.nextInt();
        printSum(num,findSum(num));
        sc.close(); 
    } 
    public static double findSum(int n ) {
        double total = 0;
        for (int i = 1; i <= n;i++ ){
            total += (double)(i+2)/(i*3);
        }
        return total;
    } 
    public static void printSum(int n,double t ) {
        System.out.format("The sum of sequace is %d :" + " %.3f " ,n ,t );
    }        
    
}
