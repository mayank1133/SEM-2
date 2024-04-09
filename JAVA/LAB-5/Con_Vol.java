import java.util.Scanner;
public class Con_Vol {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int cons=0;
        int vow=0;
        System.out.println("Enter the string:");
        String input=sc.next();
        for(int i=0;i<input.length();i++)
        {
            char ch=input.charAt(i);
            if(ch=='a'||ch=='A'||ch=='e'||ch=='E'||ch=='i'||ch=='I'||ch=='o'||ch=='O'||ch=='u'||ch=='U')
            {
                vow++;
            }
            else
            {
                cons++;
            }
        }
        System.out.println("Vowel:"+vow);
            System.out.println("Consonants:"+cons);
    }
}