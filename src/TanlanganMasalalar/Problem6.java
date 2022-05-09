package TanlanganMasalalar;

import java.util.Scanner;

/**
 * @created by Shohruh
 * date 23.Dec.2021; time: 20:14
 * @company: EPAM
 */
public class Problem6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int k = scan.nextInt();
        int count = 0;
        for (int i = 2; i < k; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                count++;
            }
        }
        System.out.println("count: " + count);

//        int n = scan.nextInt();
//        sieveOfEratosthenes(n);
    }

//    static void sieveOfEratosthenes(int n) {
//        long count=0;
//        boolean[] prime = new boolean[n + 1];
//        for (int i = 0; i <= n; i++)
//            prime[i] = true;
//
//        for (int p = 2; p * p <= n; p++) {
//            if (prime[p]) {
//                for (int i = p * p; i <= n; i += p)
//                    prime[i] = false;
//            }
//        }
//
//        // Print all prime numbers
//        for (int i = 2; i <= n; i++) {
//            if (prime[i]){
//                System.out.println(i);
//                count++;
//            }
//        }
//        System.out.println("count: "+count);
//    }

    static boolean isPrime(int n) {
        if (n == 2) return true;
        else if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
