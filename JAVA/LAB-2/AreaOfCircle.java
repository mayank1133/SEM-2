import java.util.Scanner;
public class AreaOfCircle 
{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Radius:");
        double radius=sc.nextDouble();
        double Area=3.14*radius*radius;
        System.out.println(Area);
     }
}
