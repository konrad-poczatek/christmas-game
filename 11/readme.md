There is a sorted array of distinct integers as a first param, and a target value as a second param. You need to return index of the target if you can find it.

If there is no target value in an array, then return the index where it would be if it were inserted in order.

You must write an algorithm with O(log n) runtime complexity.

**Hint:**
Write alogorithm with `O(log n)` time complexity.

**Samples:**
```
Input: nums = [2,4,6,7], target = 6
Output: 2
```
```
Input: nums = [1,3,5,6], target = 3
Output: 1
```
```
Input: nums = [1,3,5,6], target = 8
Output: 4
```
**Assumptions:**
* array length is greater or equal 1 and lower than 105
* every integer value and target are greater or equal -104 and lower than 105
* array contains distinct values sorted in ascending order.
