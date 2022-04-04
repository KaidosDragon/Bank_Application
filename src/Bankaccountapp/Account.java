package Bankaccountapp;
// Parent Class
public abstract class Account implements IBaseRate {
    // List common properties for savings and checking accounts
    private String name;
    // Nhs number
    private String nHSN;
    private double balance;
    private static int index = 10000;
    protected String accountNumber;
    protected double rate;
    // Constructor to set base properties and Initialize the account
    public Account(String name,String nHSN, double initDeposit){
       this.name = name;
       this.nHSN = nHSN;
       balance = initDeposit;


        // Set account number
        index++;
        this.accountNumber = setAccountNumber();
        setRate();

    }

    public abstract void setRate();


    private String setAccountNumber(){
        String lastTwoOfNHSN = nHSN.substring(nHSN.length()-2,nHSN.length());
        int uniqueID = index;
        int randomNumber = (int) (Math.random() * Math.pow(10, 3));
        return lastTwoOfNHSN + uniqueID + randomNumber;
    }

    public void compound(){
        double accruedInterest = balance * (rate / 100);
        balance += accruedInterest;
        System.out.println("Accrued Interest: £" + accruedInterest);
        printBalance();
    }
    // List common methods - transactions
    public void deposit(double amount){
        balance += amount;
        System.out.println("Depositing £" + amount);
        printBalance();
    }

    public void withdraw(double amount){
        balance -= amount;
        System.out.println("Withdrawing £" + amount);
        printBalance();
    }
    public void transfer(String toWhere, double amount){
        balance -= amount;
        System.out.println("Transferring £" + amount + " to " + toWhere);
        printBalance();
    }
    public void printBalance() {
        System.out.println("Your balance is now: £" + balance);
    }

    public void showInfo(){
        System.out.println(
                "Name: " + name +
                        "\nAccount Number: " + accountNumber
                        + "\nBalance: " + balance +
                        "\nRate: " + rate + "%"

        );
    }
}
