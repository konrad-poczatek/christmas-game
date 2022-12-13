Santa arrived to a house without chimney! Now he needs to climb the stairs to reach upper floors. 

It takes `x` steps to reach top of the staircase.

Everytime you can either climb by `1` or `2` steps at once. 

How many distinct ways you can take to climb to the top?

**Samples**
```
X = 1
Result: 1 -> because you can only use one way: `1` step at once
```
```
X = 2
Result: 2 -> why:
 1. 1 step + 1 step
 2. 2 steps
```
```
X = 3
Result: 3
 1. 1 step + 1 step + 1 step
 2. 1 step + 2 steps
 3. 2 steps + 1 step
```
```
X = 45
Result: 1836311903
```

**Assumptions:**
* `X >= 1`
* `X <= 45`
* You cannot create map with results just to read it and have runtime 0ms (Alex's gate case)
