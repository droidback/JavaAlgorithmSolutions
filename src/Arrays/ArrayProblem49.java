package Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class ArrayProblem49 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        int[] a = {1,2,3,5,2};

//        for (int i = 0; i < a.length; i++) {
//            a[i] = random.nextInt();
//        }
//        System.out.println(Arrays.toString(a));
        boolean isBreak = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 1 || a[i] > a.length) {
                if (!isBreak)
                    System.out.print(i+ " ");
                isBreak = true;
            } else {
                for (int j = 0; j < i; j++) {
                    if (a[i] == a[j]) {
                        if (!isBreak) System.out.print(i+" ");
                        isBreak = true;
                    }
                }
            }
        }
        if (!isBreak) System.out.println("0");
    }
}
