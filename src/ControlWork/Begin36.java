package ControlWork;

import java.util.Scanner;

public class Begin36 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float velocity1, velocity2, s, time;

        System.out.println("enter v1 that km/h: ");//sout orqali console ga chiqarish
        velocity1 = scan.nextFloat();// uzgaruvchiga scan.nextFloat() orqali user kiritgan malumotni uzlashtirish

        System.out.println("enter v2 that km/h: ");
        velocity2 = scan.nextFloat();

        System.out.println("enter S in km: ");
        s = scan.nextFloat();

        System.out.println("enter T in h: ");
        time = scan.nextFloat();

        System.out.println("total distance after T time: " + (s + time * (velocity1 + velocity2)));// t vaqttan utgandan keyingi masofani aniqlash uchin ishlatilgan formula va uni chiqarish, String toifa bilan floatni konkatenatsiya qilish orqali
    }
}
