package week04.lab;
import java.util.Scanner;
public class BigAsterisk {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int size ;
        do{
            System.out.print("Enter ann odd number: ");
            size = sc.nextInt();
        } while(size%2 == 0 || size == 0);
        int mid = Math.abs(size)/2;
        if(size>0){
            for(int i = 0 ; i<size ; i++){
                for(int j = 0 ; j<size ; j++){

                    if(i==j || i == mid || j==size-i-1 || j==mid ){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
                System.out.println();
            }
        } else{
            size = -size;
            for(int i = 0 ; i<size ; i++){
                for(int j = 0 ; j<size ; j++){

                    if(i==j || i == mid || j==size-i-1 || j==mid ){
                        System.out.print("  ");
                    } else {
                        System.out.print("* ");
                    }
                }
                System.out.println();
            }
        }
    }
}
