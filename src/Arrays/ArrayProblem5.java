package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fk = new int[n];
        fk[0] = 1;
        fk[1] = 1;

        for (int i = 2; i < n; i++) {
            fk[i] = fk[i - 1] + fk[i - 2];
        }

        System.out.println(Arrays.toString(fk));
    }
}
