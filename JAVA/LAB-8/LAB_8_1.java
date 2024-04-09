public class LAB_8_1 {
    public static void main(String[] args) {
        try{
            int a= Integer.parseInt(args[0]);
            int b=Integer.parseInt(args[1]);
             int ans=1;
            for(int i=0;i<b;i++){
                ans*=a;
            } 
            System.out.println(ans);
        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Enter both VALUES");
        }
        catch(NumberFormatException e){
            System.out.println("Enter both values in INTEGERS");
        }
        catch(Exception e){
            e.printStackTrace();
        }
        finally{
            System.out.println("PROGRAM IS COMPLETED");
        }
    }    
}
