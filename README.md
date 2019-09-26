# HomeworkWeekOneDay2

Research

1. What is the difference in a hash map versus a hash table?

    Hash map allows you to use null where hash table doesn't.

2. Why should you generally override the equals and hashCode methods?

    Because if you do not, it will prevent your class from functioning properly.

3. How does a factory design pattern work?

    It creates objects without having to specify the exact class of the object that will be created.

4. How does Java Garbage Collection Work?

    Java programs run on the JVM, objects are created on the heap, which is a portion of memory dedicated to the program. 
    Eventually, some objects will no longer be needed. 
    The garbage collector finds these unused objects and deletes them to free up memory.

5. What is the difference in a HashMap vs a HashTable?

    The HashMap is not thread safe and the operation is non concurrent where 
    the HashTables are thread safe and have concurrent operations.

6. What is a sparse Array?

    A sparse array is an array in which most of the elements have the same value 
    (usually 0 or null). 

7. What is the difference in a ArrayList and the List?

    The main difference between List and ArrayList is that list is an interface and 
    ArrayList is a standard Collection class.

8. What is the difference in comparator vs comparable?

    Comparable is used to provide single way of sorting where
    Comparator is used to provide different ways of sorting.
    
    
Coding

1. Create a function to print the duplicates in a list of strings

    A nested loop with an equals method.
    
    ![Alt text](/problem1.png?raw=true "Problem 1")

2. Create function to check if the string is a palindrome without using string.reverse() method

    A loop with a charAt method.


3. Create a function that will print:
     "fizz" is the number is divisible by 3
     "buzz" is the number is divisible by 5
     "fizzbuzz" is the number is divisible by both
     
   I used the toString method.
  
    
