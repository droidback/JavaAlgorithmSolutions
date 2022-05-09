package String;

import java.util.Scanner;

public class StringProblem25{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        int binary = Integer.parseInt(str);
        String strBinary = Integer.toBinaryString(binary);
        System.out.println(strBinary);
    }
}