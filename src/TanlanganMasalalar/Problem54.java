package TanlanganMasalalar;

import java.util.Scanner;

public class Problem54{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.substring(str.indexOf(" "), str.lastIndexOf(" ")).trim();
        System.out.println(str);
    }
}