import java.util.Scanner;

 class Palindrome {
	static boolean isPalin=false;
	
	static boolean isPalindrome(int x) {
		String t=Integer.toString(x);
		String t1="";
		int t2=x;
		for(int i=t.length();i>0;i--) {
			t1+=t2%10;
			t2/=10;
		}
		int t3=Integer.parseInt(t1);
		   if(t3==x)   {
			   isPalin=true;
		   }
		   return isPalin;
		           }
        
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner keyboard=new Scanner(System.in);
		System.out.println("Enter a Number to check palindrome or not ");
		int n=keyboard.nextInt();
		if(n<0) {
			System.out.println(isPalin);
		}
		System.out.println(isPalindrome(n));
	}

}
