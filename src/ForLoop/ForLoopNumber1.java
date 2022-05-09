package ForLoop;

import java.util.Scanner;

public class ForLoopNumber1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter k and n: ");
            double k = scan.nextDouble();
            int n = scan.nextInt();

            for (int i = 0; i < n; i++) {
                System.out.println(k);
            }

        }
    }
