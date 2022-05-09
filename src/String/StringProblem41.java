package String;

import java.util.Scanner;

public class StringProblem41{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        str = str.trim();
        str= str.replaceAll("\\s+", " ");
        String str2 = str.replaceAll(" ","");
        int countWord = str.length()-str2.length()+1;
        System.out.println(countWord);
    }
}