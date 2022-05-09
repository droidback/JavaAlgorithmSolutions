package Series;

import java.util.Scanner;

public class SeriesProblem19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count2 = 0;
        int son;
        boolean isStart = false;
        for (int i = 0; i < n; i++) {
            son = scanner.nextInt();
            if (son == 0) {
                isStart = true;
            }
            if (isStart) {
                count2 += son;
            }
        }
        System.out.println(count2);
    }
}