public class Double {
    public static void main(String[] args) {
       System.out.println("CGPA:"+args[0]);
       System.out.println("SCPA:"+args[1]); 
       double a=Double.parseDouble(args[0]);
       double b=Double.parseDouble(args[1]);
       System.out.println(a*b);
    }
}
