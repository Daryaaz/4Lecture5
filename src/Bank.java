public class Bank {

    private int bankBalance = 1000;

    public void deposit(int amount) {
        bankBalance = bankBalance + amount;
        System.out.printf("Your have deposited " + amount + " euros");
    }

    public void withdraw(int amount) {
        bankBalance = bankBalance - amount;
        System.out.println("You have withdraw " + amount + " euros");
    }

    public void checkBalance() {
        System.out.println("You have " + bankBalance + " euros on your bank account");
    }
}
