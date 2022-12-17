Today you have to create regular expression matching, where for given input string `str` and given pattern `pat`. 
Your implementation of regular expression matching should support `.` and `*`.

* `.` matches any single character
* `*` matches zero or more of the preceding element. 

Your matching should cover entire input.

In simple words check if given pattern matches given string.

**Samples:**
```
Input: str = "bb", pat = "b"
Result: false -> 'b' does not match the entire string.
```
```
Input: str = "bb", pat = "b*"
Output: true -> '*' = 0 or more preceding element: 'b'. When you repeat b once it becomes 'bb'.
```
```
Input: str = "ab", pat = ".*"
Output: true -> '.*' means 0 or more any character
```
