// ques 18

import java.util.Scanner;

public class DivideByZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter Value of b : ");
        int b = sc.nextInt();
        int c;
        sc.close();
        try {
            c = a / b;
            System.out.print("Value of " + a + " / " + b + " = " + c);
        } catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
}