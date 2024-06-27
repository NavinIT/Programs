import java.util.*;
import java.lang.*;
import java.io.*;
class Task{
    int i;
    int ID[]=new int[];
    String Title[]=new String[];
    String Description[]=new String[];
    String Priority[]=new String[];
    String Status[]=new String[];
    Task(int ID,String Title,String Description,String Priority,String Status){
        i=ID-1;
        this.ID[i]=ID;
        this.Title[i]=Title;
        this.Description[i]=Description;
        this.Priority[i]=Priority;
        this.Status[i]=Status;
       }
    void Display() {
        for(i=0;i<ID.length;i++) {
            System.out.println("Task ID : "+ID[i]+",Task Title : "+Title[i]+",Task Description : "+Description[i]+",Task Priority : "+Priority[i]+",Task Status : "Status[i]);
        }
           }   
}
class TaskManager extends Task{
int a,T_Id,Pr_count;
String Tt,Ds,Pr,St,Pr1="High",Pr2="Medium",Pr3="Low",St1="Pending",St2="In Progress",St3="Completed";f
boolean b,b1=false;
taskmanager(){
    System.out.println("1.Add Task");
    System.out.println("2.Edit Task");
    System.out.println("3.Delete Task");
    System.out.println("4.View Task");
    System.out.println("5.Filter Task By Priority");
    System.out.println("6.Exit");
}
static int Add_Task(int a){
    System.out.print("Enter Task Title : ");
    Tt=in.readLine();
    System.out.print("Enter Task Description : ");
    Ds=in.readLine();
    while(b==true){
    System.out.print("Enter Task Priority((High/Medium/Low) : ");
    Pr=in.readLine();
    b=(Pr.compareToIgnoreCase(Pr1)||Pr.compareToIgnoreCase(Pr2)||Pr.compareToIgnoreCase(Pr3));
    if(b==false)
    System.out.println("Invalid input Please enter High,Medium,Low ");
    }
    while(b1==true){
    System.out.print("Enter Task Status(Pending/In Progress/Completed) : ");
    St=in.readLine();
    b1=(St.compareToIgnoreCase(St1)||St.compareToIgnoreCase(St2)||St.compareToIgnoreCase(St3));
    if(b1==false)
    System.out.println("Invalid input Please enter any one of these(Pending,In Progress,Completed) ");
    }
    this.a=a;
     Task obj-=new Task(a,Tt,Ds,Pr,St);
     return 0;
}
static void Edit_Task(){
    Get_Task_By_Id();
    
    if(T_Id==ID){
    
        System.out.print("Edit New Title : (leave blank if want to keep existing)");
        Tt=in.readLine();
            if(Tt.isEmpty()){
                Tt=title;
                }
        System.out.print("Edit New Description : (leave blank if want to keep existing)");
        Ds=in.readLine();
            if(Ds.isEmpty()){
                Ds=Description;
            }
        System.out.print("Edit New Priority : (leave blank if want to keep existing)");
        Pr=in.readLine();
            if(Pr.isEmpty()){
                Pr=Priority;
                }
        System.out.print("Edit New Status : (leave blank if want to keep existing)");
        St=in.readLine();
            if(St.isEmpty()){
                St=Status;
                }
        }
    Task obj=new Task(Tt,Ds,Pr,St);
}
static void Delete_Task(){
        ID=null;
        Tt=null;
        Ds=null;
        Pr=null;
        St=null;

    }
    Task obj=new Task(ID,Tt,Ds,Pr,St);
    
}
static void View_All_Task(){
    Display();
}
static void Get_Task_By_Id(){
    System.out.print("Enter a Task ID to Edit : ");
    T_Id=int(in.readLine());
}
static void Filter_Task_By_Priority(){
    System.out.print("Enter Priority to Filter Task(High/Medium/Low) : ");
    Pr=in.readLine();
    if(Pr==Priority){
        Pr_count++
        Display();
    }
}
static void Exit(){
    System.exit(0);
}
}
class input{
public static void main(String args[]) throws IOException {
DataInputStream in=new DataInputStream(System.in);
String User_Input;
int count;
String U_I;
TaskManager Task_Manager=new TaskManager();
while(true){
System.out.print("Enter your choice (1-6) :");
User_Input=in.readLine();

U_I=if(User_Input==1 && User_Input<=6)?User_Input:"0";
switch(User_input){
    default:
        {
            System.out.print("Invalid Choice. Please enter a value between 1 to 6");
            break;
        }
    case '1':
        {
            count++;
            Task_manager.Add_Task(count);
            break loop;
        }
    case '2':
        {
            Task_manager.Edit_Task();
            break loop;
        }
    case '3':
        {
            Task_manager.Delete_Task();
            break loop;
        }
    case '4':
        {
            Task_manager.View_All_Task();
            break loop;
        }
    case '5':
        {
            Task_manager.Filter_Task_By_Priority();
            break loop;
        }
    case '6':
        {
            Task_manager.Exit();
            break loop;
        }

}
//if(User_Input==1 && User_Input<=6){
   // if(User_Input==1)
     //   {
       //     count++;
        //    Task_Manager.Add_Task(count);
        //}

//}
//else
//System.out.print("")
}
}
}