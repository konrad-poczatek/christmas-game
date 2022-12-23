You recevie a list of poles (not Poles!). Every pole has different height in meters. Between every pole is a distance one meter. 

Find two poles, between which if you create a big container it would fit most gifts and return the area of the container.

![image](https://user-images.githubusercontent.com/114927967/208857463-986a24ed-8d93-4980-8667-5ce0a19c6eda.png)

**Samples:**
```
poles: [1,1]
result: 1
```
```
poles: [1,2,3]
result: 2 (it may be container between 1 and 3 - height 1, width 2, or between 2 and 3 - height 2, width 1)
```
```
poles: [1,2,3,4,5,6,7,8,9]
result: 20
```
```
poles: [10,1,2,3,4,5,6,7,8,9,10]
result: 100
```

**Assumptions:**
* container CANNOT be slant
* there are minimum two poles
* height of a pole is minimum 0 and maximum 1000 meters
