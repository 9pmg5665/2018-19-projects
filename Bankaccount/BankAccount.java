public class BankAccount implements Checkable
{
               
                private String accountNumber;
                private String accountName;
                private double balance;
               
        @Override
                public boolean check()
                {
                return accountNumber.length() == 7;
                }
               
                public BankAccount(String numberIn, String nameIn)
                {
                                accountNumber = numberIn;
                                accountName = nameIn;
                                balance = 0;
                }
               
               
 
                public String getAccountName()
                {
                                return accountName;
                }
               
                public String getAccountNumber()
                {             
                                String invalid = null;
                                if (accountNumber.length() == 7)
                                {
                                                return accountNumber;
                                }
                                return invalid;
                }
                public double getBalance()
                {
                return balance;
                }
               
               
                public void deposit(double amountIn)
                {
                                balance = balance + amountIn;
                }
                public boolean withdraw(double amountIn)
                {
                                                if(amountIn > balance)
                                                {
                                                                return false;
                                                }
                                                else
                                                {
                                                                balance = balance - amountIn;
                                                                return true;
                                                }
                }
                public String toString()
                {
                return "Account Number: "
                + accountNumber
                + "\nAccount Name: "
                + accountName
                + "\nCurrent Balance: "
                + balance
                + "\n";
                }
 
}