package Arrays;

import java.util.Random;
import java.util.Scanner;

public class ArrayProblem56 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        Random random=new Random();
        int n=in.nextInt();
        int[] a=new int[n];
        int[] b=new int[15];
        int count=0;
        for (int i = 0; i < n; i++) {
            a[i]=random.nextInt(51)-10;
            System.out.print(a[i] +"\t");
        }
        System.out.println();
        for (int i = 3; i < n; i+=3) {
            b[count++] = a[i];
        }

        for (int i = 0; i < count; i++) {
            System.out.print(b[i]+ " ");
        }
        System.out.println("\ncount: "+count);
    }
}