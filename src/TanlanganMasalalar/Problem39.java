package TanlanganMasalalar;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Problem39{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Bazadagi savollar soni: ");
        int m = scan.nextInt();
        System.out.println("Nechta savol kerak: ");
        int n = scan.nextInt();
        Random r = new Random();
        int count = 1;
        int son;
        int[]a  = new int[n];
        a[0] = r.nextInt(m - 1) + 1;
        while (count != n) {
            boolean isHas = false;
            son = r.nextInt(m - 1) + 1;
            for (int i = 0; i < count; i++) {
                if (a[i] == son) {
                    isHas = true;
                }
            }
            if (!isHas) {
                a[count++] = son;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}