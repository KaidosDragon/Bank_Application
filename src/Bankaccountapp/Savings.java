package Bankaccountapp;

public class Savings extends Account{
    // List properties specific to the savings account
    private int safetyDepositBoxID;
    private int safetyDepositBoxKey;
    // Constructor to initialize setting for the saving properties
    public Savings(String name, String nHSN, double initDeposit){
        super(name,nHSN,initDeposit);
        accountNumber = "1" + accountNumber;
        setSafetyDepositBox();


    }
    @Override
    public void setRate() {
        rate = getBaseRate() - .25;
    }
    private void setSafetyDepositBox(){
        safetyDepositBoxID = (int) (Math.random() * Math.pow(10, 3));
        safetyDepositBoxKey = (int) (Math.random() * Math.pow(10, 4));
    }


    // List any methods specific to the savings account
    public void showInfo() {
        System.out.println("Account Type: Savings Account");
        super.showInfo();
        System.out.println(
                "Your savings account features: " +
                        "\nSafety Deposit Box ID: " + safetyDepositBoxID +
                        "\nSafety Deposit Box Key: " + safetyDepositBoxKey
        );

    }


}
