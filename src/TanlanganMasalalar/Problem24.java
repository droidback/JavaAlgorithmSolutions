package TanlanganMasalalar;

import java.util.Scanner;

public class Problem24 {
    static int digitN(int k, int n) {
//        int temp = k;
////        int digitCount = 0;
////
////        while (k != 0) {
////            k = k / 10;
////            digitCount++;
////        }
////        if(digitCount<n) return -1;
////        for (int i = 0; i < n; i++) {
////            temp = (int) (temp%Math.pow(10,digitCount-i));
////        }
////
////        return (int) (temp/Math.pow(10,digitCount-n));
        int son = (int) Math.pow(10, n-1);
        if (son > k) {
            return -1;
        } else {
            while (k > son*10) {
                k /= 10;
            }
            return k % 10;
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k= scan.nextInt(),n= scan.nextInt();
        System.out.println(digitN(k,n));
    }
}