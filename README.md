# Java exercises
Solutions and unit tests for java exercises

## Tasks
### Task №1
In this task you will create a function that takes a list of non-negative integers and strings and returns a new
list with the strings filtered out.

#### Examples
```java
getIntegerFromList(Arrays.asList(1,2,"a","b")) => {1,2}
getIntegerFromList(Arrays.asList(1,2,"a","b",0,15)) => {1,2,0,15}
getIntegerFromList(Arrays.asList(1,2,"a","b","aasf","1","123",231)) => {1,2,231}
```

### Task №2
Write a function named first_non_repeating_letter that takes a string input, and returns
the first character that is not repeated anywhere in the string.
For example, if given the input 'stress', the function should return &#39;t&#39;, since the
letter t only occurs once in the string, and occurs first in the string.
As an added challenge, upper- and lowercase letters are considered the same character,
but the function should return the correct case for the initial letter. For example, the
input 'sTreSS' should return 'T'.
If a string contains all repeating characters, it should return an empty string ("") or None.

### Task №3
Digital root is the recursive sum of all the digits in a number.
Given n, take the sum of the digits of n. If that value has more than one digit, continue
reducing in this way until a single-digit number is produced. The input will be a non-
negative integer.

#### Examples
```java
    16 --> 1 + 6 = 7
   942 --> 9 + 4 + 2 = 15 --> 1 + 5 = 6
132189 --> 1 + 3 + 2 + 1 + 8 + 9 = 24 --> 2 + 4 = 6
```

### Task №4
There is an array of numbers - arr [1, 3, 6, 2, 2, 0, 4, 5] there is a number target = 5.
Count the number of pairs in the array, the sum of which will give target

### Task №5
Den has invited some friends. His list is:
```java
 s = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
```
Could you make a program that:
* makes this string uppercase
* gives it sorted in alphabetical order by last name.
When the last names are the same, sort them by first name. Last name and first name of a
guest come in the result between parentheses separated by a comma.
So the result of function meeting(s) will be:

#### Examples
```java
"(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)"
```
It can happen that in two distinct families with the same family name two people have the same first
name too.

## Extra tasks
### Task №1
Create a function that takes a positive integer and returns the next bigger number that can be formed by
rearranging its digits.

#### Examples
```java
nextBigger(num: 12)   // returns 21
nextBigger(num: 513)  // returns 531
nextBigger(num: 2017) // returns 2071
```
If the digits can't be rearranged to form a bigger number, return -1

### Task №2
Take the following IPv4 address: __128.32.10.1__
This address has 4 octets where each octet is a single byte (or 8 bits).
* 1st octet 128 has the binary representation: __10000000__
* 2nd octet 32 has the binary representation: __00100000__
* 3rd octet 10 has the binary representation: __00001010__
* 4th octet 1 has the binary representation: __00000001__
So __128.32.10.1__ == __10000000.00100000.00001010.00000001__
Because the above IP address has 32 bits, we can represent it as the unsigned 32 bit
number: __2149583361__

Complete the function that takes an unsigned 32 bit number and returns a string representation
of its IPv4 address.

#### Examples
```java
2149583361 ==> "128.32.10.1"
32         ==> "0.0.0.32"
0          ==> "0.0.0.0"
```

## Technologies
Project is created with:
* Java SE 8

Project is tested with:
* JUnit 4

## Requirements
To run this project, you need to install the folowing packages on your machine:
* Apache Maven version 3.3.9 or higher
* Java SE 8

## Setup & Running
```
$ cd ../java-exercises
$ mvn test
```
