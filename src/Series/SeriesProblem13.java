package Series;

import java.util.Scanner;

public class SeriesProblem13{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,sum=0;
        int n = Integer.MAX_VALUE;
        boolean check=true;
        for (int i = 0; i < n; i++) {
            a = scan.nextDouble();
            if (a>0&&a%2==0&&check){
                sum+=a;
                if (a==0){
                    check=!check;
                }
            }
        }
        System.out.println(sum);
    }
}