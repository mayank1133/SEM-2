import java.util.Scanner;
public class Uprcse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String st=sc.next();
        if(!Character.isUpperCase(st.charAt(0)))
        {
            System.out.println("The Entered String is does not start with Upper Case si it is Terminated.....");
        }
        else
        {
            System.out.println("Processing......");
        }

    }
}