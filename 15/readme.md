Every good construction have to has really well defined roots, am I right?

Your task is to create a triangle in which every level below cointains one more element. Rule is that every element below has value of adjacent values above.

It's hard to imagine it's just from words so lets see the picture:

![image](https://user-images.githubusercontent.com/114927967/207813947-a52be2c0-b26b-47c0-8b37-5be7be96b285.png)

I give you number of rows and you need to create triangle with so many levels. First level is top level with value 1. 

Return sorted array of sorted arrays of elements.

**Samples**
```
levels: 1
return: [[1]]
```
```
levels: 2
return [[1],[1,1]]
```
```
levels: 3
return: [[1],[1,1],[1,2,1]]
```
```
levels: 4
return: [[1],[1,1],[1,2,1],[1,3,3,1]]
```
```
levels: 5
return: [[1],[1,1],[1,2,1],[1,3,3,1],[1,4,6,4,1]]
```
