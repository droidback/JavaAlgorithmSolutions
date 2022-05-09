package Series;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class SeriesProblem6 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer tk = new StringTokenizer(reader.readLine());
        System.out.println("barcha qiymatlarni probel orqali bir qatorda kiriting: ");
        int n = Integer.parseInt(tk.nextToken());

        double number, roundNumber, sum=1;

        System.out.println(n);
        for (int i = 0; i < n; i++) {
            number = Double.parseDouble(tk.nextToken());
            roundNumber = number - (int) number;
            System.out.print(roundNumber + " \n");
            sum *= roundNumber;
        }
        System.out.print(sum);
    }
}