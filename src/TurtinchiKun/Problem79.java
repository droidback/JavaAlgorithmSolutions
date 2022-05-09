package TurtinchiKun;

public class Problem79 {
    public static void main(String[] args) {
        System.out.println(digitCount("a4s5d8  00 "));
        System.out.println();
    }

    static int digitCount(String str) {
        if (str.length() == 0) {
            return 0;
        }
        char c = str.charAt(0);
        int increase = 0;
        if ('0' <= c && c <= '9') {
            increase = 1;
        }
        return increase + digitCount(str.substring(1));
    }
}