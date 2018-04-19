public class Kings implements Deque{
    //instance vars
    LLNode<String> _front, _end;
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

    public String peekFirst(){
	return _front.getValue();
    }
    public String peekLast(){
	return _end.getValue();
    }

    public static void main(String[] args){
    }//end of main method
  
}//end of class Kings
