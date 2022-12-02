This time you need to check if you correctly close your brackets etc. So as input you receive a String which contains any of those characters: `[]{}()`. 
Goal is to check if they are correctly closed. Let's say you open with a bracket: `[` then it needs to be closed. Remember that it needs to be closed with exact order.
You cannot close it with `)`. 

**Examples:**

```
String = "[]"
Return true;
```

```
String = "[)"
Return false;
```

```
String = "[]{}()"
Return true;
```

```
String = "[{()}]"
Return true;
```

```
String = "[{))}"
Return false;
```
