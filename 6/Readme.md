Today Rome's Santa received the wish list with money. But the amount of money is in Arabic numerals! Please help Santa to convert them into Roman numerals!

Those are represented by symbols: `I`, `V`, `X`, `L`, `C`, `D` and `M`.

Rules are familiar for you:
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

You receive number as an Integer -> return roman numeral as a String.

**Examples**
```
arabic number: 3
result: III
```
```
arabic number: 562
result: DLXII -> 500 (D) + 50 (L) + 10 (X) + 1 (I) + 1 (I)
```
```
arabic number: 2994
result: MMCMXCIV -> 1000 (M) + 1000 + (1000 - 100) (CM) + (90 - 10) (XC) + (5 - 1) (IV)
```

**Hint:**
Maybe yesterday's solution would help you?

**Assumptions:**
* max number would be `3999` and minimum `1`
