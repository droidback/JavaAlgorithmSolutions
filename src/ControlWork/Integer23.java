package ControlWork;

import java.util.Scanner;

public class Integer23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter n: ");//consolga yozuvni chiqarish
        int n = sc.nextInt(); //klaviaturadan n ni kiritish

        int hour = n / 3600;//soatni hisoblash
        int minute = (n - hour * 3600) / 60;//minutni hisoblash
        int second = n - minute * 60 - hour * 3600;// secondni hisoblash


        System.out.println("Hour:" + hour);//sout orqali soatni consolga chiqarish konkatenatsiya qilingan holda
        System.out.println("Minute:" + minute);//sout orqali minutni consolga chiqarish konkatenatsiya qilingan holda
        System.out.println("Second:" + second);//sout orqali secondni consolga chiqarish konkatenatsiya qilingan holda
    }
}
