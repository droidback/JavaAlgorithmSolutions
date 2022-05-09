package BeshinchiKun;

public class Problem75{
    static int[] array = new int[20];
    static int written = 2;
    static int callCount = 0;

    public static void main(String[] args) {
        System.out.println(fib2(5));
        System.out.println(callCount);
        System.out.println(fib2(6));
    }

    static int fib2(int n) {
        callCount++;
        if (n == 1 || n == 2) {
            return 1;
        } else {
            if (written >= n) {
                return array[n];
            } else {
                return fib2(n - 1) + fib2(n - 2);
            }
        }
    }
}