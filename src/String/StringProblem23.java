package String;

import java.util.Arrays;
import java.util.Scanner;

public class StringProblem23 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char firstOperation = str.charAt(0);
        if(str.charAt(0)== '-') str = str.substring(1);

        String[] str2 = str.split("[-+]");

        char[] s = str.toCharArray();
        int index = 0, sum = 0;

        if(firstOperation!='-'){
            sum +=Integer.parseInt(str2[index]);
        } else {
            sum +=(Integer.parseInt(str2[index]) * -1);
        }
        index++;
        for (int i = 1; i < s.length; i++) {
            if (s[i] == '+') {
                sum += Integer.parseInt(str2[index]);
                index++;
            } else if(s[i]=='-'){
                sum += (Integer.parseInt(str2[index]) * -1);
                index++;
            }
        }
        System.out.println(Arrays.toString(str2));
        System.out.println(sum);
    }
}