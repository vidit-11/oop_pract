package bank;

public class Account{
    public String holder_name;
    public int account_number;
    public double balance;
    public void deposit(double amount){
        balance+=amount;
    }
    public void withdraw(double amount){
        if(amount<=balance){
            balance-=amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }
}
