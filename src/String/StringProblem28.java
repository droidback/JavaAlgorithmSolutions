package String;

import java.util.Scanner;

public class StringProblem28 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        char c = scan.next().charAt(0);
        char[] b = a.toCharArray();
        int count = 0, count2 = 0;
        for (char cc : b) {
            if (cc == c) {
                count++;
            }
        }
        char[] k = new char[b.length + count];
        int t = 0;
        for (int i = 0; i < b.length + count; i++) {
            if (t < b.length + count) {
                k[t++] = b[i];
                if (b[i] == c) {
                    k[t++] = c;
                }
            }
        }
        String aka = String.valueOf(k);
        System.out.println(aka);
    }
}