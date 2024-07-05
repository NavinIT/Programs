import java.util.*;
//printing number upto 99 except which is divisible by 4 and 6 by using continue
class Number{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int n=0;
        while(n<100){
            n++;
            if(n%4==0 || n%6==0){
                continue;
            }
            System.out.print(n+" ");
        }
    }

}