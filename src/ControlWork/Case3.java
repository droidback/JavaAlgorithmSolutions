package ControlWork;

import java.util.Scanner;

public class Case3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter M(month) with number: ");

        switch (scan.nextInt()) {
            case 1://fasillar 3 oydan iborat shuning uchun 1chi 2 chi va 12chi oylar qish buladi, bu erda performance dan yutish uchun 1 2 12 chi oyni bitta qilib guruhlaymiz
            case 2:
            case 12:
                System.out.println("winter");
                break;
            case 3:// huddi qishta fasliga qilinganday buladi yani fasillarni guruhlash
            case 4:
            case 5:
                System.out.println("spring");
                break;
            case 6://fasilarni guruhlash
            case 7:
            case 8:
                System.out.println("summer");
                break;
            case 9://fasilarni guruhlash
            case 10:
            case 11:
                System.out.println("fall");
                break;
            default:
                System.out.println("invalid input!");//agar user notug'ri malumot kiritsa shu yozuv chiqib ogohlantiradi
                break;
        }
    }
}
