package Series;

import java.util.Scanner;

public class SeriesProblem12{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double a,sum=0;
        boolean check=true;
        int n = Integer.MAX_VALUE;
        for (int i = 0; i < n&&check; i++) {
            a = scan.nextDouble();
            if (a==0){
                check= false;
            }else {
                sum++;
            }
        }
        System.out.println(sum);
    }
}