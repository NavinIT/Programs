package OOP;
import java.util.*;
class Stack {

			char C[]=new char[5];
			int tos;
			Stack() {
				tos=-1;
			}
			void push(char i) {
				
				if(tos<4)
					C[++tos]=i;
					
				else
					System.out.println("Stack is Full");	
				}
			char pop() {
				
				if(tos<=-1) {
					System.out.print("Stack is Empty");
					return 0;
				}
					 
				return C[tos--];
			}
}
