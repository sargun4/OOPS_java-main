# Sets in Java

Sets in Java are a part of the Java Collections Framework and are used to store unique elements, meaning there are no duplicate entries in a set. Two commonly used set implementations are HashSet and TreeSet.

## HashSet

- **HashSet\<E\>:** It keeps a set of elements in a hash table, and the elements are randomly ordered by their hash code.
- **Key Features:**
  - Find and add elements very quickly using hashing.
  - Hashing employs an array of linked lists. The `hashCode()` is used to index into the array, and `equals()` is used to determine if an element is in the list of elements at that index.
  - No specific order is imposed on elements in a HashSet.

## TreeSet

- **TreeSet\<E\>:** It keeps a set of elements in a red-black ordered search tree, and the elements are ordered incrementally.
- **Key Features:**
  - Elements can be inserted in any order, but TreeSet stores them in an ordered manner.
  - The default order is defined by the natural order. Objects must implement the `Comparable` interface, and TreeSet uses `compareTo(Object o)` to sort them.

## Set Interface

- The Set interface provides the same methods as the Collection interface, but it enforces a different contract - no duplicate entries are allowed.
- The Set interface offers an Iterator to step through the elements in the set. There is no guaranteed order in the basic Set interface.

## Example: TreeSet

```java
import java.util.*;

public class Book implements Comparable<Book> {
    private String name;
    private int pages;

    public Book(int pages, String name) {
        // Constructor code...
    }

    @Override
    public String toString() {
        // toString code...
    }

    public int compareTo(Book b) {
        if (this.pages > b.getPages()) return 1;
        else if (this.pages < b.getPages()) return -1;
        else return 0;
    }

    public static void main(String[] args) {
        Set<Book> set = new TreeSet<Book>();
        set.add(new Book(100, "ABC"));
        set.add(new Book(200, "DEF"));

        for (Book b : set) {
            System.out.println(b);
        }
    }
}
