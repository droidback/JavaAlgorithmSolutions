package Series;

import java.util.Scanner;

public class SeriesProblem34 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt(), k = scan.nextInt(), number, sum = 0;
        boolean isNumberHasTwo = false;
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                number = scan.nextInt();
                sum += number;
                if ((number == 2) && !isNumberHasTwo) isNumberHasTwo = true;
            }
            System.out.println(isNumberHasTwo ? sum : 0);
            sum = 0;
            isNumberHasTwo = false;
        }
    }
}