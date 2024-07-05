import java.util.*;
import java.lang.*;
//finding perfect square numbers nearest greater than n 
class PerfectSquare{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n;
        System.out.print("Enter a Number :");
        n=scanner.nextInt();
        
        while(true){
            n++;
            if(n/(Math.floor(Math.sqrt(n)))==(Math.floor(Math.sqrt(n)))){
                System.out.print(n+" is a nearest perfect square number");
                break;
            }
         
        }
    }
}