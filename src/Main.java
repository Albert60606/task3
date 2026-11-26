public class Main {

    public static void main(String[] args) {

        // Create an account
        Account account = new Account("Albert", 1000, "ACC12345");

        try {
            // Attempt to transfer money
            account.transfer(1500);
        }
        catch (NotEnoughMoneyException e) {
            System.out.println("Custom exception: " + e.getMessage());
        }
        catch (Exception e) {
            System.out.println("Other exception: " + e.getMessage());
        }
        finally {
            System.out.println("Current account balance: " + account.getBalance());
        }
    }
}