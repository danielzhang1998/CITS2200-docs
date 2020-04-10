package queue_new;

public class queue_test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		queue que=new queue(10);
		
		System.out.println(que.isFull());
		
		System.out.println("   Mark1");
		
		System.out.println(que.isEmpty());
		
		System.out.println("   Mark2");
		for(int i=0;i<10;i++) {
			que.push(i);
		}
		System.out.println(que.examine());
		System.out.println(que.pop());
		System.out.println("   Mark3");
		System.out.println(que.examine());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.isFull());
		que.push(10);
		que.push(11);
		que.push(12);
		System.out.println("   Mark4");
		
		System.out.println(que.isFull());
		
		System.out.println("   Mark5");
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.pop());
		System.out.println(que.isEmpty());
	}

}
