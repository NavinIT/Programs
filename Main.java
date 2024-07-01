import java.util.*;
//Understanding constructor use
class Student{
    int roll;
    String name;
    int marks[]=new int[3];
	Student(int r,String n,int m,int m1,int m2){
		roll=r;
		name=n;
        marks[0]=m;
        marks[1]=m1;
        marks[2]=m2;
	}
	
	int MarksTotal() {
		int Total;
		Total=marks[0]+marks[1]+marks[2];
        return Total;
	}
}
public class Main
{
	public static void main(String[] args) {
		int s1,s2,s3;
		Student Stu1=new Student(1,"Navin",50,50,50);
		Student Stu2=new Student(2,"Ram",60,60,60);
		Student Stu3=new Student(3,"Kumar",70,70,70);
		s1=Stu1.MarksTotal();
		s2=Stu2.MarksTotal();
		s3=Stu3.MarksTotal();
		System.out.println("Student 1 roll no: "+Stu1.roll);
		System.out.println("Student 1 name: "+Stu1.name);
		System.out.println("Student 1 total marks: "+s1);
		System.out.println("Student 2 roll no: "+Stu2.roll);
		System.out.println("Student 2 name: "+Stu2.name);
		System.out.println("Student 2 total marks: "+s2);
		System.out.println("Student 3 roll no: "+Stu3.roll);
		System.out.println("Student 3 name: "+Stu3.name);
		System.out.println("Student 3 total marks: "+s3);
	}
}