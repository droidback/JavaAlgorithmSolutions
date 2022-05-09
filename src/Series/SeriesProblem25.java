package Series;

import java.util.Scanner;

public class SeriesProblem25{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count2 = 0;
        int number;
        boolean isStart = false;
        for (int i = 0; i < n; i++) {
            number = scanner.nextInt();
            if (number == 0) {
                isStart =true;
            }
            if (isStart) {
                count2 += number;
            }
        }
        System.out.println(count2);
    }
}