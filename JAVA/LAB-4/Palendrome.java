import java.util.Scanner;
public class Palendrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String st;
        System.out.print("Enter word:");
        st=sc.next();
        String rev="";
        for( int i=st.length()-1;i>=0;i--)
        {
            st.charAt(i);
            rev=rev+st.charAt(i);
        }
        if(st.equals(rev))
        {
            System.out.println("Enter String id Palendrome");
        }
        else{
            System.out.println("String is not Palendrome");
        }
        
    }
}
