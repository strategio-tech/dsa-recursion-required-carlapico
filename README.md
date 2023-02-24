# DSA Assignment: Recursion (REQUIRED)

Accepting the GitHub Assignment will create a repo with a series of challenges at `/src/main/java/tech.strategio` and its corresponding unit tests at `/src/test/java/tech.strategio`.

Each exercise contains a class with a method. Complete the methods in an IDE such that the unit tests pass. You should run your unit tests often, either through your Java IDE or through the command line (`gradle test`).

To submit the exercises, push a commit to GitHub. Automated tests will run, and you’ll see a green checkbox if ALL unit tests pass.

## Assignments

### E01 - Nth Fibonacci

*Required, Difficulty rating: Easy*

The Fibonacci sequence is defined as follows: the first number of the sequence is `0`, the second number is `1`, and the nth number is the sum of the (n - 1)th and (n - 2)th numbers. Write a function that takes in an integer n and returns the nth Fibonacci number.

Important note: the Fibonacci sequence is often defined with its first two numbers as `F0 = 0` and `F1 = 1`. For the purpose of this question, the first Fibonacci number is `F0`; therefore, `getNthFib(1)` is equal to `F0`, `getNthFib(2)` is equal to `F1`, etc..

Sample Input #1
```
n = 2
```

Sample Output #1
```
1 // 0, 1
```

Sample Input #2
```a
n = 6
```

Sample Output #2
```
5 // 0, 1, 1, 2, 3, 5
```


## Hints

<details>
  <summary>Hint 1</summary>

The formula to generate the nth Fibonacci number can be written as follows: F(n) = F(n - 1) + F(n - 2). Think of the case(s) for which this formula doesn't apply (the base  case(s)) and try to implement a simple recursive algorithm to find the nth Fibonacci number with this formula.
</details>

<details>
  <summary>Hint 2</summary>

What are the runtime implications of solving this problem as is described in Hint #1? Can you use memoization (caching) to improve the performance of your algorithm?
</details>

<details>
  <summary>Hint 3</summary>

Following the suggestion in Hint #1, try traversing the input array and updating the three largest numbers if necessary by shifting them accordingly.
</details>

- Note: this is not the same problem as it is on LeetCode.
