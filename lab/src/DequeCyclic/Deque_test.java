package DequeCyclic;

public class Deque_test {
	public static void main(String[] args) {
		DequeCyclic Deque = new DequeCyclic(10);
		
		System.out.println(Deque.isEmpty());
		
		System.out.println("   mark1   ");
		
		System.out.println(Deque.isFull());
		
		System.out.println("   mark2   ");
		
		Deque.pushRight("h");
		Deque.pushLeft("a");
		Deque.pushLeft("b");
		Deque.pushRight("p");
		Deque.pushLeft("c");
		Deque.pushLeft("d");
		Deque.pushRight("g");
		Deque.pushRight("x");
		System.out.println(Deque.popLeft());
		//System.out.println(Deque.popRight());
		//System.out.println(Deque.popRight());
		
		System.out.println(Deque.isEmpty());
		
		System.out.println("   mark3   ");
		
		System.out.println(Deque.isFull());
		
		System.out.println("   mark4   ");
		
		System.out.println(Deque.peekLeft());
		
		System.out.println(Deque.peekRight());
		
	}
}
