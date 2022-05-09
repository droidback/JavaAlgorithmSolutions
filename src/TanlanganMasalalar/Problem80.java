package TanlanganMasalalar;

public class Problem80 {
    public static void main(String[] args) {
        System.out.println(palindrome("kiyik"));
    }

    static boolean palindrome(String str) {
        if (str.length() == 0 || str.length() == 1) {
            return true;
        } else {
            if (str.charAt(0) == str.charAt(str.length() - 1)) {
                return palindrome(str.substring(1, str.length() - 1));
            } else {
                return false;
            }
        }
    }
}