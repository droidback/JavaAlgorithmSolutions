package TanlanganMasalalar;

import java.util.Scanner;

public class Problem38{
    public static void countFreq(int[] arr, int n)
    {
        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {

            if (visited[i])
                continue;

            int count = 1;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j]) {
                    visited[j] = true;
                    count++;
                }
            }
            System.out.println(arr[i] + " soni " + count+" ta");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i]= scan.nextInt();
        }
        countFreq(arr,n);
    }
}