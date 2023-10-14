# Iterator Interface in Java

- Defines three fundamental methods
1. Object next()
2. boolean hasNext()
3. void remove()
- These three methods provide access to the
contents of the collection
- An Iterator knows position within collection
- Each call to next() “reads” an element from
the collection
- Then you can use it or remove it

## Overview

The `Iterator` interface in Java is a fundamental component of the Java Collections Framework. It allows you to traverse and manipulate elements within a collection, such as lists, sets, and maps. The interface defines three essential methods and provides access to the contents of the collection.

## Fundamental Methods

The `Iterator` interface defines three crucial methods:

1. `next()`: This method retrieves the next element in the collection and advances the iterator's position. It returns the current element for processing.

2. `hasNext()`: Use this method to check if there are more elements in the collection to iterate over. It returns `true` if at least one more element is available, and `false` if the end of the collection has been reached.

3. `remove()`: The `remove` method allows you to delete the last element that was returned by the `next` method. It provides a way to modify the underlying collection during iteration.

## Accessing Collection Contents

The methods provided by the `Iterator` interface offer access to the contents of the collection being iterated. `next()` retrieves the current element, `hasNext()` checks for additional elements, and `remove()` enables modifications to the collection.

## Position Tracking

An `Iterator` object keeps track of its position within the collection. As you call the `next()` method, the iterator advances to the next element, allowing you to traverse the collection sequentially.

## Using Elements

When using an iterator, you can:

- Iterate through the collection one element at a time using the `next()` method.
- Process or use each element after calling `next()`.
- Optionally, remove elements from the underlying collection using the `remove()` method, if necessary.

Iterators are a standard way to navigate through elements in various collection types and provide a consistent and uniform approach to working with collections in Java.

---
 
                package java.util;

                public interface Collection<E> extends Iterable<E> {
                    int size();
                    boolean isEmpty();
                    boolean contains(Object o);
                    boolean add(E e);
                    boolean remove(Object o);
                    boolean equals(Object o);
                    // ... other methods
                }


The Collection interface in Java defines fundamental methods that are essential for working with collections. It inherits these methods from the Iterable interface, which allows objects of implementing classes to be used in enhanced for loops. Here's a snippet of the Collection interface source code:

java
Copy code
package java.util;

public interface Collection<E> extends Iterable<E> {
    int size();
    boolean isEmpty();
    boolean contains(Object o);
    boolean add(E e);
    boolean remove(Object o);
    boolean equals(Object o);
    // ... other methods
}
## Fundamental Methods

1. `size()`: Returns the number of elements in the collection.

2. `isEmpty()`: Checks whether the collection is empty (contains no elements) and returns a boolean value.

3. `contains(Object o)`: Determines if the collection contains the specified element `o` and returns `true` if the element is found, or `false` otherwise.

4. `add(E e)`: Adds an element of type `E` to the collection and returns `true` if the operation was successful, or `false` if the collection could not be modified.

5. `remove(Object o)`: Removes an occurrence of the specified element `o` from the collection and returns `true` if an element was removed, or `false` if the element was not found.

6. `equals(Object o)`: Checks if the collection is equal to another object `o` and returns `true` if they are equal, or `false` otherwise.

The `Collection` interface serves as the foundation for various collection types in Java, including lists, sets, and queues. It provides a common set of methods that are essential for basic collection manipulation and offers a consistent way to work with collections of elements. These methods are the building blocks for more complex collection operations and are inherited from the `Iterable` interface to allow for iteration over collection elements using enhanced for loops.

---