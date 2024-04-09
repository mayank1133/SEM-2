// The Transport interface declares a deliver () method. The abstract 
// class Animal is the super class of the Tiger, Camel, Deer and 
// Donkey classes. The Transport interface is implemented by the 
// Camel and Donkey classes. Write a test program that initialize an 
// array of four Animal objects. If the object implements the 
// Transport interface, the deliver () method is invoked. 
interface Transport {
    void delivery();
}
abstract class Animal {

}
class Tiger extends Animal{

}
class Camel extends animal implements Transport{
    public void deliver(){
        System.out.println("Camel Delivers");
    }
}
class Deer extends animal {
    
}
class Donkey extends animal implements Transport{
    public void deliver(){
        System.out.println("Donkey Delivers");
    }
}
public class LAB_7_3{   
    public static void main(String[] args) {
        Animal[] anmls={
            new Tiger();
            new Camel();
            new Donkey();
            Object foo = new Object();
            
        }
    }
