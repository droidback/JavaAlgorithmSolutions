package TanlanganMasalalar;

import java.util.Arrays;
import java.util.Random;

public class Problem43{
    public static void main(String[] args) {
        Random random = new Random();
        int n = random.nextInt(20) +1;
        System.out.println("n: " + n);

        int [] a = new int[n];

        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(4)+1;
        }
        System.out.println(Arrays.toString(a));

        int [] b = new int[n];
        int [] c = new int[n];

        int count =0;

        c[0] = a[0];
        b[0] = 1; // 2 => 3

        for (int i = 1; i < n; i++) { // i = 2
            if (a[i-1] == a[i])
                b[count]++;
            else{
                count++;
                b[count] = 1;
                c[count] = a[i];
            }
        }
        //sout all elements from arrays b and c
        for (int i = 0; i <= count; i++) {
            System.out.print(c[i]+ " ");
        }
        System.out.println();
        for (int i = 0; i <= count; i++) {
            System.out.print(b[i]+" ");
        }
    }
}