import CITS2200.Overflow;
import CITS2200.Underflow;

public class StackBlock implements CITS2200.Stack{
	
	private Object[] buffer;
	private int count;
	
	public StackBlock(int s){
		buffer = new Object[s];
		count=0;
	}
	
	public void push(Object o) throws Overflow {
		if(!isFull()) {
		buffer[count]=o;
		count++;
	}
		else {
			throw new Overflow("overflow");
		}
	}
	
	public Object pop() throws Underflow{
		if(!isEmpty()) {
		Object o = buffer[count-1];
		buffer[count-1]=null;
		count--;
		System.out.println("This is count:"+count);
		return o;
		}
		else {
			throw new Underflow("Underflow");
		}
	}
	
	public Object examine() throws Underflow{
		if(!isEmpty()) {
			return buffer[count-1];
		}
		else {
			throw new Underflow("underflow");
		}
	}
	
	public int size() {
		return count;
	}
	
	public int s() {
		return buffer.length;
	}
	
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		return false;
	}
	
	public boolean isFull(){
		if(buffer.length-count==0) {
				return true;
		}
		return false;
	}
	
	
}


