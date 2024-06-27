import java.util.*;

class Naturalnumbers{
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    int n,i=0;
    System.out.print("Enter a Number : ");
    n=scanner.nextInt();
    if(n==0){
            System.out.print(n+" is not a natural number");
             }
        System.out.print("Natural Number upto "+n+" is :");
        while(i<n){
            i++;
            System.out.print(i+" ");            
        }
        }
    
    }