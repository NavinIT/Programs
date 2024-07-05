import java.util.*;
import java.lang.*;
class Prime{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("Enter a Number :");
        n=scanner.nextInt();
       if(n%2==0 || n%3==0 || n/1==1){
            System.out.print("Given Number is not a prime number :");    
        }
        else
            System.out.print("Given Number is  a prime number:");
    }

}