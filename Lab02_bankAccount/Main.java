import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // TODO: Create a Scanner to read input
          Scanner s = new Scanner (System.in);
        // TODO: Ask for User Name and Initial Deposit
        System.out.print("Username: ");
        String accountHolder = s.nextLine();

        System.out.print("Initial Deposit: ");
        double initialDeposit = s.nextDouble();

        // TODO: Ask user to select Checking or Savings
        System.out.println("Choose Account:");
        System.out.println("1. Checking");
        System.out.println("2. Savings ");
        int accountSelected = s.nextInt();

        // TODO: Instantiate ;the correct account type based on input
        BankAccount account;
        if (accountSelected == 1){
        account = new CheckingAccount(accountHolder,initialDeposit);
        } else if (accountSelected == 2){
        account = new SavingsAccount (accountHolder,initialDeposit);
        } else {
        System.out.println("Invalid Account");
        s.close();
        return;
        }
        
        // TODO: Create a loop (while) that displays a menu:
        // 1. Deposit
        // 2. Withdraw
        // 3. Check Balance
        // 4. Exit
        while(true){
        System.out.println("--- MENU ---");
        System.out.println("1. Deposit");
        System.out.println("2. Withdraw");
        System.out.println("3. View Balance");
        System.out.println("4. Exit");

        int action = s.nextInt();
        if (action == 1){
            System.out.print("Amount to deposit: ");
            double amountDeposited = s.nextDouble();
            account.deposit(amountDeposited);
        } else if (action == 2){
            System.out.print("Amount to withdraw: ");
            double amountWithdrawn = s.nextDouble();
            account.withdraw(amountWithdrawn);
        } else if (action == 3){
            System.out.println("Balance: " + account.getBalance());
        } else if (action == 4){
            System.out.println("Goodbye");
            break;
        } else {
         System.out.println("Invalid action");
        }
    }
    s.close();
  }
}