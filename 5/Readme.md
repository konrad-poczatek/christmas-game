Santa prepared some money gifts to people from Ancient Rome Empire. But because, they're ancient they asked for money using their numbers!

The goal is to convert Roman numbers to Arabic numbers.

Roman numbers have symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.
```
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
```
For example, `3` is `III` in Roman numbers (add three ones together). 
`11` is `XI`, which is `X + I`. 
The number `26` is `XXVI`, which is `XX + V + I`.

Roman numbers are usually written largest to smallest from left to right. 

However, the number for four is not `IIII`. 
Instead, the numeral four is written as `IV`. 
Because the one is before the five we subtract it making four. 
The same principle applies to the number nine, which is written as `IX`. 

There are six situations where subtraction occurs:

* `I` can be before `V` (5) and `X` (10) to make 4 and 9. 
* `X` can be before `L` (50) and `C` (100) to make 40 and 90. 
* `C` can be before `D` (500) and `M` (1000) to make 400 and 900.

**Examples**
```
roman number: III
result: 3 -> 1 + 1 + 1
```
```
roman number: DLXII
result: 562 -> 500 + 50 + 10 + 1 + 1
```
```
roman number: MMCMXCIV
result: 2994 -> 1000 + 1000 + (1000 - 100) + (90 - 10) + (5 - 1)
```
```
roman number: III
result: 3 -> 1 + 1 + 1
```

**Hint:**
Start with biggest numbers

**Assumptions:**
* romanNumber won't be longer than `15` and won't be shorter than `1`
* romanNumber contains only roman numbers (nothing more)
* max number would be `3999` and minimum `1`
