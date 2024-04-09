import java.util.Scanner;
public class AvgAry {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int arr[]=new int[4];
        int sum=0;
        for(int i=0;i<4;i++)
        {
            System.out.println("Enter the Number:");
            arr[i]=sc.nextInt();
            sum=sum+arr[i];
        }
        System.out.println(sum);
        double avg=sum/4;
        System.out.println("Average:"+avg);
        

    }
}