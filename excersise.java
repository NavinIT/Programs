import java.util.*;
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
    }
}




