package checkingaccountproject;

/******************************************************************************
 * CheckingAccount.java 
 * Programmer: @author jcboyd
 * 
 * Class associated with CheckingAccountProject.java
 *****************************************************************************/

public class CheckingAccount 
{
    private double balance;
    private double fee;
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    } //end setBalance
            
    public void setFee(double fee)
    {
        this.fee = fee;        
    } //end setFee
    
    public double getBalance()
    {
        return this.balance;
    } //end getBalance
     
    public void deposit(double amount)
    {
        this.balance += amount;
        this.balance -= this.fee;
    } //end deposit
   
    public void withdrawal(double amount)
    {
        this.balance -= amount;
        this.balance -= this.fee;
    } //end withdrawal

    public void printBalance()
    {
        System.out.printf("New balance: $%,-7.2f\n", this.balance);
    } //end printBalance

} //end class Checking Account
