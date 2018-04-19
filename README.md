# Team Dragon_Fruit

Rohan Ahammed, Kaitlin Wan, Jessica Wu

Lab #2


### To-Do List
1. Configure all GitHub repos
2. Create interface Deque
3. Prioritze methods in Deque

Methods:
- isEmpty()
- size()

accessors:
- getFirst();
- getLast();

add methods:
- addFirst()
- addLast()

- peekFirst()
- peekLast()

Done

### Development Plan

We are going to be implementing singly-linked nodes because using singly-linked nodes lets us enqueue/dequeue in constant time, as well as allowing us to have pointers to the front and end, which will be useful in adding and removing from the different ends of this variation of a Queue. We are not using doubly-linked nodes because we don't see any use for linkage in the other direction, and it is best to keep this as simple as possible when we first implement the Deque interface.
