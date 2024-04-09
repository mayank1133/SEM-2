import java.util.Scanner;
public class Calculator {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num1;
        System.out.println("Enter 1st Number");
        num1=sc.nextInt();
        int num2;
        System.out.println("Enter 2nd Number:");
        num2=sc.nextInt();
        char op=sc.next().charAt(0);
        System.out.println("Enter Operation to Peform:");
        double ans;
        switch (op) {
            case '+':
                ans=num1+num2;
                System.out.println(ans);
                break;
            case '-':
                ans=num1-num2;
                System.out.println(ans);
                break;
            case '*':
                ans=num1*num2;
                System.out.println(ans);
                break;
            case '/':
                ans=((double )num1/num2);
                System.out.println(ans);
                break;

        
            default:
                break;
        }
    }
}