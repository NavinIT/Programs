import java.util.*;

class Factorial{
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    int n,t=1,i;
    System.out.print("Enter a Number : ");
    n=scanner.nextInt();
        for(i=n;i>1;i--){
            if(i==n){
                t=i;
            }
            t=t*(i-1);
           }
     System.out.print("Factorial of "+n+ " is ");
           for(i=n;i>=1;i--){
            System.out.print(" "+i+" *");
           }
     System.out.print("="+t);
     
        }
    }