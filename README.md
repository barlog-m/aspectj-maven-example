Maven project example with AspectJ
=====================

Project example with [AspectJ](https://eclipse.org/aspectj/) and [Maven](http://maven.apache.org).

###Branches
* [master](https://github.com/Barlog-M/aspectj-maven-example/tree/master) — without AspectJ
* [compile-time-weaving](https://github.com/Barlog-M/aspectj-maven-example/tree/compile-time-weaving) — compile-time weaving
* [load-time-weaving](https://github.com/Barlog-M/aspectj-maven-example/tree/load-time-weaving) — load-time weaving
* [compile-time-weaving-and-lombok](https://github.com/Barlog-M/aspectj-maven-example/tree/compile-time-weaving-and-lombok) — compile-time weaving with (Lombok)[http://projectlombok.org]

### Run ###
```
mvn compile exec:java
```

### Create executable jar with dependencies ###
```
mvn package assembly:single
```
