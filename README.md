# Team DragonFruit

Rohan Ahammed, Kaitlin Wan, Jessica Wu

Lab #2


## To-Do List
1. ~~Configure all GitHub repos~~

1. ~~Create interface Deque~~

1. ~~Prioritize methods in Deque ~~
   * ~~Methods:~~
    * ~~isEmpty()~~
    * ~~size()~~
    * ~~accessors:~~
      * ~~peekFirst()~~
      * ~~peekLast()~~
    * ~~add methods:~~
      * ~~addFirst()~~
      * ~~addLast()~~
    * ~~remove methods:~~
      * ~~removeFirst()~~
      * ~~removeLast()~~

1. ~~Set up inner-container in and the implementing class itself~~
1. ~~Start implementing these methods one by one and testing.~~
1. ~~Check API to see if there are other specifications that need to be followed~~
1. ~~Throw Exceptions~~

## Development Plan

We are going to be implementing doubly-linked nodes because using doubly-linked nodes lets us enqueue/dequeue in constant time, as well as allowing us to have pointers to the front and end, which will be useful in adding and removing from the different ends of this variation of a Queue. We are using doubly linked nodes because we can remove at the end in constant time but you cannot do that with singly-linked nodes. 

We are going to follow our prioritized list in implementing these methods into a class that implements Deque, and then make sure we adhere to the API specifications.

We decided to start with isEmpty() and size() first because these methods are the simplest to implement, and will not take more than 1 line of code each. Next, we put the accessor methods the next to be implemented because these, again, are very simple to implement. Next, we are doing peek methods because they are very similar to the previously defined accessor methods. Next, we're doing the add methods, and after that the remove methods because adding should be easier to work out than removing.

## Method Detail

* boolean isEmpty()

Checks if this Deque is empty or not. Returns true if nothing is in Deque, false if something was added Deque

* int size()

returns the total number of elements added to this 

* T peekFirst()

Returns the first element of the Deque. Returns null if empty. Does not remove the first element

* T peekLast()

Returns the last element of the Deque. Returns null if empty. Does not remove the last element

* void addFirst(T value)

Inserts the specified element at the front of this deque. Throws an exception if value is null

* void addLast(T value)

Inserts the specified element at the end of this deque. Throws an exception if value is null

* T removeFirst()

Retrieves and removes the first element of this deque. Throws an exception if empty

* T removeLast()

Retrieves and removes the last element of this deque. Throws an exception if empty

## Changes After Review
- Fixed white spacing, made sure it was consistent.
- Included method detail in Deque.java and Kings.java
- Included exceptions to prevent user from adding null to a Deque
- Updated and reformatted README.md
- Changed variable names in King.java to be more helpful in figuring out their purpose


