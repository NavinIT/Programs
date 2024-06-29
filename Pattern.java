import java.util.*;
//printing pattern
class Pattern{
    public static void main(String args[]){
        outer:
        for(int i=0;i<5;i++){
            inner:
            for(int j=0;j<5;j++){
                System.out.print("*");
                if(i==1 || j==2 ||i==3){
                    System.out.print("\n");
                    continue outer;
                }
             }
             
        }
    }

}