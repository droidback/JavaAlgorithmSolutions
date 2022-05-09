package TanlanganMasalalar;

import java.util.Scanner;

public class Problem29 {
    static int ekub(int a, int b) {
        if (a < b) {
            a = a + b;
            b = a - b;
            a = a - b;
        }
        int temp;
        while (b != 0) {
            temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    static int ekubArr(int[] arr){
        int result=0;
        for (int element:arr) {
            result =ekub(result,element);
            if(result==1) return result;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println(ekubArr(arr));
    }
}