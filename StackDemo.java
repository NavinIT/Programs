package OOP;
import java.util.*;
//understanding stack;
public class StackDemo {
	public static void main(String args[]) {
		Stack stack=new Stack();
		stack.push('a');  
		stack.push('b');	
		stack.push('c');
		stack.push('d');	
		stack.push('e');	
		stack.push('f');	
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
