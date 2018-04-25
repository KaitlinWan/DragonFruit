/*****************************
 * DequeTester2 
 * by team Tetrash
 * Soojin Choi, Adrian Kloskowski, Woosuk Lee
 *****************************/
public class DequeTester2{
    
    public static void main(String[]args){
	Kings <String> tester = new Kings<String>();
	System.out.println("Is the deque empty? " + tester.isEmpty()); // true;
	System.out.println("Size: " + tester.size());// 0
	
	System.out.println("--------END-------");
	tester.addFirst("zeroth");
	System.out.println("zeroth");
	tester.addFirst("first");
	System.out.println("first");
	tester.addFirst("segundo");
	System.out.println("segundo");
	System.out.println("-------Front-------");
	
	System.out.println("Size: " + tester.size());// 3
	System.out.println("Checking First: " + tester.peekFirst());
	System.out.println("Checking Last: " + tester.peekLast());
	System.out.println("First occurence of zeroth was removed");
	
	System.out.println("Size: " + tester.size());//Size should be 2
	System.out.println("Checking Last: " + tester.peekLast());// first
	tester.addLast("timmy");
	System.out.println("timmy was added to the end of the deque");
	
	System.out.println("Checking Last: " +  tester.peekLast());// timmy
	System.out.println("Removed: " + tester.removeFirst());// segundo
	System.out.println("First element in deque was removed");
	System.out.println("Removed: " + tester.removeLast());// timmy
	System.out.println("Last element was removed");
	
	System.out.println(tester.size());// 2
    }
}
