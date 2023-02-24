package tech.strategio;

import java.util.*;

public class E01 {
    public static int getNthFib(int n) {
        if (n == 1) {
            return 0;
        } else if (n == 2) {
            return 1;
        } else {
            int prev1 = 0;
            int prev2 = 1;
            int current = 0;
            for (int i = 3; i <= n; i++) {
                current = prev1 + prev2;
                prev1 = prev2;
                prev2 = current;
            }
            return current;
        }
    }
}


// Explanation:

/*
This code defines a public class called Fibonacci with a public static method called getNthFib
that takes an integer n as an argument and returns the nth Fibonacci number based on the definition
of the sequence with F0 = 0 and F1 = 1.

The method uses a simple iterative approach to calculate the nth Fibonacci number.

If n is 1, the method returns 0.
If n is 2, the method returns 1.
Otherwise, it initializes three variables prev1, prev2, and current to 0, 1, and 0
respectively, and iterates through a loop starting at 3 and going up to n.
In each iteration, it calculates the next Fibonacci number as the sum of prev1 and prev2,
stores the value of prev2 in prev1, and the value of current in prev2.
Once the loop is done, the method returns current, which is the nth Fibonacci number.

* */