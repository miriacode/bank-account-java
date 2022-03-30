public class Test {
    public static void main(String[] args) {
        BankAccount account1 = new BankAccount();
        System.out.println(account1.getAccountNumber());
        System.out.println(account1.getCheckingAccountBalance());
        System.out.println(account1.getSavingAccountBalance());
        account1.showBalance();

        account1.addToAccount("Checking Account", 200.20);
        account1.addToAccount("Savings Account", 100.50);
        account1.showBalance();

        account1.retireFromAccount("Checking Account", 250.50);
        account1.retireFromAccount("Savings Account", 30.30);
        account1.showBalance();
    }
}