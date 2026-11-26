public class Account {

    private String owner;
    private int balance;
    private String accountNumber;

    // Constructor
    public Account(String owner, int balance, String accountNumber) {
        this.owner = owner;
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    // Getter and Setter for owner
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    // Getter and Setter for balance
    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    // Getter and Setter for accountNumber
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    // Transfer method
    public void transfer(int amount) throws NotEnoughMoneyException {

        if (amount > balance) {
            throw new NotEnoughMoneyException("Not enough money in the account!");
        }

        balance -= amount;

        System.out.println("Transfer successful!");
        System.out.println("Transferred amount: " + amount);
    }
}