# Team DragonFruit

Rohan Ahammed, Kaitlin Wan, Jessica Wu

Lab #2


## To-Do List
1. ~~Configure all GitHub repos~~

1. ~~Create interface Deque~~

1. ~~Prioritze methods in Deque ~~
    ~~* Methods:
      * isEmpty()
      * size()
    * accessors:~~
      * peekFirst()
      * peekLast()
   ~~* add methods:~~
      * addFirst()
      * addLast()
    ~~* remove methods:~~
      * removeFirst()
      * removeLast()

1. ~~Set up inner-container in and the implementing class itself~~
1. Start implementing these methods one by one and testing.
1. Check API to see if there are other specifications that need to be followed
1. Throw Exceptions

## Development Plan

We are going to be implementing doubly-linked nodes because using doubly-linked nodes lets us enqueue/dequeue in constant time, as well as allowing us to have pointers to the front and end, which will be useful in adding and removing from the different ends of this variation of a Queue. We are using doubly linked nodes because we can remove at the end in constant time but you cannot do that with singly-linked nodes. 

We are going to follow our prioritized list in implementing these methods into a class that implements Deque, and then make sure we adhere to the API specifications.

We decided to start with isEmpty() and size() first because these methods are the simplest to implement, and will not take more than 1 line of code each. Next, we put the accessor methods the next to be implemented because these, again, are very simple to implement. Next, we are doing peek methods because they are very similar to the previously defined accessor methods. Next, we're doing the add methods, and after that the remove methods because adding should be easier to work out than removing.
