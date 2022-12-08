Today is classic problem. Do you know Santonacci? He asked Santa to help him with creating the algorithm to effectively handle Fibonacci sequence.

The Fibonacci numbers form a Fibonacci sequence, where every number is the sum of the two numbers before (with exclusions for 0 and 1):

```
F(0) (Fibonacci of 0) = 0, F(1) = 1
F(n) = F(n - 1) + F(n - 2), if n > 1
```

I give you `n` and you return me calculated `F(n)`


**Samples:**
```
n = 2
result = 1
Why? F(2) = F(1) + F(0) [two preceeding results] = 1 + 0 = 1
```
```
n = 3
result = 2
Why? F(3) = F(2) + F(1) = 1 + 1 = 2
```
```
n = 4
result = 3
Why? F(4) = F(3) + F(2) = 2 + 1 = 3
```
```
n = 5
result = 5
Why? F(5) = F(4) + F(3) = 3 + 2 = 5
```
```
n = 6
result = 8
Why? F(6) = F(5) + F(4) = 5 + 3 = 8
```

**Assumptions:**
I know that you have a problem with test cases so this time it's easier. `n >= 0 && n <= 30` <- just 31 test cases :)

**Hint after you solve it:**
Try to reduce time complexity below exponential one O(2<sup>n</sup>).
