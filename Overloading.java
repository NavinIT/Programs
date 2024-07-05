package Practice;
import java.util.*;
//finding average of 2 or 3 numbers understanding of overloading
public class Overloading {
	static int Average(int a,int b) {
		return (a+b)/2;
	}
	static int Average(int a,int b,int c) {
		return (a+b)/3;
	}

	public static void main(String args[]) {
		Scanner input=new Scanner(System.in);
		int a,b,c;
		System.out.println("Enter a  mark1 : ");
		
		a=input.nextInt();
		
		System.out.println("Enter a mark2: ");
		
		b=input.nextInt();
		
		System.out.println("Enter a mark3: ");
		
		c=input.nextInt();
		System.out.println("Average="+Average(a,b));
		System.out.println("Average="+Average(a,b,c));
	}

}
