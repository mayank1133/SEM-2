import  java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        System.out.println("Enter no");
        Scanner sc = new Scanner(System.in);
        int p = sc.nextInt();
        int count=0;
        for (int i=1;i<=p;i++) {
            if(p%i==0){
            count ++;
            }
        }
        if (count == 2){
            System.out.println("No is Prime");
        }
        else{
            System.out.println("Not Prime");
        }

    }
}
