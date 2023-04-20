## Stream API Practice
Stream API was introduced in Java 8. It is used to process collections of objects. There is a core stream operations which includes intermediate operations and terminal operations.
### Intermediate Operations
Intermediate operations return the stream itself so you can chain multiple method calls in a row.
```
filter()
map()
sorted()
```
### Terminal Operations
Terminal operations return a result of a certain type instead of a Stream.
```
forEach()
collect()
match()
count()
reduce()
```