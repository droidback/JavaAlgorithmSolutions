package String;

import java.util.Scanner;

public class StringProblem6{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char sign = scan.next().charAt(0);

        if (48<=sign && sign<=57) System.out.println("digit");
        else if(97<=sign && sign<=122||65<=sign && sign<=90) System.out.println("lat");
        else System.out.println(0);
    }
}