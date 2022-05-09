package MinMax;

import java.util.Scanner;
// hato kod
public class MInMax27 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int temp = 1, count = 1, maxCount = 1, index = 0;
        for (int i = 1; i <= n; i++) {
            int son = scan.nextInt();
            if (i == 1) {
                temp = son;
            } else {
                if (temp == son) {
                    count++;

                } else {
                    if (maxCount <= count) {
                        index = i;
                        temp = son;
                        maxCount = count;
                        count = 1;
                    }
                }
            }
        }
        System.out.println(Math.max(maxCount, count));
        System.out.println(index);
    }
}
