package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayProblem95 {
    public static void main(String[] args) {
        int[] massiv = {1, 0, 0, 5, 2, 4, 4, 7, 8, 5, 5};
        int count = 0;
        for (int i = 0; i < massiv.length - 1 - count; i++) {
            if (massiv[i] == massiv[i + 1]) {
                count++;
                if (massiv.length - count - (i + 1) >= 0)
                    System.arraycopy(massiv, i + 2, massiv, i + 1, massiv.length - count - (i + 1));
                massiv[massiv.length - count] = 0;
            }
        }
        for (int i = 0; i < massiv.length - 1; i++) {
            if (massiv[i] == massiv[i + 1]) {
                massiv[i] = 0;
            }
        }
        int index = 0;
        for (int i = 0; i < massiv.length; i++) {
            if (massiv[i] != 0) {
                massiv[index++] = massiv[i];
            }
        }
        for (int i = index; i < massiv.length; i++) {
            massiv[i] = 0;

        }
    }
}