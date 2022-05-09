package TanlanganMasalalar;

import java.util.Scanner;

public class Problem59 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = scan.nextLine();
        String name = "";

        int i = 0, dot = 0;

        while (i < fullName.length()) {

            if (fullName.charAt(i) == '\\') {
                name = "";
            }

            if (fullName.charAt(i) == '.') {
                dot = name.length();
            }
            name += fullName.charAt(i);
            i++;
        }

        name = name.substring(1, dot);

        System.out.println(name);
    }
}