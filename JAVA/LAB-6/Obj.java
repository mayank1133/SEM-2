/6863.*- public class Obj{
    static int objectCount=0;
    public void Counter(){
        objectCount++;
    }
    public static int getcount(){
        return objectCount;
    }

   public static void main(String[] args) {
        Obj a1=new Obj();
        Obj a2=new Obj();
        Obj a3=new Obj();
        a1.Counter();
        a2.Counter();
        a3.Counter();
        System.out.println("Total Object are:"+a2.getcount());
    }

 }
