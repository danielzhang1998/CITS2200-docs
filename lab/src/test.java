import CITS2200.Overflow;
import CITS2200.Underflow;

public class test {

	public static void main(String[] args) {
		StackBlock stack = new StackBlock(10);
		System.out.println(stack.isEmpty());
		
		System.out.println("   mark1   ");
		
		System.out.println(stack.isFull());
		
		System.out.println("   mark2   ");
		for(int i=0;i<10;i++) {
			if(stack.size()<stack.s()) {
				stack.push(i);
				}
			}
		System.out.println(stack.examine());
		System.out.println(stack.isFull());
		System.out.println("   mark3   ");
		
		System.out.println(stack.isEmpty());
		
		System.out.println("   mark4   ");
		while(stack.size()>0) {
			Integer value = (Integer)stack.pop();
			System.out.println("take out:"+value);
		}
	}

}
