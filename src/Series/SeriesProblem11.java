package Series;

import java.util.Scanner;

public class SeriesProblem11{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,k;
        boolean ckeck=false;
        int n = scan.nextInt();
        k= scan.nextDouble();
        for (int i = 0; i < n; i++) {
            a = scan.nextDouble();
            if (a<k){
                ckeck=!ckeck;
            }
        }
        System.out.println(ckeck);
    }
}