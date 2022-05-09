package Series;

import java.util.Scanner;

public class SeriesProblem4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        double number, sum = 0, multiplication = 1;
        for (int i = 0; i < n; i++) {
            number = scan.nextDouble();
            sum+=number;
            multiplication *=number;
        }

        System.out.println(sum);
        System.out.println(multiplication);
    }
}