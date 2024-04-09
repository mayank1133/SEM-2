// Write a program that illustrates interface inheritance. Interface 
// A is extended by A1 and A2. Interface A12 inherits from both P1 
// and P2.Each interface declares one constant and one method. Class 
// B implements A12.Instantiate B and invoke each of its methods. 
// Each method displays one of the constants 
/**
 * LAB_7_2
 */
/**
 * LAB_7_2
 */
interface A {

    int a=10;
    void printa();
}
/**
 * LAB_7_2
 */
interface A1 extends A {

    int b=20;
    void printb();
}
/**
 * LAB_7_2
 */
interface A2 extends A {

    int c=30;
    void printc();
}
/**
 * LAB_7_2
 */
interface A12 extends A1,A2 {

    int d=40;
    void printd();
}
class B implements A12{
    public void printa(){
        System.out.println(a);
    }
    public void printb(){
        System.out.println(b);
    }
    public void printc(){
        System.out.println(c);
    }
    public void printd(){
        System.out.println(d);
    }

} 
public class LAB_7_2 {

    public static void main(String[] args) {
        B prnt=new B();
        prnt.printa();
        prnt.printb();
        prnt.printc();
        prnt.printd();
    }
}