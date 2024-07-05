import java.util.*;
// Printing  weekdays by using switch
class Weekdays{
public static void main(String args[]){
Scanner scanner=new Scanner(System.in);
int Num;
System.out.print("Enter the weekday Number :");
Num=scanner.nextInt();
switch(Num){
case 1:
System.out.print("Weekday 1: Monday");
break;
case 2:
System.out.print("Weekday 2: Tuesday");
break;
case 3:
System.out.print("Weekday 3: Wednesday");
break;
case 4:
System.out.print("Weekday 4: Thursday");
break;
case 5:
System.out.print("Weekday 5: Friday");
break;
case 6:
System.out.print("Weekday 6: Saturday");
break;
case 7:
System.out.print("Weekday 7: Sunday");
break;
default:
System.out.print("Enter a number between 1 to 7 ");
}
}
}