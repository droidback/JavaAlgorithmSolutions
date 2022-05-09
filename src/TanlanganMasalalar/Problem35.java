package TanlanganMasalalar;

import java.util.Scanner;

public class Problem35{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] m = new int[n];
        for (int i = 0; i < m.length; i++) {
            m[i]= scan.nextInt();
        }

        int l = m.length;
        for (int i = 0; i < l / 4; i++) {
            System.out.print(m[2 * i] + " " + m[2 * i + 1] + " " + m[l - 1 - 2 * i] + " " + m[l - 2 * i - 2] + " ");
        }
        int a1 = m[l / 2 - 1];
        int a2 = m[l / 2];
        int a3 = m[l / 2 + 1];
        switch (l % 4) {
            case 3:
                System.out.print(a1 + " " + a2 + " " + a3);
                break;
            case 2:
                System.out.print(a1 + " " + a2);
                break;
            case 1:
                System.out.print(a2);
        }
    }
}