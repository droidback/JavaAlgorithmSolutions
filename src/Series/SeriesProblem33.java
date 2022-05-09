package Series;

import java.util.Scanner;

public class SeriesProblem33{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), k = scan.nextInt(), number, tempIndex=0;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                number = scan.nextInt();
                if (number == 2) tempIndex = j + 1;
            }
            System.out.println(tempIndex);
            tempIndex=0;
        }
    }
}