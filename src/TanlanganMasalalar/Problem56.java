package TanlanganMasalalar;

import java.util.Scanner;

public class Problem56{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String[] arr = str.split(" ");
        int min = Integer.MAX_VALUE;
        int index = 0;
        for (int i = 0; i < arr.length; i++) {
            if (min > arr[i].length()) {
                min = arr[i].length();
                index = i;
            }
        }
        System.out.println(arr[index] + " " + min);
    }
}