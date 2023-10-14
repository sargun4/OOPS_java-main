# Maps in Java

Maps in Java are a part of the Java Collections Framework and are used to store unique key-value pairs. Two commonly used map implementations are HashMap and TreeMap.

## HashMap

- **HashMap\<K, V\>:** It keeps a map of elements in a hash table, and the elements are randomly ordered using their hash code.
- **Key Features:**
  - Provides fast key-based access to values.
  - The elements are stored in a hash table, which allows for efficient key-value lookups.
  - No specific order is imposed on elements in a HashMap.

## TreeMap

- **TreeMap\<K, V\>:** It keeps a map of elements in a red-black ordered search tree, and the elements are ordered incrementally by their keys.
- **Key Features:**
  - Elements can be inserted in any order, but TreeMap stores them in an ordered manner.
  - The default order is defined by the natural order of keys.

## Map Interface

- The Map interface stores unique key-value pairs and maps from the key to the value.
- Keys are unique, meaning a single key only appears once in the Map, and a key can map to only one value. However, values do not have to be unique.

## Example: HashMap

```java
import java.util.HashMap;
import java.util.Map;

public class Book {
    private String name;
    private int pages;

    public Book(int pages, String name) {
        this.pages = pages;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Book name: " + name + "; pages = " + pages;
    }

    public static void main(String[] args) {
        Map<Integer, Book> map = new HashMap<Integer, Book>();
        map.put(1, new Book(100, "ABC"));
        map.put(2, new Book(200, "DEF"));

        for (Map.Entry<Integer, Book> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
