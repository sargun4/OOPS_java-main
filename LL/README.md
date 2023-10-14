# LinkedList in Java

## Constructors

- `LinkedList()`: Creates an empty LinkedList.

- `LinkedList(Collection c)`: Constructs a list containing the elements of the specified collection, in the order they are returned by the collection's iterator.

## LinkedList Methods

- **ListIterator Knows About Position:** LinkedList's list iterator (`ListIterator`) allows you to work with positions in the list. You can use the following methods:
  - `add()`: Add an element at a specified position (typically at the end/tail of the list).
  - `remove()`: Remove an element at a specified position (typically at the head of the list).

- **Other Methods:**
  - `void addFirst(Object o)`, `void addLast(Object o)`: Add an element to the beginning or end of the list.
  - `Object getFirst()`, `Object getLast()`: Retrieve the first or last element in the list.
  - `Object removeFirst()`, `Object removeLast()`: Remove and return the first or last element in the list.

## Example: LinkedList

```java
import java.util.*;

public class Book {
    private String name;
    private int pages;

    public Book(int pages, String name) {
        // Constructor code...
    }

    @Override
    public String toString() {
        // toString code...
    }

    public static void main(String[] args) {
        List<Book> list = new LinkedList<Book>();
        list.add(new Book(100, "ABC"));
        list.add(new Book(200, "DEF"));
        list.add(new Book(300, "GHI"));
        
        for (Book b : list) {
            System.out.println(b);
        }
    }
}
