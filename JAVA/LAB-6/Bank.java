class BankAcc{
    int accNo;
    String userName;
    String email;
    String accType;
    double accBalance;
    public BankAcc(int accNo,String userName,String email,String accType,double accBalance){
        this.accNo=accNo;
        this.userName=userName;
        this.email=email;
        this.accType=accType;
        this.accBalance=accBalance;
    }
    public void getAccountDetails() {
        System.out.println("Account Number: " + accNo);
        System.out.println("User Name: " + userName);
        System.out.println("Email: " + email);
        System.out.println("Account Type: " + accType);
        System.out.println("Account Balance: " + accBalance);
    }

    public void displayAccountDetails() {
        System.out.println("Account Details:");
        getAccountDetails();
    }
}
public class Bank {
    public static void main(String[] args) {
        BankAcc account = new BankAcc(123456, " Mayank Sakariya", "mayankPatel@5678.com", "Savings", 1000.0);
        BankAcc account2=new BankAcc(7891011,"Arpit Patel","xyz.@gmail.com","savings.",9832217654);
        account.displayAccountDetails();
        account2.displayAccountDetails();

    }
}