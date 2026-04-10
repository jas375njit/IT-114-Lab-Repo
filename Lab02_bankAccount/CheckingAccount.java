public class CheckingAccount extends BankAccount {
    // DO NOT CHANGE ANY VARIABLE, METHOD, OR CLASS NAMES. THE AUTOGRADER DEPENDS ON THEM.
    private final double OVERDRAFT_FEE = 35.00;

    public CheckingAccount(String accountHolder, double initialDeposit) {
        // TODO: Call the parent constructor using 'super'
        super(accountHolder, initialDeposit);
    }

    @Override
    public void withdraw(double amount) {
        double newBalance = getBalance() - amount;
        if (amount > getBalance()){
            newBalance = getBalance() - OVERDRAFT_FEE - amount;
            System.out.println("Overdraft! $35.00 fee");
        } else {
            newBalance -= amount;
        }
        setBalance(newBalance);
        System.out.println("New Balance: " + getBalance());
    }
}