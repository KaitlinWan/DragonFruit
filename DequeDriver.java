public class DequeDriver{
    public static void main(String[]args){
	Kings <String> T = new Kings<String>();
	System.out.println("Is the deque empty? " + T.isEmpty()); //Expecting true;
	System.out.println("Size: " + T.size());//Expecting 0
	System.out.println("--------END-------");
	T.addFirst("bob");
	System.out.println("bob");
	T.addFirst("tom");
	System.out.println("tom");
	T.addFirst("jerry");
	System.out.println("jerry");
	System.out.println("-------Front-------");
	System.out.println("Size: " + T.size());//Expecting 3
	System.out.println("Checking First: " + T.peekFirst());
	System.out.println("Checking Last: " + T.peekLast());
	System.out.println("First occurence of bob was removed");
	System.out.println("Size: " + T.size());//Size should be 2
	System.out.println("Checking Last: " + T.peekLast());//Expecting tom
	T.addLast("timmy");
	System.out.println("timmy was added to the end of the deque");
	System.out.println("Checking Last: " +  T.peekLast());//Expecting timmy
	System.out.println("Removed: " + T.removeFirst());//Expecting jerry
	System.out.println("First element in deque was removed");
	System.out.println("Removed: " + T.removeLast());//Expecting timmy
	System.out.println("Last element was removed");
	System.out.println(T.size());//Expecting 2
    }
}
