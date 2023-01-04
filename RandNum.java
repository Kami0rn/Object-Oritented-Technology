package week04.lab;
import java.util.*;
public class RandNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Please specify the array size: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        int min = 10;
        int max = 50;
        Random rand = new Random();
        for(int i = 0; i < size; i++) {
            //nextInt(int bound) returns a pseudorandom,
            //uniformly distributed int value between 0 (inclusive)
            //and the specified value (exclusive).
            arr[i] = rand.nextInt(max-min-1)+min;
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("\nThe numbers, where the last digit" + " is greater than or equal to five, are:");
        for (int a : arr) {
            int num = a%10;
            if (num >= 5) {
                System.out.print(a + " ");
            }
        }
        sc.close();

    }
}