import java.util.Scanner;
public class Pattern1 {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string:");
        String st=sc.next();
        int len=st.length();
        for(int i=0;i<len;i++)
        {
            for(int j=0;j<=i;j++)
            {
                System.out.print(st.charAt(j)+"");
            }
            
        }
    }
}