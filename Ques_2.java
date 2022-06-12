// Ques 2

import java.util.*;

public class factorial {
    public static void main(String args[]) {
        int i, fact = 1;
        System.out.print("Enter a number: ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(); // It is the number to calculate factorial
        for (i = 1; i <= a; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + a + " is: " + fact);
    }
}
