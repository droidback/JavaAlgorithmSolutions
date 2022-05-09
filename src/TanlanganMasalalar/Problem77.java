package TanlanganMasalalar;

import java.util.Scanner;

public class Problem77{
    static int digitSum(int k) {
        if (k == 0) {
            return 0;
        }
        return k % 10 + digitSum(k / 10);
    }

    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(digitSum(n));
    }
}