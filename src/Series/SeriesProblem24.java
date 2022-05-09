package Series;

import java.util.Scanner;

public class SeriesProblem24{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int count1 = 0, count2 = -1;
        int son;
        boolean isStart = false;
        for (int i = 0; i < n; i++) {
            son = scanner.nextInt();
            if (son == 0) {
                isStart = true;
                count1 = count2;
                count2 = 0;
            }
            if (isStart) {
                count2 += son;
            }
        }
        System.out.println(count1);
    }
}