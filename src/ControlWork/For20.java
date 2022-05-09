package ControlWork;

import java.util.Scanner;

public class For20 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("enter n: ");//consolga "enter n: " yozuvini chiqarish uchun sout dan foydalanamiz

        int n = scn.nextInt();// n uzgaruvchiga scan.nextInt(); orqali consoldan kiritilgan malumotni uzlashtiramiz
        int factorial = 1;//factorial uzgaruvchiga 1 ni uzlashtiramiz
        int sum = 0;// sum uzgaruvchiga 0 ni uzlashtiramiz

        for (int i = 1; i <= n; i++) { //for sikldan foydalanib i=1 va i<=n gacha ishlatamiz va i ni qiymatini 1 ga oshiramiz
            factorial *= i;// facorial = factorial * i bunda harbitta siklda i ni qiymati oshib boradi va factorialni topamiz
            sum +=factorial;// bunda summani hisoblaymiz yani factoriallarni yig'indisini
        }
        System.out.println(sum);//sout orqali console ga factoriallar yig'indisini chiqaramiz
    }
}
