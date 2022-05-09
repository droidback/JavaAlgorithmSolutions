package BeshinchiKun;

import java.util.Scanner;

public class Problem60{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String fullName = scan.next();
        int i=0, dot=0;

        while(i<fullName.length()){
            if(fullName.charAt(i)=='.'){
                dot =i+1;
            }
            i++;
        }
        fullName = fullName.substring(dot);
        System.out.println(fullName);
    }
}