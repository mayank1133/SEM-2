import java.util.Scanner;
public class Reverse {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[3];
        for(int i=0;i<3;i++)
        {
            System.out.println("Enter the number:");
            arr[i]=sc.nextInt();
        }
        for(int i=arr.length-1;i>=0;i--)
        {
            System.out.println(arr[i]+" ");
        }
        
    }
}