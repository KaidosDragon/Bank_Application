# Bank_Application
The goal of this Application is to recieve a new customers bank account request

This application:
* Reads a .csv file containing names, National Health Service Number, account type and initial deposit.
* Use a proper data structure to hold all these accounts
* Both savings and checking accounts share the following properties:
* deposit() withdraw() transfer() showinfo() 11-Digit Account Number

* Saving Account holders are given a Safety Deposit Box, identified by a 3-digit number and accessed with a 4-digit code
* Checking Account holders are assigned a Debit Card with a 12 digit number and a 4-digit pin
* Both accounts will use an interface that determines the base rate. Savings accounts will use .25 points less than the base rate,
 Checking accounts will use 15% of the base rate
 * The Showinfo method should reveal relevant account information as well as information to the Checking account or Savings account.
