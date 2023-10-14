## 1. What is Generic Programming in Java?

Generic programming is a way to write code that works with different data types without sacrificing type safety. It allows you to create classes, interfaces, and methods that can operate on a variety of data types, making your code more flexible and reusable.
Generics in Java are implemented using type parameters, denoted by angle brackets <T>, where T can represent any data type. These type parameters are replaced with specific types at compile-time.

## 2. Why Use Generic Programming?

### Type Safety: Generics help catch type-related errors at compile-time rather than runtime. This ensures that you only work with compatible data types, reducing the likelihood of bugs.
### Code Reusability: With generics, you can write code that works with multiple data types, promoting code reusability and reducing redundancy.
### Improved Readability: Generic code is often more readable and self-explanatory because it abstracts the data type, making the code more versatile.

## 3. eg:
      public class Box<T> {
          private T value;
          
          public T getValue() {
              return value;
          }
          
          public void setValue(T value) {
              this.value = value;
          }
      }

      public <T> T findMax(T[] array) {
        T max = array[0];
        for (T element : array) {
            if (element.compareTo(max) > 0) {
                max = element;
            }
        }
        return max;
    }
#### Wildcard Generics: You can use wildcard generics to work with unknown types. For example: 
      public void printList(List<?> list) {
          for (Object item : list) {
              System.out.println(item);
          }
      }

## 4. What Not to Do in Generic Programming:

- Avoid Using Raw Types: Raw types (e.g., List instead of List<T>) should be avoided, as they compromise type safety. Always use parameterized types.
- Avoid Type Casts: Try to minimize type casts (e.g., (T) someObject) within generic code, as they can lead to runtime errors if used incorrectly.
- Avoid Overloading with Generics: Be cautious when overloading methods with generic and non-generic versions, as it can lead to confusion and unintended behavior.
- Don't Ignore Warnings: Pay attention to compiler warnings related to generics, as they often highlight potential issues in your code.

### using a non-generic ArrayList to store objects of different types and then relies on explicit type casting when retrieving objects. has several issues and drawbacks:
Problems we face:
o Mandatory type casting while
getting the object from list
o No error checking while
adding objects as we are
allowed to add any type of
objects
 Wrong type casting can land
you with runtime errors

1. Mandatory Type Casting: As you've mentioned, you need to perform explicit type casting when retrieving objects from the list. This can lead to runtime errors if the casting is done incorrectly, as there's no compile-time type checking.

2. No Error Checking: This approach allows you to add objects of any type to the list, which can result in runtime errors or unexpected behavior if you add the wrong type of object.

3. Lack of Type Safety: The code lacks type safety, as there's no way to ensure that the objects added to the list are of the expected type.

            import java.util.ArrayList;
            public class MyGenericList<T> {
                private ArrayList<T> myList;
            
                public MyGenericList() {
                    myList = new ArrayList<>();
                }
            
                public void add(T item) {
                    myList.add(item);
                }
            
                public T get(int i) {
                    return myList.get(i);
                }
            
                public static void main(String[] args) {
                    MyGenericList<String> generic = new MyGenericList<>();
                    generic.add("hello");
                    // generic.add(10); // Compile-time error: incompatible types
                    // generic.add(10.23f); // Compile-time error: incompatible types
            
                    String str = generic.get(0); // No casting needed, type-safe
                    // String str = generic.get(1); // Compile-time error: incompatible types
                }
            }

- Using generic programming we
don’t have to implement different
classes for different object types
- Programmer friendly code!
- We just have to create different
instances of MyGenericList for
different objects

            import java.util.ArrayList;
            public class MyGenericList<T> {
                private ArrayList<T> myList;
            
                public MyGenericList() {
                    myList = new ArrayList<>();
                }
            
                public void add(T item) {
                    myList.add(item);
                }
            
                public T get(int i) {
                    return myList.get(i);
                }
            
                public static void main(String[] args) {
                    MyGenericList<String> strList = new MyGenericList<>();
                    MyGenericList<Integer> intList = new MyGenericList<>();
            
                    strList.add("hello");
                    intList.add(1);
            
                    String str = strList.get(0); // No casting needed, type-safe
                    Integer num = intList.get(0); // No casting needed, type-safe
                }
            }

- eg:
  
                  public class Pair<T1, T2> {
                      private T1 key;
                      private T2 value;
                  
                      public Pair(T1 _k, T2 _v) {
                          key = _k;
                          value = _v;
                      }
                  
                      public T1 getKey() {
                          return key;
                      }
                  
                      public T2 getValue() {
                          return value;
                      }
                  }
                  
                  public class Main {
                      public static void main(String[] args) {
                          MyGenericList<Pair<String, Integer>> db = new MyGenericList<>();
                          db.add(new Pair<String, Integer>("John", 2343));
                          db.add(new Pair<String, Integer>("Susan", 8908));
                          // ...
                  
                          // Example: Retrieving a Pair from the list
                          Pair<String, Integer> johnPair = db.get(0);
                          String johnName = johnPair.getKey();
                          Integer johnValue = johnPair.getValue();
                      }
                  }
- Adv:
### Writing Code for Reusability:

- Generic programming allows you to write code that can be reused for objects of many different types. This is achieved by parameterizing your classes, methods, or interfaces with type parameters (e.g., <T>), which can represent various data types.
- Instead of writing separate code for different data types (e.g., String and Integer), you create a single generic implementation that works with any data type.
### Programmer-Friendly Code:
- Generic programming is programmer-friendly because it simplifies code and enhances its readability.
- Programmers don't need to duplicate code for similar functionality with different data types, reducing redundancy.
- Compile-time type checking ensures that type-related errors are caught early, reducing the likelihood of runtime errors and making code more reliable.

### Code Maintainability:
- Generic code tends to be more maintainable because changes or improvements made to the generic implementation benefit all data types that use it.
- It reduces the need to maintain multiple, similar codebases for different data types.
