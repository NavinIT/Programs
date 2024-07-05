import java.util.*;
import java.lang.*;
import java.io.*;

class Amount{

public static void main (String args[]){

Scanner in=new Scanner(System.in);

double R;
double P;
double Rupees;
System.out.print("Enter Price Value : ");

Rupees=in.nextFloat();
R=Math.floor(Rupees);

P=Rupees-R;
int R1= (int)R;

System.out.print("The Price Value Is "+R1+" Rupees and "+P+" Paise only");
}
}

// Displaying different datatypes using scanner
class Excersise{
    public static void main(String args[]){
        Scanner in=new Scanner(System.in);
        System.out.print("Enter a byte value: ");        
        byte b=in.nextByte();
        System.out.println(b);        
        System.out.print("Enter a short value: ");        
        short S=in.nextShort();
        System.out.println(S);        
        System.out.print("Enter a float value: ");   
        Float F=in.nextFloat();
        System.out.println(F);        
        System.out.print("Enter a long value: ");             
        Long L=in.nextLong();
        System.out.println(L);             
        System.out.print("Enter any character: ");
        char c=in.next().charAt(0);
        System.out.println( c);
        System.out.print("Enter a boolean value: ");                
        boolean bo=in.nextBoolean();
        System.out.println(bo);        
        System.out.print("Enter any String: ");        
        String St=in.nextLine();
        in.nextLine();        
        System.out.print( St);        

//getting input from user and display as pyramid structure (25.06.2024)
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


