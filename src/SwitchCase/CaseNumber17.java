package SwitchCase;

import java.util.Scanner;

public class CaseNumber17 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the n: ");
        int n = scan.nextInt();

        switch (n / 10) {
            case 1:
                System.out.print("o'n ");
                break;
            case 2:
                System.out.print("yigirma ");
                break;
            case 3:
                System.out.print("ottiz ");
                break;
            case 4:
                System.out.print("qiriq ");
                break;
        }

        switch (n % 10) {
            case 1:
                System.out.print("bir");
                break;
            case 2:
                System.out.print("ikki");
                break;
            case 3:
                System.out.print("uch");
                break;
            case 4:
                System.out.print("to'rt");
                break;
            case 5:
                System.out.print("besh");
                break;
            case 6:
                System.out.print("olti");
                break;
            case 7:
                System.out.print("yetti");
                break;
            case 8:
                System.out.print("sakkiz");
                break;
            case 9:
                System.out.print("to'qiz");
                break;
        }

        System.out.print("ta masala");
    }
}
