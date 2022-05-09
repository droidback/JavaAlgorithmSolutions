package Series;

import java.util.Scanner;

public class SeriesProblem23{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("n= ");
        int n= sc.nextInt();
        int buzgani=0;
        int prevNumber,son;
        boolean monoton=false;
        boolean birinchi=true;
        prevNumber= sc.nextInt();
        for (int i = 1; i < n; i++) {
            son= sc.nextInt();
            if (i==1){
                monoton=prevNumber<son;
            }else {
                if (monoton!=prevNumber<son){
                    if (birinchi){
                        buzgani=son;
                        birinchi=false;
                    }
                }
            }
            prevNumber=son;
            monoton=!monoton;
        }
        System.out.println(buzgani);
    }
}