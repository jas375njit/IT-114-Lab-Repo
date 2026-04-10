public abstract class BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    private String accountHolder;
    private double balance;

    public BankAccount(String accountHolder, double initialDeposit) {
        // TODO: Initialize the instance variables
        this.accountHolder = accountHolder;
        balance = initialDeposit;
    }

    public double getBalance(){
      return balance;
    }
    public String getAccountHolder(){
      return accountHolder;
    }

    public void setAccountHolder(String accountHolder){
      this.accountHolder = accountHolder;
    }

    public void setBalance (double balance){
      this.balance = balance;
    }
    
    public void deposit(double amount) {
      balance += amount;
      System.out.println(balance);
    }

    /**
     * Abstract method: Child classes must implement this.
     */
    public abstract void withdraw(double amount);
}