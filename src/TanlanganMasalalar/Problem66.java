package TanlanganMasalalar;
import java.util.Arrays;
import java.util.Scanner;

public class Problem66{
    static int[] invert(int n,int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]<arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i]= scan.nextInt();
        }
        System.out.println(Arrays.toString(invert(n,arr)));
    }
}