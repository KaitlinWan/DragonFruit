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

    //methods specified in Deque API
    public int size(){
	return _size;
	//O(1)
    }
    
    public boolean isEmpty(){
	return _size == 0;
	//can also be done _front == null && _end == null;
	//O(1)
    }

    public T peekFirst(){
	return _front.getCargo();
	//O(1)
    }
    
    public T peekLast(){
	return _end.getCargo();
	//O(1)
    }

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
