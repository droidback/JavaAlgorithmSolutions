package ControlWork;

import java.util.Scanner;

public class ForthProblem {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("enter x : ");//x ni qiymatini kiritishni suraymiz sout qilib
        double number1 = scan.nextDouble();//number1 uzgaruvchiga uzlashtiramiz

        System.out.print("enter y : ");//y ni qiymatini kiritishni suraymiz sout qilib
        double number2 = scan.nextDouble();//number2 uzgaruvchiga uzlashtiramiz

        double min = Math.min(number1, number2);

        double a = (number1 + number2) / 2;

        double max = Math.max(number1, number2);

        double b = (number1 * number2) * 2;

        System.out.println(min + " -> " + a);//consolga min va a ni konkatenatsiya qilib chiqarish
        System.out.println(max + " -> " + b);//consolega mx va b ni konkatenatsiya qilib chiqarish
    }
}

