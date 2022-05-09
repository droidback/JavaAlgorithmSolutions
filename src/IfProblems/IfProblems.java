package IfProblems;

import java.util.Scanner;

public class IfProblems {

    public static class IfNumber1 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number: ");
            int number = scan.nextInt();

            if (number > 0) System.out.println("positive number: " + (number += 1));
            else System.out.println("negative number: " + number);


        }
    }

    public static class IfNumber2 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number: ");
            int number = scan.nextInt();

            if (number > 0) System.out.println("positive number: " + (number += 1));
            else System.out.println("negative number: " + (number -= 2));
        }
    }

    public static class IfNumber3 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number: ");
            int number = scan.nextInt();

            if (number > 0) System.out.println("positive number: " + (number += 1));
            else if (number == 0) System.out.println("number that posses zero: " + (number += 10));
            else System.out.println("negative number: " + (number -= 2));
        }
    }

    public static class IfNumber4 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter three numbers: ");

            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int number3 = scan.nextInt();

            int i = 0;
            int j = 0;

            if (number1 > 0) i++;
            else j++;
            if (number2 > 0) i++;
            else j++;
            if (number3 > 0) i++;
            else j++;

            System.out.println("positive number(s):" + i);
            System.out.println("negative number(s):" + j);

        }
    }

    public static class IfNumber5 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter three numbers: ");

            int number1 = scan.nextInt();
            int number2 = scan.nextInt();
            int number3 = scan.nextInt();

            int i = 0;
            int j = 0;

            if (number1 > 0) i++;
            else j++;
            if (number2 > 0) i++;
            else j++;
            if (number3 > 0) i++;
            else j++;

            System.out.println("positive number(s):" + i);
            System.out.println("negative number(s):" + j);
        }
    }

    public static class IfNumber6 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b: ");

            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a > b) System.out.println("the number a is bigger: " + a);
            else System.out.println("the number b is bigger: " + b);
        }
    }

    public static class IfNumber7 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b: ");

            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a > b) System.out.println("the number b is smaller: " + b);
            else System.out.println("the number a is smaller: " + a);
        }
    }

    public static class IfNumber8 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b: ");

            int a = scan.nextInt();
            int b = scan.nextInt();

            if (a > b) System.out.println("the bigger number is : " + a);
            else System.out.println("the bigger number is :" + b);

            if (b > a) System.out.println("the smaller number is: " + a);
            else System.out.println("the smaller number is: " + b);
        }
    }

    public static class IfNumber9 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = 0;

            if (a < b) System.out.println("a: " + a + " b: " + b);
            else {
                c = a;
                a = b;
                b = c;
                System.out.println("a: " + a + " b: " + b);
            }
        }
    }

    public static class IfNumber10 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a + b;

            if (a != b) System.out.println("a = (a + b): " + (a = c) + " b = (a + b): " + (b = c));
            else System.out.println("a: " + (a = 0) + " b: " + (b = 0));

        }
    }

    public static class IfNumber11 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b: ");

            int a = scan.nextInt();
            int b = scan.nextInt();

            int c = Math.max(a, b);

            if (a != b) System.out.println("a : " + (a = c) + " b : " + (b = c));
            else System.out.println("a: " + (a = 0) + " b: " + (b = 0));

        }
    }

    public static class IfNumber12 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int min;

            if (a <= b && a <= c) min = a;
            else if (b <= a && b <= c) min = b;
            else min = c;

            System.out.println("smaller number is: " + min);
        }
    }

    public static class IfNumber13 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();


            if ((b <= a) & (a <= c) || (b >= a) & (a >= c)) {
                System.out.println("an average number is" + a);
            } else {
                if ((a <= b) & (b <= c) || (a >= b) & (b >= c)) {
                    System.out.println("an average number is" + b);
                } else {
                    System.out.println("an average number is" + c);
                }
            }

        }
    }

    public static class IfNumber14 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            int max, min;

            if (a >= b && a >= c) max = a;
            else if (b >= a && b >= c) max = b;
            else max = c;

            if (a <= b && a <= c) min = a;
            else if (b <= a && b <= c) min = b;
            else min = c;

            System.out.println("max: " + max + " min: " + min);
        }
    }

    public static class IfNumber15 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if ((a + b) >= (a + c) && (a + c) >= (b + c)) System.out.println("a+b:" + (a + b));
            else if ((a + c) >= (a + b) && (a + c) >= (b + c)) System.out.println("a+c:" + (a + c));
            else System.out.println("b+c:" + (b + c));
        }
    }

    public static class IfNumber16 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a < b && b < c) System.out.println("case a < b < c : " + (a += 2) + " " + (b += 2) + " " + (c += 2));
            else System.out.println("the numbers a b c not ascending: " + (a = -a) + " " + (b = -b) + " " + (c = -c));
        }
    }

    public static class IfNumber17 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a < b && b < c || a > b && b > c)
                System.out.println(" due to the case a < b < c or a > b > c : " + (a += 2) + " " + (b += 2) + " " + (c += 2));
            else System.out.println("the numbers a b c not ascending: " + (a = -a) + " " + (b = -b) + " " + (c = -c));
        }
    }

    public static class IfNumber18 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (a == b) System.out.println("the 3rd number c = " + c);
            else if (b == c) System.out.println("the 1st number a = " + a);
            else System.out.println("the 2nd number b = " + b);
        }
    }

    public static class IfNumber19 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c & d: ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int d = scan.nextInt();

            if (a == b && b == c) System.out.println("the 4th number d = " + d);
            else if (a == d && d == c) System.out.println("the 2nd number b = " + b);
            else if (a == b && b == d) System.out.println("the 3rd number c = " + c);
            else System.out.println("the 1st number a = " + a);
        }
    }

    public static class IfNumber20 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers a & b & c : ");

            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();

            if (Math.abs(a - b) <= Math.abs(b - c) && Math.abs(a - b) <= Math.abs(a - c))
                System.out.println("the AB path is closer: " + Math.abs(a - b));
            else if (Math.abs(b - c) <= Math.abs(a - b) && Math.abs(b - c) <= Math.abs(a - c))
                System.out.println("the BC path is closer: " + Math.abs(b - c));
            else System.out.println("the AC path is closer: " + Math.abs(a - c));
        }
    }

    public static class IfNumber21 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers OX & OY : ");

            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x == 0 && y == 0) System.out.println(0);
            else if (x == 0) System.out.println(1);
            else if (y == 0) System.out.println(2);
            else System.out.println(3);
        }
    }

    public static class IfNumber22 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers OX & OY : ");

            int x = scan.nextInt();
            int y = scan.nextInt();

            if (x > 0 && y > 0) System.out.println("1st quarter");
            else if (x < 0 && y > 0) System.out.println("2nd quarter");
            else if (x < 0 && y < 0) System.out.println("3rd quarter");
            else System.out.println("1st quarter");
            ;
        }
    }

    public static class IfNumber23 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the numbers x1 y1 x2 y3 x3 y3 : ");

            int x1 = scan.nextInt();
            int y1 = scan.nextInt();

            int x2 = scan.nextInt();
            int y2 = scan.nextInt();

            int x3 = scan.nextInt();
            int y3 = scan.nextInt();

            int x4, y4;

            if (x1 == x3) System.out.println("x4: " + (x4 = x2));
            else if (x2 == x3) System.out.println("x4: " + (x4 = x1));
            else System.out.println("x4: " + (x4 = x3));

            if (y1 == y3) System.out.println("y4: " + (y4 = y2));
            else if (y2 == y3) System.out.println("y4: " + (y4 = y1));
            else System.out.println("y4: " + (y4 = y3));
        }
    }

    public static class IfNumber24 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the x: ");

            double x = scan.nextInt();

            if (x > 0) System.out.println("2*sin(x): " + 2 * Math.sin(x));
            else System.out.println(x - 6);
        }
    }

    public static class IfNumber25 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the x: ");

            double x = scan.nextInt();

            if (x < -2 || x > 2) System.out.println("x*2: " + x * 2);
            else System.out.println("3*x: " + (-3 * x));
        }
    }

    public static class IfNumber26 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the x: ");

            double x = scan.nextInt();

            if (x <= 0) System.out.println(-x);
            else if (0 < x && x < 2) Math.pow(x, 2);
            else if (x >= 2) System.out.println(4);
        }
    }

    public static class IfNumber27 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            double x = scan.nextDouble();

            if (x < 0) System.out.println(0);
            else if (x % 2 < 1) System.out.println(1);
            else System.out.println(-1);
        }
    }

    public static class IfNumber28 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);

            int year = scan.nextInt();

            if (year % 400 == 0 || year % 100 != 0 && year % 4 == 0) System.out.println(year + " is leap year");
            else System.out.println(year + " is not leap year");

        }
    }

    public static class IfNumber29 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number: ");

            int number = scan.nextInt();

            if (number > 0) System.out.print("positive");
            else System.out.print("negative");

            if (number % 2 == 0) System.out.print(" even number");
            else System.out.print(" odd number");
        }
    }

    public static class IfNumber30 {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("enter the number that is between 1-999: ");
            int number = scan.nextInt();

            if (0 < number && number < 2000) {
                if (number < 9) System.out.print("one-figure");
                else if (number % 10 == 0) System.out.print("two-figure");
                else System.out.print("three-figure");

                    if (number % 2 == 0) System.out.print(" even number");
                    else System.out.print(" odd number");
            } else System.out.println("please enter the right interval, which is 1-999!");
        }
    }
}
