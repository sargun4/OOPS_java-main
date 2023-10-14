- The Object class in Java is at the root of the inheritance hierarchy for all classes. Every class in Java implicitly inherits from the Object class, which means that you don't need to explicitly specify extends Object when defining a class.
### method                                description
- protected Object clone() = creates a copy of the object
- public boolean equals(Object o)= returns whether or not two objects are same
- protected void finalize()= called during garbage collection
- public Class<?> getClass()= info about the object's type
- public int hashCode()= a code suitable for putting this object into a hash collection
- public String toString()= text representation of the object
- public void notify() = methods related to concurrency andlocking (seen later)=
public void notifyAll()
public void wait()
public void wait(...)

- instanceof Keyword: 
  
          if (variable instanceof type)
          {
          statement;
          }
- Tests whether variable refers
to an object of class type (or
any subclass of type)

#### Rules of Equality for Any Two Objects
- Equality is reflexive:
o a.equals(a) is true for every object a

- Equality is symmetric:
o a.equals(b) ↔ b.equals(a)

- Equality is transitive:
o (a.equals(b) && b.equals(c)) ↔ a.equals(c)

- No non-null object is equal to null:
o a.equals(null) is false for every object a

### Comparator Interface
      public interface Comparator<T> {
      public int compare(T first, T second);
      }
- Interface Comparator is an external object that specifies:
a comparison function over some other type of objects.
o Allows you to define multiple orderings for the same type.
o Allows you to define a specific ordering for a type even if there is
no obvious "natural" ordering for that type

### super.clone():

-  Checks whether the class has implemented the Cloneable interface. Throws a
CloneNotSupportedException otherwise.
-  Creates a new instance of the class.
-  Performs a “shallow copy” of the fields in the class.

### Shallow vs. deep copy:
- shallow copy: Duplicates an object without duplicating any other objects to
which it refers.
- deep copy: Duplicates an object's entire reference graph: copies itself and
deep copies any other objects to which it refers.
