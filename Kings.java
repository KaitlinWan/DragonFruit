public class Kings<T> implements Deque<T>{
    //instance vars
    DLLNode<T> _front, _end;
    int _size;

    //constructor
    public Kings(){
	_front = _end = null;
	_size = 0;
    }

    //methods specified in Deque API
    public int size(){
	return _size;
    }
    public boolean isEmpty(){
	return _size == 0;
	//can also be done _front == null && _end == null;
    }

    public T peekFirst(){
	return _front.getCargo();
    }
    public T peekLast(){
	return _end.getCargo();
    }

    public void addFirst(T value){
      DLLNode<T> cat = new DLLNode<>(value, null, null);
      if(isEmpty()){
        _front = cat;
        _end = _front;
      }
      else{
        cat.setNext(_front);
        _front = cat;
      }
      _size++;
    }

    public void addLast(T value){
      DLLNode<T> cat = new DLLNode<>(value, null, null);
      if(isEmpty()){
        _front = cat;
        _end = _front;
      }
      else{
        cat.setPrev(_end);
        _end = cat;
      }
      _size++;
    }

    public T removeFirst(){
      if(!isEmpty()){
        T retVal = _front.getCargo();
        _front = _front.getNext();
        _front.setPrev(null);
        _size--;
        return retVal;
      }
      return null;

    }

    public T removeLast(){
      if(!isEmpty()){
        T retVal = _end.getCargo();
        _end = _end.getPrev();
        _end.setNext(null);
        _size--;
        return retVal;
      }
      return null;
    }


    public static void main(String[] args){
    }//end of main method

}//end of class Kings
