package ForLoop;

import java.util.Scanner;

public class ForLoopNumber12 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        float n = scan.nextFloat();
        float sum = 1;
        int j = 0;
        for (float i = 1.1f; j < n; i += 0.1f) {
            sum *= i;
            j++;
        }
        System.out.printf("%.1f", sum);
    }
}
