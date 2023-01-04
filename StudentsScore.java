package week04.lab;
import java.util.Scanner;
import java.util.Arrays;
import java.text.DecimalFormat;
public class StudentsScore{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int student = sc.nextInt();
        int i = 0 ;
        int[] arr = new int[student];
        double sum = 0, mean = 0, sd = 0, sumsd =0;

        while(i<student){
            System.out.print("Enter student "+(i+1)+" score: ");
            arr[i] = sc.nextInt();
            if(arr[i]>0 && arr[i]<100){
                sum += arr[i];
                i++;
            } else{
                System.out.println("Please enter the score 0-100");
            }
        }
        System.out.println();
        System.out.println("======== Summary ========");
        System.out.println(Arrays.toString(arr));
        mean = sum/student;
        for(double a : arr){
            sumsd += Math.pow((a-mean),2);
        }
        sd = sumsd/student;
        sd = Math.sqrt(sd);
        DecimalFormat fmean = new DecimalFormat("0.00");
        DecimalFormat fsd = new DecimalFormat("0.####");
        System.out.println("Summation: "+sum);
        System.out.println("Mean: "+fmean.format(mean));
        System.out.println("SD: "+fsd.format(sd));
    }
}
