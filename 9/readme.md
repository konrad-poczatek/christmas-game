Santa would like to calculate square root of a number, but he cannot use any build in functions or operators.

Return the square return of a number rounded down to the nearest integer. DO NOT use any builtin function (like Math.pow, Math.sqrt, sqrt). 
Returned value has to be positive.

**samples**
```
Number = 4
Result = 2 (-2 is also correct but returned value has to be positive)
```
```
Number = 9
Result = 3 (3^2 == 9)
```
```
Number = Integer.MAX_VALUE (2147483647)
Result = 46340
```

**Assumptions:**
* do **NOT** use any built in functions
* number is greater or equal 0
* number is lower or equal 2147483647
* result must be positive

**Hint**
You can use this code to check whether your solution is fast and correct (tune is as you wish):
```
for(int i = Integer.MAX_VALUE; i >= 0; i--) {
  System.out.println(i);
  assert ((int) Math.sqrt(i)) == findSquare(i);
}
```
