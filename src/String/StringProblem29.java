package String;

import java.util.Scanner;

public class StringProblem29 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        char[] b = a.toCharArray();

        char c = scan.next().charAt(0);

        String s0 = scan.next();
        char[] sign0 = s0.toCharArray();


        int count = 0;
        for (char cc : b) {
            if (cc == c) {
                count++;
            }
        }
        int size = b.length + count * s0.length();
        char[] k = new char[size];
        int t = 0;
        for (int i = 0; i < size; i++) {
            if (t < size) {
                if (b[i] == c) {
                    for (char j : sign0) k[t++] = j;
                }
                k[t++] = b[i];
            }
        }
        a = String.copyValueOf(k);
        System.out.println(a);
    }
}