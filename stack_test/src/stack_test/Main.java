package stack_test;

import java.util.Stack;

public class Main {

	public static void main(String[] args) {
		queue dl = new queue();
		dl.insert("a");
		dl.insert("b");
		dl.insert("c");
		
		System.out.println(dl.take_out());
		dl.insert("d");
		dl.insert("e");
		System.out.println(dl.take_out());
		System.out.println(dl.take_out());
		}

}
