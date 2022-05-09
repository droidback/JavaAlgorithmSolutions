package SwitchCase;

import java.util.Scanner;

public class CaseNumber2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter your score that is between 1 to 5: ");

        switch (scan.nextInt()) {
            case 1:
                System.out.println("bad");
                break;
            case 2:
                System.out.println("unsatisfactory");
                break;
            case 3:
                System.out.println("satisfactory");
                break;
            case 4:
                System.out.println("good");
                break;
            case 5:
                System.out.println("excellent");
                break;
            default:
                System.out.println("invalid input! please enter the acceptable number, which is 1-5");
                break;
        }


    }
}

