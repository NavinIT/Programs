import java.util.*;
//getting input from user and display as pyramid structure
class Excersise1{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        int U_I;
        System.out.print("Enter any single digit Number :");
        U_I=scanner.nextInt();
        System.out.println("   "+U_I+"   ");
        System.out.println("  "+U_I+""+U_I+""+U_I+"  ");
        System.out.println(" "+U_I+""+U_I+""+U_I+""+U_I+""+U_I+" ");
        System.out.println(U_I+""+U_I+""+U_I+""+U_I+""+U_I+""+U_I+""+U_I);
    }
} 