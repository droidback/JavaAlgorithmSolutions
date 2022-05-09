package TanlanganMasalalar;

import java.util.Scanner;

public class Problem61{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        boolean isAlphabet = true;
        boolean isFirstLetter = false;
        int indexOfPreviousLetter = 0;
        for (int i = 0; i < str.length(); i++) {

            if ('a' <= str.charAt(i) && str.charAt(i) <= 'z') {
                if (isFirstLetter) {
                    if (str.charAt(indexOfPreviousLetter) >= str.charAt(i)) {
                        System.out.println(str.charAt(i));
                        isAlphabet = false;
                    }
                }

                isFirstLetter = true;
                indexOfPreviousLetter = i;

            }
        }

        if (isAlphabet) System.out.println(0);
    }
}