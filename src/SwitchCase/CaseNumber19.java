package SwitchCase;

import java.util.Scanner;

public class CaseNumber19 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("enter year that you want to know: ");
        int year = scan.nextInt();

        switch (year % 10) {
            case 0:
            case 1:
                System.out.print("oq ");
                break;
            case 2:
            case 3:
                System.out.print("qora ");
                break;
            case 4:
            case 5:
                System.out.print("yashil ");
                break;
            case 6:
            case 7:
                System.out.print("qizil ");
                break;
            case 8:
            case 9:
                System.out.print("sariq ");
                break;
        }

        switch ((year + 8) % 12) {
            case 0:
                System.out.print("sichqon");
                break;
            case 1:
                System.out.print("sigir");
                break;
            case 2:
                System.out.print("yulbars");
                break;
            case 3:
                System.out.print("quyon");
                break;
            case 4:
                System.out.print("ajdar");
                break;
            case 5:
                System.out.print("ilon");
                break;
            case 6:
                System.out.print("ot");
                break;
            case 7:
                System.out.print("qo'y");
                break;
            case 8:
                System.out.print("maymun");
                break;
            case 9:
                System.out.print("tovuq");
                break;
            case 10:
                System.out.print("it");
                break;
            case 11:
                System.out.print("to'ng'iz");
                break;
        }

        System.out.println(" yili");
    }
}
