import java.util.Scanner;
class Complex_Num{
    int real;
    int imaginary;
    Complex_Num(int real,int imaginary){
        this.real=real;
        this.imaginary=imaginary;
    }
    void add(Complex_Num c1,Complex_Num c2){
        this.real=c1.real+c2.real;
        this.imaginary=c1.imaginary+c2.imaginary;
        System.out.println("Solution="+real+"+"+imaginary+"i");
    }
}
public class ComplexNo {

    public static void main(String[] args) {
        int x;
        int y;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Real and Imaginary value of equation:");
        x=sc.nextInt();
        y=sc.nextInt();
        Complex_Num c1=new Complex_Num(x, y);
        System.out.println("Enter Real and Imaginary value of equation:");
        x=sc.nextInt();
        y=sc.nextInt();
        Complex_Num c2=new Complex_Num(x, y);
        Complex_Num c3=new Complex_Num(0, 0);
        c3.add(c1, c2);
    }
}