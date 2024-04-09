import java.util.Scanner;
public class Half {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String:");
        String st=sc.next();
        int l=st.length();
        int mid=l/2;
        String st1=st.substring(mid);
        System.out.println("Second half of String:"+st1);

    }
}