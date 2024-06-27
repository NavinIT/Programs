import java.util.*;

class Oddnumbers{
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
    int n,j=1;
    System.out.print("Enter a Number : ");
    n=scanner.nextInt();
    System.out.print("Odd Numbers between "+j+" to "+n+" is :");
    for(int i=1;i<=n;i+=2){
        System.out.print(i+" ");
    }
    }
}