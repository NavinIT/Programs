import java.util.*;
// Finding volume and surface area of the box
class Box{
    int length,width,height;
    int volume(){
        return length*width*height;
}
int surfaceArea(){
    return (2*length*width)*(2*length*height)*(2*height*width);
    }
    
}
public class Classdemo{
    public static void main(String args[]){
        Scanner scanner=new Scanner(System.in);
        Box Blackbox=new Box();
        Blackbox.length=10;
        Blackbox.width=10;
        Blackbox.height=10;

        System.out.print("Volume of box: ");
            System.out.println(Blackbox.volume());
        System.out.print("Surface area of box: ");
            System.out.println(Blackbox.surfaceArea());
    }
}