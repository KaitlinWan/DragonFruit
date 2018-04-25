import java.util.*;;
public class Kings<T> implements Deque<T>{
    //instance vars
    DLLNode<T> _front, _end;
    //front is the head of the Deque, end is the tail
    int _size;
    
    //constructor
    public Kings(){
	_front = _end = null;
	_size = 0;
    }

    //methods as specified in Deque API

    //returns the total number of elements added to this Deque
    public int size(){
	return _size;
	//O(1)
    }

    //Checks if this Deque is empty or not.
    //Returns true if nothing is in Deque, false if something was added
    public boolean isEmpty(){
	return _size == 0;
	//can also be done _front == null && _end == null;
	//O(1)
    }

    //Returns the first element of the Deque. Returns null if empty.
    //Does not remove the first element
    public T peekFirst(){
	return _front.getCargo();
	//O(1)
    }

    //Returns the last element of the Deque. Returns null if empty.
    //Does not remove the last element
    public T peekLast(){
	return _end.getCargo();
	//O(1)
    }

    //Inserts the specified element at the front of this deque
    //Throws an exception if value is null
    public void addFirst(T value){
	if (value == null){
	    throw new NullPointerException();
	}
	DLLNode<T> newNode = new DLLNode<>(value, null, null);
	if(isEmpty()){
	    _front = newNode;
	    _end = _front;
	}
	else{
	    newNode.setNext(_front);
	    _front = newNode;
	}
	_size++;
      	//O(1)
    }
    
    //Inserts the specified element at the end of this deque
    //Throws an exception if value is null
    public void addLast(T value){
	if (value == null){
	    throw new NullPointerException();
	}	
	DLLNode<T> newNode = new DLLNode<>(value, null, null);
	if(isEmpty()){
	    _front = newNode;
	    _end = _front;
	}
	else{
	    _end.setNext(newNode);
	    newNode.setPrev(_end);
	    _end = newNode;
	}
	_size++;
      	//O(1)
    }

    //Retrieves and removes the first element of this deque.
    //Throws an exception if empty
    public T removeFirst(){
	if(!isEmpty()){
	    T retVal = _front.getCargo();
	    _front = _front.getNext();
	    _front.setPrev(null);
	    _size--;
	    return retVal;
	}
	throw new NoSuchElementException();
      	//O(1)
    }
    
    //Retrieves and removes the last element of this deque.
    //Throws an exception if empty
    public T removeLast(){
	if(!isEmpty()){
	    T retVal = _end.getCargo();
	    _end = _end.getPrev();
	    _end.setNext(null);
	    _size--;
	    return retVal;
	}
        throw new NoSuchElementException();
      	//O(1)
    }

    //Deque's toString. Useful to represent and be able to print Deques
    public String toString(){
	String retString = "";
	DLLNode<T> temp = _front;
	while(temp != null){
	    retString += temp + " ";
	    temp = temp.getNext();
	}
	return retString;
    }

    public static void main(String[] args){
	Kings<String> rohan = new Kings<>();
	
	rohan.addFirst("cat");
	rohan.addFirst("dog");
	rohan.addLast("duck");
	rohan.addLast("cow");

	System.out.println("current Deque: " + rohan);

	System.out.println("remove first (dog): " + rohan.removeFirst());
	
	System.out.println("remove last (cow): " +rohan.removeLast());

    }//end of main method

}//end of class Kings
