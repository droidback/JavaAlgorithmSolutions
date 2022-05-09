package TanlanganMasalalar;

import java.util.Scanner;

public class Problem22{
    static boolean isPrime(int n){
        if(n<2) return false;
        else if(n==2) return true;
        for (int i = 2; i*i <= n; i++) {
            if(n%i==0) return false;
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), count=0;
        for (int i = 2; i < n; i++) {
            if(isPrime(i)){
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count: "+count);

    }
}