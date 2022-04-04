package Bankaccountapp;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {
    public static void main(String[] args) {
        List<Account> account = new LinkedList<Account>();
        // Read a CSV File then create new accounts based on that data
        String file = "/Users/jamaalmuhammad/Downloads/NewBankAccounts1.csv";

        List<String[]> newAccountHolder = Utilities.CSV.read(file);

        for(String[] accountHolder : newAccountHolder) {
            String name = accountHolder[0];
            String nHSN = accountHolder[1];
            String accountType = accountHolder[2];
            double initDeposit = Double.parseDouble(accountHolder[3]);
            if(accountType.equals("Savings")){
                account.add(new Savings(name,nHSN, initDeposit));
            } else if (accountType.equals("Checking")){
                account.add(new Checking(name,nHSN, initDeposit));
            } else{
                System.out.println("ERROR READING ACCOUNT TYPE");
            }

        }
        for (Account acc : account){
            System.out.println("\n********************");
            acc.showInfo();
        }

        }

    }

