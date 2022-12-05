## Horizontal Thunder Problem

You have `SANTAISASFASTASTHUNDER` written as horizontal thunder pattern. Height of it is given as an input. Below example is that string with height of 4:

```
S     S     T     N
A   I A   S A   U D
N A   S A   S H   E
T     F     T     R
```

The goal is to read that phrase line by line:
`SSTNAIASAUDNASASHETFTR`

Example: 

```
Given phrase: SANTAISASFASTASTHUNDER
Given height: 4
Result: SSTNAIASAUDNASASHETFTR
```
```
Given phrase: SA
Given height: 1
Result: SA
```
```
Given phrase: SA
Given height: 2
Result: SA
```
```
Given phrase: SANTA
Given height: 2
Result: SNAAT
```

**Assumptions:**
* phrase may contain only latin letters (lower and upper case), comma (,) and dot (.)
