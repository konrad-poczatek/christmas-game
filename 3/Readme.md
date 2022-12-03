Santa Claus is crazy about statistics and analysis. Whe has a list of gifts. He would like to know what is the bigger shared prefix on this list.

**Samples**

```
List: ["money", "mountain bike", "morning breakfast"]
Result: "mo" -> mo ~~ ney ~~, mo ~~untain bike~~, mo~~rning breakfast
```

```
List: ["money", "bike", "breakfast"]
Result: "" -> empty string because they dont have shared prefix
```

**Assumptions**

* gift contains only lowercase latin letter
* gift has no more letters than 200
* list of gifts contains min 1 gift and maximum 200 gifts
