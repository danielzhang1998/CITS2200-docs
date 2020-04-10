package stack_testing;
import java.lang.Exception;

public class StackBlock {
	
	private Object[] buffer;
	private int count;
	
	public StackBlock(int s){
		buffer = new Object[s];
		count=0;
	}
	
	public void push(Object o) throws Overflow {
		try {
		buffer[count]=o;
		count++;
		}catch (Exception e) {
		}
	}
	
	public Object pop() {
		Object o = buffer[count-1];
		buffer[count-1]=null;
		count--;
		return o;
	}
	
	public Object examine() {
		Object o = buffer[count-1];
		return o;
	}
	
	public int size() {
		return count;
	}
	
	public int s() {
		return buffer.length;
	}
	
	public boolean isEmpty() {
		int check1=0;
		for(int i=0;i<buffer.length;i++) {
			if (buffer[i]==null) {
				check1++;
			}
			if(check1==buffer.length) {
				return true;
			}
		}
		return false;
	}
	
	public boolean isFull(){
		int check2=0;
		for(int i=0;i<buffer.length;i++) {
			if (buffer[i]==null) {
				check2++;
			}
			if(check2==buffer.length) {
				return false;
			}
		}
		return true;
	}
	
	
}

class Overflow extends Exception {  

	  public Overflow(String ErrorMessagr) { 
	      super(ErrorMessagr); 
	  } 
	}
