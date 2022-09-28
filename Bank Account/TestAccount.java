public class TestAccount {
    public static void main(String[] args){

        BankAccount account1 = new BankAccount();
        BankAccount account2 = new BankAccount();
        BankAccount account3 = new BankAccount();

        System.out.println(account1.totalNumAccountt());
 // MEthod to deposit into account
            account1.depositCheckings(50);
            account1.depositSavings(22);
// -----------ACCOUNT 2 DEPOSIT CHECKINGS & SAVINGS----------
            account2.depositCheckings(338);
            account2.depositSavings(54983);
        System.out.println(account1.getCheckingBalance());
        System.out.println(account1.getSavingBalance());
 // -----------ACCOUNT 2 DEPOSIT CHECKINGS & SAVINGS----------
            account3.depositCheckings(50000);
            account3.depositSavings(3789);
        System.out.println(account3.getCheckingBalance());
        System.out.println(account3.getSavingBalance());

    // METHOD TO WITHDRAW
// -------WITHDRAW ACCOUNT 1 --------
        account1.withdrawCheckings(300);
        account1.withdrawSavings(5.50);
        System.out.println("Balance after withdraw: " + account1.getCheckingBalance());
        System.out.println("Balance after withdraw from savings: " + account1.getSavingBalance());
// -------WITHDRAW ACCOUNT 2 --------
        account2.withdrawCheckings(300);
        account2.withdrawSavings(5.50);
        System.out.println("Balance after withdraw: " + account2.getCheckingBalance());
        System.out.println("Balance after withdraw from savings: " + account2.getSavingBalance());
// -------WITHDRAW ACCOUNT 3 --------

        account3.withdrawCheckings(300);
        account3.withdrawSavings(5.50);
        System.out.println("Balance after withdraw: " + account3.getCheckingBalance());
        System.out.println("Balance after withdraw from savings: " + account3.getSavingBalance());
    // Method to see all from Checking & Savings from all Bank accounts
    System.out.println( BankAccount.totalValue());
// Gett all info from each account the sum totals
    System.out.println( account1.getAll());
    System.out.println( account2.getAll());
    System.out.println( account3.getAll());
    }
}