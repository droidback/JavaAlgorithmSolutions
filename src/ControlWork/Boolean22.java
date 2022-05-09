package ControlWork;

import java.util.Scanner;

public class Boolean22 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("enter the number a to check: ");
        int a = sc.nextInt();

        boolean number1 = a / 100 + 1 == a / 10 % 10;// tekshiramiz a sonini true false ga

        boolean number2 = a / 100 == a / 10 % 10 + 1;// tekshiramiz a sonini true false ga

        boolean number3 = a / 10 % 10 + 1 == a % 10;// tekshiramiz a sonini true false ga

        boolean number4 = a / 10 % 10 == a % 10 + 1;// tekshiramiz a sonini true false ga

        System.out.println(number1 && number3 || number4 && number2);//true yoki false chiqaradi shu berilgan shratga kura
    }

}
