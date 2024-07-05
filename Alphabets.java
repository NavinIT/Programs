import java.util.*;
// printing vowels or consonants by using switch
class Alphabets{
public static void main(String args[]){
Scanner scanner=new Scanner(System.in);
char C;
System.out.print("Enter any character : ");
C=scanner.next().charAt(0);
switch(C){
default:
	System.out.print("Given character is consonant");
	break;
case 'a':
case 'e':
case 'i':
case 'o':
case 'u':
	System.out.print("Given character is vowel");
}
}
}
