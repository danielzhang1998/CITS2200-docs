package queue_new;

public class queue{
	private int count;
	private Object[] buffer;

	
	public queue(int s){
		buffer = new Object[s];
		count = 0;

	}
	public void push(Object o) {
		if(!isFull()) {
			buffer[count]=o;
			count++;
			System.out.println("This is count:"+count);
		}
	}
	public Object pop() {
		if(!isEmpty()) {
			Object o= buffer[0];
			buffer[0]= null;
			count--;
			for(int i=0;i<buffer.length-1;i++) {
				buffer[i]=buffer[i+1];
			}
			System.out.println("This is count:"+count);
			return o;
		}
		return 0;
	}
	
	public Object examine() {
		if(!isEmpty()) {
			Object o= buffer[0];
			return o;
		}
		return 0;
	}
	
	public boolean isFull() {
		if(count==buffer.length) {
			return true;
		}
		return false;
	}
	
	public boolean isEmpty() {
		if(count==0) {
			return true;
		}
		return false;
	}
}