public class SavingsAccount extends BankAccount {
  public SavingsAccount(String accountHolder, double initialDeposit) {
    // TODO: Call the parent constructor using 'super'
    super(accountHolder, initialDeposit);
  }

  @Override
  public String withdraw(double amount) {
    // TODO: Implement Savings withdrawal logic and error handling for incorrect input
    try{
      if(amount <= getBalance()){
        setBalance(getBalance() - amount);
        return "Withdraw Done! New Balance: $" + getBalance();
      }else{
        return "Transaction Denied: Insufficient funds. Balance remains: $" + getBalance();
      }
    }catch(NumberFormatException ex){
      return "Please enter a Valid Number";
    }
  }
  
}