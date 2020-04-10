package DequeCyclic;

import CITS2200.Overflow;
import CITS2200.Underflow;

public class DequeCyclic implements CITS2200.Deque  {

	private Object[] buffer;
	private int count;
	
	
	public DequeCyclic(int i) {
		// TODO Auto-generated constructor stub
		buffer = new Object[i];
		count=0;
	}

	@Override
	public boolean isEmpty() {
		// TODO Auto-generated method stub
		if(count==0) {
			return true;
		}
		return false;
	}

	@Override
	public boolean isFull() {
		// TODO Auto-generated method stub
		if(buffer.length-count==0) {
			return true;
	}
	return false;
	}

	@Override
	public Object peekLeft() throws Underflow {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			return buffer[0];
		}
		else {
			throw new Underflow("underflow");
		}
	}

	@Override
	public Object peekRight() throws Underflow {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			return buffer[count-1];
		}
		else {
			throw new Underflow("underflow");
		}
	}

	@Override
	public Object popLeft() throws Underflow {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			Object o = buffer[0];
			buffer[0]=null;
			for(int i=0; i<count-1;i++) {
				buffer[i]=buffer[i+1];
			}
			count--;
			return o;
		}
		else {
			throw new Underflow("underflow");
		}
	}

	@Override
	public Object popRight() throws Underflow {
		// TODO Auto-generated method stub
		if(!isEmpty()) {
			Object o=buffer[count-1];
			buffer[count-1]=null;
			count--;
			return o;
		}
		else {
			throw new Underflow("underflow");
		}
	}

	@Override
	public void pushLeft(Object arg0) throws Overflow {
		// TODO Auto-generated method stub
		if(!isFull()) {
			if(count==0) {
		buffer[count]=arg0;
		count++;
		}else {
			for(int i=count;i>0;i--) {
				buffer[i]=buffer[i-1];
			}
			buffer[0]=arg0;
			count++;
		}
		}
		else {
			throw new Overflow("overflow");
		}
	}

	@Override
	public void pushRight(Object arg0) throws Overflow {
		// TODO Auto-generated method stub
		if(!isFull()) {
			if(count==0) {
		buffer[count]=arg0;
		count++;

		}else {
			buffer[count]=arg0;
			count++;
		}
		}
		else {
			throw new Overflow("overflow");
		}
	}


}
