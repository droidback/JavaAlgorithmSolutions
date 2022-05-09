package Series;

import java.util.Scanner;

public class SeriesProblem10{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a;
        boolean check=false;
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            a = scan.nextDouble();
            if (a>0){
                check=!check;
            }
        }
        System.out.println(check);
    }
}