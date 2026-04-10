public class CheckingAccount extends BankAccount {
  private final double OVERDRAFT_FEE = 35.00;

  public CheckingAccount(String accountHolder, double initialDeposit) {
  // TODO: Call the parent constructor using 'super'
    super(accountHolder, initialDeposit);
  }

  @Override
  public String withdraw(double amount) {
    // TODO: Implement Checking withdrawal logic and error handling for incorrect input
    try{
      if (amount <= getBalance()){
        setBalance(getBalance() - amount);
        return "Withdraw Done! New Balance: $" + getBalance();
      } else {
        setBalance(getBalance()-amount-OVERDRAFT_FEE);
        return "Overdraft! $35.00 fee applied. New Balance: $" + getBalance();
      }
    } catch (NumberFormatException e){
      return "Please enter a Valid Number";
    }
  }
  
}