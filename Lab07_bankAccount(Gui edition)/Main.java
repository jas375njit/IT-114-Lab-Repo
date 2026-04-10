import java.awt.GridLayout;
import javax.swing.*;

public class Main extends JFrame{
  public static void main(String[] args) {
    BankAccount account = null;
    String accountHolder = null;
    boolean setUp = true;
    // TODO: Create a GUI using javax.Swing and JFrames, Panels, etc

    JFrame window = new JFrame("Bank App");
    window.setSize(900,600);
    window.setLocationRelativeTo(null);
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    window.setVisible(true);

    while(setUp){
      try{

        accountHolder = JOptionPane.showInputDialog("Please enter your name: ");
        String deposit = JOptionPane.showInputDialog("Please enter your initial deposit: ");
        double initialDeposit = Double.parseDouble(deposit);
        String accountChoice = JOptionPane.showInputDialog("1) Checking ----------------- 2) Savings");
        int accountType = Integer.parseInt(accountChoice);

        while(setUp){

          if (accountType == 1 ){
            account = new CheckingAccount(accountHolder, initialDeposit);
            setUp = false;
          }else if (accountType == 2){
            account = new SavingsAccount(accountHolder, initialDeposit);
            setUp = false;
          } else {
            JOptionPane.showMessageDialog(window,"Invalid Account");
            accountChoice = JOptionPane.showInputDialog("type 1 for Checking, 2 for Savings ");
            accountType = Integer.parseInt(accountChoice);
          }

        }

        setUp = false;
      } catch (Exception e){
          JOptionPane.showMessageDialog(window, "Please enter a valid number");
      }
    }
    
    BankAccount finalAccount = account;
    JLabel welcome = new JLabel("Welcome, " + accountHolder + "!");
    JPanel panel = new JPanel();
    JLabel balanceLabel = new JLabel("Current Balance: $" + account.getBalance());
    JTextField amountField = new JTextField(10);
    JButton depositButton = new JButton ("Deposit");
    depositButton.addActionListener(e ->{
      double amount = Double.parseDouble(amountField.getText());
      String message = finalAccount.deposit(amount);
      JOptionPane.showMessageDialog(window, message);
      balanceLabel.setText("Balance: $" + finalAccount.getBalance());
    });

    JButton withdrawButton = new JButton ("Withdraw");
    withdrawButton.addActionListener(e ->{
      double amount = Double.parseDouble(amountField.getText());
      String message = finalAccount.withdraw(amount);
      JOptionPane.showMessageDialog(window, message);
      balanceLabel.setText("Balance: $" + finalAccount.getBalance());
    });

    JButton exitButton = new JButton ("Exit");
    exitButton.addActionListener(e -> {
    System.exit(0); });

    panel.setLayout(new GridLayout(6,2));
    panel.add(welcome);
    panel.add(balanceLabel);
    panel.add(amountField);
    panel.add(depositButton);
    panel.add(withdrawButton);
    panel.add(exitButton);
    window.add(panel);
    window.setVisible(true);

  }
}