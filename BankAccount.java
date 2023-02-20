public class BankAccount {
    private double balance;
    private double interest;
    private double deposit; 
    private double withdraw; 


    public BankAccount(double initBalance, double initInterest){
        balance = initBalance;
        interest = initInterest;
    }

    public void Deposit(double deposit){
        balance += deposit;
        System.out.println("New balance: "+balance);
    }

    public void Withdraw(double withdraw){
        if (withdraw < balance){
            balance -= withdraw;
            System.out.println("You have withdrawn: " + withdraw);
        }
        else{
            System.out.println("Insufficient balance." );
        }
    }

    public void addInterest(){
        balance += (interest/100)*balance;
        System.out.println("Your new amount is: " + balance);
    }

    public String toString(){
        return "Balance: " + balance + "Interest: " + interest;  
    }


    public static void main(String[] args){
        BankAccount stanbic = new BankAccount(2000, 10);
        stanbic.Deposit(200.0);
        stanbic.Withdraw(100);
        stanbic.toString();
    }
}
