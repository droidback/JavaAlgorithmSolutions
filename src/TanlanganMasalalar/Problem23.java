package TanlanganMasalalar;

import java.util.Scanner;

public class Problem23{
    static int digitCount(int n){
        int k=0;
        while(n!=0){
            n = n/10;
            k++;
        }
        return k;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(digitCount(n));
    }
}