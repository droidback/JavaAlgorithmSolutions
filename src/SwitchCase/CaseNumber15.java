package SwitchCase;

import java.util.Scanner;

public class CaseNumber15 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("karta qiymatini kiriting 6<=N<=14 shunda 11-valet 12-dama 13-qirol 14-tuz: : ");
        int n = scan.nextInt();

        System.out.println("karta turini tanlang 1-g'isht 2-olma 3-chillak 4-qarg'a: ");
        int m = scan.nextInt();

        switch (n) {
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                switch (m) {
                    case 1:
                        System.out.println(n + " g'isht");
                        break;
                    case 2:
                        System.out.println(n + " olma");
                        break;
                    case 3:
                        System.out.println(n + " chillak");
                        break;
                    case 4:
                        System.out.println(n + " qarg'a");
                        break;
                    default:
                        System.out.println("invalid input!");
                        break;
                }
                break;
            case 11:
                switch (m) {
                    case 1:
                        System.out.println("valet g'isht");
                        break;
                    case 2:
                        System.out.println("valet olma");
                        break;
                    case 3:
                        System.out.println("valet chillak");
                        break;
                    case 4:
                        System.out.println("valet qarg'a");
                        break;
                    default:
                        System.out.println("invalid input!");
                        break;
                }
                break;
            case 12:
                switch (m) {
                    case 1:
                        System.out.println("dama g'isht");
                        break;
                    case 2:
                        System.out.println("dama olma");
                        break;
                    case 3:
                        System.out.println("dama chillak");
                        break;
                    case 4:
                        System.out.println("dama qarg'a");
                        break;
                    default:
                        System.out.println("invalid input!");
                        break;
                }
                break;
            case 13:
                switch (m) {
                    case 1:
                        System.out.println("qirol g'isht");
                        break;
                    case 2:
                        System.out.println("qirol olma");
                        break;
                    case 3:
                        System.out.println("qirol chillak");
                        break;
                    case 4:
                        System.out.println("qirol qarg'a");
                        break;
                    default:
                        System.out.println("invalid input!");
                        break;
                }
                break;
            case 14:
                switch (m) {
                    case 1:
                        System.out.println("tuz g'isht");
                        break;
                    case 2:
                        System.out.println("tuz olma");
                        break;
                    case 3:
                        System.out.println("tuz chillak");
                        break;
                    case 4:
                        System.out.println("tuz qarg'a");
                        break;
                    default:
                        System.out.println("invalid input!");
                        break;
                }
                break;
            default:
                System.out.println("invalid input!");
                break;
        }

    }
}