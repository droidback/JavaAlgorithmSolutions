package FunSimple;

import java.util.Scanner;

public class FunSimple33 {
    public static float RadToDeg(float number) {
        return 180 * number / 3.14f;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            float number = scan.nextFloat();
            System.out.printf("%.2f %n", RadToDeg(number));
        }
    }
}
