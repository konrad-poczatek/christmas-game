Today's problem is exponential one. You have two numbers given. One as a string `number`, one as an integer `exp`. 

You need to raise `number` to power `exp`: number<sup>exp</sup> and return it as a string.

**examples:**
```
number: "2", exp: 3
result: "8"
explanation: 2^3 = 2 * 2 * 2 = 8
```
```
number: "2.5", exp: 2
result: "6.25"
```
```
number: "0.3", exp: 2
result: "0.09"
```
```
number: "0.01", exp: 10
result: "0.00000000000000000001" - it's: (10^-20)
```
```
number: "-10", exp: 2
result: "100"
```
```
number: "-10", exp: 3
result: "-1000"
```
```
number: "1000", exp: 10
result: "1000000000000000000000000000000" - it's 1 + 30 zeros
```

**assumptons**
* `-1000 <= number <= 1000`
* number longest decimal number is 2: `0.01`
* number is always correct number, may contain only digits and `.`. There is always digit before and after dot.
* `0 <= exp <= 10`
