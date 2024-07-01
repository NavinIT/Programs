import java.util.*;
//understanding of class, object and methods
class Student{
    int roll;
    int marks[][]=new int[3][3];
    String name;
    
    int MarksTotal(int n){
        int total=0;
        for(int i=0;i<3;i++){
            if(i==n){
            for(int j=0;j<3;j++){
               total+=marks[i][j];
                }
            }
        }
        return total;
    }
}
    
public class Students{
    public static void main(String args[]){
        int s,s1,s2;
        Scanner scanner=new Scanner(System.in);
    Student Stu=new Student();
            System.out.print("Enter Student 1 roll no:");
            Stu.roll=scanner.nextInt();
            System.out.print("Enter Student 1 name:");
            Stu.name=scanner.nextLine();
            scanner.nextLine();
            
            for(int i=0;i<1;i++){
                for(int j=0;j<3;j++){
                            System.out.print("Enter Student 1 marks:");
                            Stu.marks[i][j]=scanner.nextInt();
                            scanner.nextLine();
                }
            }
            
      Student Stu1=new Student();  
            System.out.print("Enter Student 2 roll no:");
            Stu1.roll=scanner.nextInt();
            System.out.print("Enter Student 2 name:");
            Stu1.name=scanner.nextLine();
            scanner.nextLine();
            
            for(int i=1;i<2;i++){
                for(int j=0;j<3;j++){
                            System.out.print("Enter Student 2 marks:");
                            Stu1.marks[i][j]=scanner.nextInt();
                            scanner.nextLine();
                }
            }
            
    Student Stu2=new Student();  
        System.out.print("Enter Student 3 roll no:");
            Stu2.roll=scanner.nextInt();
            System.out.print("Enter Student 3 name:");
            Stu2.name=scanner.nextLine();
            scanner.nextLine();
            for(int i=2;i<3;i++){
                for(int j=0;j<3;j++){
                        System.out.print("Enter Student 3 marks:");
                        Stu2.marks[i][j]=scanner.nextInt();
                        scanner.nextLine();
                    }
                }
            

        s=Stu.MarksTotal(0);
        System.out.println("Student 1 Total Marks :"+s);       
        s1=Stu1.MarksTotal(1);
        System.out.println("Student 2 Total Marks :"+s1);       
        s2=Stu2.MarksTotal(2);
        System.out.println("Student 3 Total Marks "+s2);       
    }
}
