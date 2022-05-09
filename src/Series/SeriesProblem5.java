package Series;

import java.util.Scanner;

public class SeriesProblem5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double number, sum = 0, roundNumber;
        for (int i = 0; i < n; i++) {
            number = scan.nextDouble();
            roundNumber = number % 10 * 10 % 10 / 10;
            if (roundNumber >= 0.5){
                number = number + 1.0 - roundNumber;
                sum += number;
            }
             else sum += (number - roundNumber);
        }
        System.out.println(sum);
    }
}