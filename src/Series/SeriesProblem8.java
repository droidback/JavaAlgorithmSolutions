package Series;

import java.util.Scanner;

public class SeriesProblem8{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a, count=0;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a = scan.nextDouble();
            if (a%2==0){
                System.out.println(a);
                count++;
            }
        }
        System.out.println(count);
    }
}