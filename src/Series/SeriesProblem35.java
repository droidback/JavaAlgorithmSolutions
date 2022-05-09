package Series;

import java.util.Scanner;

public class SeriesProblem35{
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        int k = scan.nextInt(), number;
        boolean isBreak = false;

        for (int i = 0; i < k; i++) {
            for (int j = 1; !isBreak ; j++) {
                number = scan.nextInt();
                if(number == 0){
                    System.out.println(j);
                    isBreak = true;
                }
            }
            isBreak = false;
        }
    }
}