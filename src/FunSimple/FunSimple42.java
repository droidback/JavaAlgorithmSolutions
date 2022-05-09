package FunSimple;

import java.util.Scanner;

public class FunSimple42 {
    public static double cos1(double x,double n)
    {
        double sum=1, p=1;
        for (int i = 1; i <=n ; i++) {
            p*=2*i*(2*i-1);
            sum+=Math.pow(-1,i)*Math.pow(x,2*i)/p;
        }
        return sum;   //1-2+2/3-64/720
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x1=scan.nextDouble();
        for (int i = 1; i <=3; i++) {
            System.out.println(cos1(x1,scan.nextDouble()));
        }
    }
}
