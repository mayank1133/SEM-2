import java.util.Scanner;
public class Max {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a;
        System.out.println("Enter a:");
        a=sc.nextInt();
        int b;
        System.out.println("enter b:");
        b=sc.nextInt();
        int c;
        System.out.println("enter c:");
        c=sc.nextInt();
        int temp;
        temp=a>b?a:b;
        int larg;
        larg=c>temp?c:temp;
        System.out.println(larg);
    }
}
