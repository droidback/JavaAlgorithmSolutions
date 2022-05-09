package Arrays;

import java.util.Scanner;

public class ArrayProblem135 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        double[] ax = new double[n1];
        double[] ay = new double[n1];
        double[] bx = new double[n2];
        double[] by = new double[n2];
        double d = 0;
        int index1 = 0, index2 = 0;
        double min = Integer.MAX_VALUE;

        for (int i = 0; i < n1; i++) {
            ax[i] = scan.nextDouble();
            ay[i] = scan.nextDouble();
        }
        for (int i = 0; i < n2; i++) {
            bx[i] = scan.nextDouble();
            by[i] = scan.nextDouble();
        }
        for (int i = 0; i < n1; i++) {
            for (int j = 0; j < n2; j++) {
                d = Math.sqrt(Math.pow(ax[i] - bx[j], 2) + Math.pow(ay[i] - by[j], 2));
                if (min > d) {
                    min = d;
                    index1 = i;
                    index2 = j;
                    System.out.println(min);
                }

            }
        }
        System.out.print(ax[index1] + "\t" + ay[index1]);
        System.out.println();
        System.out.print(bx[index2] + "\t" + by[index2]);
        System.out.println();
        System.out.println(min);
    }
}
