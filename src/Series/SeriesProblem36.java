package Series;

import java.util.Scanner;

public class SeriesProblem36{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt(), number, number2;
        boolean isBreak = false;

        for (int i = 0; i < k; i++) {
            number = scan.nextInt();
            for (int j = 1; !isBreak ; j++) {
                number2 = number;
                number = scan.nextInt();
                if(number2 < number){
                    //hato
                    if(number==2){
                        System.out.println(j);
                        isBreak = true;
                    }
                }
            }
            isBreak = false;
        }
    }
}