package stack_test;

import java.util.Stack;

public class queue {
	private Stack s1;
	private Stack s2;
	
	public queue(){
		s1 = new Stack();
		s2 = new Stack();
	}
	
	public void insert(Object o) {
		s1.push(o);
	}
	
	public Object take_out() {
		int n=s1.size();
		for(int i=0;i<n;i++) {
			s2.push(s1.pop());
		}
		
		Object o=s2.pop();
		int m=s2.size();
		for(int i=0;i<m;i++) {
			s1.push(s2.pop());
		}
		return o;
	}
}
