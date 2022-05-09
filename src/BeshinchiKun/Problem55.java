package BeshinchiKun;

import java.util.Scanner;

public class Problem55{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine().trim();
        String res = str.replace(" ", "");
        int count = str.length() - res.length() + 1;
        System.out.println(count);
    }
}