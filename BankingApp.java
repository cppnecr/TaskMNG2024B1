import java.util.*;

public class BankingApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();

        System.out.println("Welcome to the Banking App!");

        boolean loggedIn = false;
        User loggedInUser = null;

        while (!loggedIn) {
            System.out.println("Enter user ID: ");
            int userId = scanner.nextInt();
            System.out.println("Enter PIN: ");
            int pin = scanner.nextInt();
            
            loggedInUser = bank.logIn(userId, pin);
            if (loggedInUser != null) {
                loggedIn = true;
                System.out.println("Login successful!");
            }
            else {
                System.out.println("Invalid user ID or PIN. Please try again.");
            }
        }

        boolean running = true;
        while (running) {
            System.out.println("\n1. Check Balance");
            System.out.println("2. Cash-in");
            System.out.println("3. Money Transfer");
            System.out.println("4. Exit");
            System.out.println("Select an option: ");
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Current balance: " + loggedInUser.getBalance());
                    break;
                case 2:
                    System.out.println("Enter amount to cash-in: ");
                    double amountToAdd = scanner.nextDouble();
                    loggedInUser.cashIn(amountToAdd);
                    System.out.println("New balance: " + loggedInUser.getBalance());
                    break;
                case 3:
                    System.out.println("Enter recipient's user ID: ");
                    int recipientId = scanner.nextInt();
                    System.out.println("Enter amount to transfer: ");
                    double amountToTransfer = scanner.nextDouble();
                    boolean success = loggedInUser.transferMoney(bank, recipientId, amountToTransfer);
                    if (success) {
                        System.out.println("Transfer successful!");
                    } else {
                        System.out.println("Transfer failed. Check recipient ID or balance.");
                    }
                    break;
                case 4:
                    running = false;
                    System.out.println("Exiting...");
                    break;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}

class Bank{
    private Map<Integer, User> users = new HashMap<>();

    public Bank(){
        users.put(282420, new User(282420, 8080, "Matthew Johns", 40000));
        users.put(362985, new User(362985, 5555, "Mark Davidson", 230000));
    }

    public User logIn (int userId, int pin){
        User user = users.get(userId);
        if(user != null && user.getPin() == pin){
            return user;
        }
    return null;
    }

    public User getUser(int userId) {
        return users.get(userId);
    }
}


class User {
    private int id;
    private int pin;
    private String name;
    private double balance;

    public User (int id, int pin, String name, double balance){
        this.id = id;
        this.pin = pin;
        this.name = name;
        this.balance = balance;
    }

    public int getPin(){
        return pin;
    }
    public double getBalance(){
        return balance;
    }
    public void cashIn(double amount){
        if (amount > 0){
            balance += amount;
        } 
        else {
            System.out.println("Invalid amount.");
        }
    }


    public boolean transferMoney (Bank bank, int recipientId, double amount){
        if (amount <= 0){
            System.out.println("Invalid transfer amount.");
            return false;
        }
    
        if (balance < amount) {
            System.out.println("Insufficient balance.");
            return false; 
        }

    User recipient = bank.getUser(recipientId);
    if (recipient == null){
        System.out.println("Recipient does not exist.");
        return false;
    }

    balance -= amount;
    recipient.cashIn(amount);
    return true;
    }
}