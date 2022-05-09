package String;

public class StringProblem63 {
    public static void main(String[] args) {
        String str = "((())))(";
        int openBrackets = 0, closeBrackets = 0;
        boolean isError = false;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == '(') {
                openBrackets++;
            } else if (str.charAt(i) == ')') {
                closeBrackets++;
            }

            if (openBrackets < closeBrackets) {
                System.out.println(i);
                isError = true;
            }
        }
        if (!isError) {
            if (openBrackets != closeBrackets) {
                System.out.println(-1);
            } else {
                System.out.println(0);
            }
        }
    }
}