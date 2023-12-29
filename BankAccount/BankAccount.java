import java.util.Scanner;

class Bank1 {
    
    private double balance;


    public Bank1(double balance) {
        this.balance = balance;
    }


    public double getBalance() {
        return this.balance;
    }

    public void deposit(double deposit) {
        balance += deposit;
    }

    public void withdraw(double withdraw) {
        balance -= withdraw;
    }

}

public class BankAccount {

    public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    Bank1 bank = new Bank1(0);

        while (true) {
            
        System.out.println("\n\n*****ATM menu*****");
        System.out.println("1. Check Balance");
        System.out.println("2. Deposit");
        System.out.println("3. Withdraw");
        System.out.println("4. Exit");
        System.out.print("Select an option: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1: System.out.println("Current balance is: " + bank.getBalance());
                    break;

            case 2: System.out.print("Enter the amount to deposit: ");
                    double deposit = scanner.nextDouble();
                    bank.deposit(deposit);
                    System.out.println("₹" + deposit + " successfully deposited. New balance: ₹" + bank.getBalance());
                    break;

            case 3: System.out.println("Enter the amount to withdraw: ");
                    double withdraw = scanner.nextDouble();
                    if(withdraw > bank.getBalance()) {
                        System.out.println("Insufficient funds!");
                    } else {
                        bank.withdraw(withdraw);
                        System.out.println("₹" + withdraw + " successfully transferred. New balance: ₹" + bank.getBalance());
                        break;
                    }

            case 4: System.exit(0);

            default : System.out.println("Enter the correct choice.");
            }
            scanner.close();
        }
    }
}

