package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
//hato
public class ArrayProblem77 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int n = scan.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = random.nextInt(30);
        }
        System.out.println(Arrays.toString(a));

//        for (int i = 1; i < n-1; i++) {
//
//            if ((a[i-1] > a[i]) && (a[i] < a[i + 1])) {
//
//                a[i] = (int) Math.pow(a[i], 2);
//            }
//
//        }
        int k=a[0];
        for (int i = 1; i < n-1; i++) {

            if(a[i]>k && a[i] < a[i+1])
            {
                k=a[i];
                a[i]=a[i]*a[i];
            }
            else
            {
                k=a[i];
            }

        }
        System.out.println(Arrays.toString(a));
    }
}