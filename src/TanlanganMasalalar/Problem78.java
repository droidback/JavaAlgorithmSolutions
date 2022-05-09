package TanlanganMasalalar;

public class Problem78 {
    static int maxElement(int a[], int n) {
        if (n == 1) {
            return a[0];
        } else {
            return Math.max(a[n - 1], maxElement(a, n - 1));
        }
    }


    public static void main(String[] args) {
        int[] a = {4, 5, 7, 8, 4, 3};
        System.out.println(maxElement(a, a.length));
    }
}
