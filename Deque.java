public interface Deque<T>{

    public boolean isEmpty();

    public int size();

    public T peekFirst();

    public T peekLast();

    public void addFirst(T value);

    public void addLast(T value);

    public T removeFirst();

    public T removeLast();




}//end of Deque
