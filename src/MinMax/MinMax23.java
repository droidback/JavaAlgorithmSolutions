package MinMax;

import java.util.Scanner;

public class MinMax23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter n: ");
        int n = scan.nextInt();
        int max1=0;
        int max2=0;
        int max3=0;

        for (int i = 1; i <=n ; i++) {
            int number = scan.nextInt();

            if(i==1){
                max1=number;
                max2=number;
                max3=number;
            }

            if ((number > max3)&&(number !=max1)&&(number!=max2)){
                if (number >max2){
                    max3 = max2;
                    if(number> max1){
                        max2 = max1;
                        max1 = number;
                    }else{
                        max2 = number;
                    }
                }else{
                    max3=number;
                }
            } else{
                max3 = number;
            }

            if (max1==max2) max2 = number;
            if ((max3==max1)||(max3==max2)) max3= number;
        }
        System.out.println(max3+" "+max2+" "+max1);
    }
}
