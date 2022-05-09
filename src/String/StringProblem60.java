package String;

import java.util.Scanner;

public class StringProblem60{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = scan.next();
        int begin, end;

        begin = fullName.indexOf("\\");
        end = fullName.indexOf("\\",begin+1);
        if (end==-1){
            System.out.println("\\");
        }else {
            System.out.println(fullName.substring(begin+1,end));
        }
    }
}