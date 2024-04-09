import java.util.Scanner;
public class FartoC {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double fahren;
        System.out.println("Enter Temperature in Fahrenheit:");
        fahren=sc.nextDouble();
        double cel;
        cel=(fahren-32)*5/9;
        System.out.println(cel);    
    }
}
