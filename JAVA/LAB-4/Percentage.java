
import java.util.Scanner;
public class Percentage {
    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Subject 1");
        int s1 = sc.nextInt();
        System.out.println("Subject 2");
        int s2 = sc.nextInt();
        System.out.println("Subject 3");
        int s3 = sc.nextInt();
        System.out.println("Subject 4");
        int s4 = sc.nextInt();
        System.out.println("Subject 5");
        int s5 = sc.nextInt();

        double p = (s1+s2+s3+s4+s5)/5;
        System.out.println("Percentage : " + p );
        
        if(p>=60) {
            System.out.println("First Division");

        }
        else if(p>=50 && p<59) {
            System.out.println("Second Division");
        }
        else if(p>=40 && p<49) {
            System.out.println("Third Division");
        }
        else if(p<40) {
            System.out.println("FAIL ");
        }
        

    }
}
