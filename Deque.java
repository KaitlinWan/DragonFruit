public interface Deque<T>{
    //interface Deque based on API

    //Checks if this Deque is empty or not.
    //Returns true if nothing is in Deque, false if something was added
    public boolean isEmpty();

    //returns the total number of elements added to this Deque
    public int size();

    //Returns the first element of the Deque. Returns null if empty.
    //Does not remove the first element
    public T peekFirst();

    //Returns the last element of the Deque. Returns null if empty.
    //Does not remove the last element
    public T peekLast();

    //Inserts the specified element at the front of this deque
    //Throws an exception if value is null
    public void addFirst(T value);

    //Inserts the specified element at the end of this deque
    //Throws an exception if value is null
    public void addLast(T value);

    //Retrieves and removes the first element of this deque.
    //Throws an exception if empty
    public T removeFirst();

    //Retrieves and removes the last element of this deque.
    //Throws an exception if empty
    public T removeLast();
    
}//end of interface Deque
