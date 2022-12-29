# data-structure

In Java, a LinkedList is a data structure that consists of a sequence of nodes, where each node stores a reference to an object and a reference to the next node in the sequence. LinkedLists are useful for storing and manipulating data because they allow you to easily insert and remove elements from the list without having to shift the remaining elements.


in this example, we create a LinkedList of type String and add some elements to it using the add() method.
We also demonstrate how to insert elements at the beginning or end of the list using the addFirst() and addLast() methods, 
and how to remove elements from the beginning or end of the list using the removeFirst() and removeLast() methods.
LinkedLists also provide several other methods for manipulating the list, such as getFirst() and getLast() for retrieving the first and last elements, get() and set() for accessing and modifying specific elements in the list, 
and contains() for checking if the list contains a specific element.

It's important to note that LinkedLists are not as efficient as arrays when it comes to accessing and modifying elements at specific indices, because they require traversing the list to find the element. However, they are much more efficient at inserting and removing elements from the list, 
because they only require updating the references in the nodes at the beginning or end of the list.


```java

import java.util.LinkedList;

public class LinkedListExample {
public static void main(String[] args) {
// Create a new LinkedList
LinkedList<String> list = new LinkedList<>();

    // Add elements to the list
    list.add("apple");
    list.add("banana");
    list.add("cherry");

    // Print the list
    System.out.println(list);  // Output: [apple, banana, cherry]

    // Insert an element at the beginning of the list
    list.addFirst("pear");
    System.out.println(list);  // Output: [pear, apple, banana, cherry]

    // Insert an element at the end of the list
    list.addLast("grape");
    System.out.println(list);  // Output: [pear, apple, banana, cherry, grape]

    // Remove the first element from the list
    list.removeFirst();
    System.out.println(list);  // Output: [apple, banana, cherry, grape]

    // Remove the last element from the list
    list.removeLast();
    System.out.println(list);  // Output: [apple, banana, cherry]
}
}
```

