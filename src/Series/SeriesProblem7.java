package Series;

import java.util.Scanner;

public class SeriesProblem7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), sum = 0;
        double number, roundNumber;
        for (int i = 0; i < n; i++) {
            number = scan.nextDouble();
            roundNumber = number - (int) number;
            if (roundNumber >= 0.5) {
                number = number + 1.0 - roundNumber;
            } else {
                number -= roundNumber;
            }
            sum += number;
            System.out.println(number);
        }
        System.out.println(sum);
    }
}