public class BankAccount{
    // class attributes
    private double checkingBalance; //making it private due to only wanting to show info in this doc and not make it public
    private double savingBalance;
    
    // Static class
    private static int numOfAccounts = 0;
    public static int totalNumAccountt(){
        return numOfAccounts;
    }
    // Static class - make a public method to acces it on the front side
    private static double totalAmount = 0;
    public static double totalValue(){
        return totalAmount;
    }

    // Constructor
    public BankAccount (){
        // Increment the account count 
        numOfAccounts++;
        this.checkingBalance = checkingBalance;
        this.savingBalance = savingBalance; 
        totalAmount += savingBalance;
        totalAmount += checkingBalance;
    }

// -------GET CHECKING BALANCE---------
    public double getCheckingBalance(){ 
        return checkingBalance;

    }
// -------GET SAVING BALANCE---------
    public double getSavingBalance(){ 
        return savingBalance;
    }

    //-------- Getter For one account GETTING BOTH CHECKING AND SAVING -----
    public double getAll(){
        double results = this.savingBalance + this.checkingBalance;
        return results;
    }
    // ------SET Deposit----
    public double setDepositChecking(double money){
        this.checkingBalance =  money;
        return this.checkingBalance;
    }
// --------SET SAVINGS--------
    public double setSavings(double money){
        this.savingBalance =  money;
        return this.savingBalance;
    }
// -------WITHDRAW FROM CHECKINGS--------
    public double withdrawCheckings(double money){
        if (checkingBalance >= money){
            // prevents account from withdrawing more than what is in the account 
        checkingBalance  = checkingBalance - money;
                        totalAmount -= money;
        }
        return checkingBalance;
    }
// ----------WITHDRAW FROM SAVINGS--------
    public double withdrawSavings(double money){
        if( savingBalance >= money){
                // prevents account from withdrawing more than what is in the account 
        savingBalance  = savingBalance - money;
                totalAmount -= money;
        }
        return savingBalance;
    }

// Method to deposite checking or savings
// ------DEPOSITE INTO SAVINGS-----------
    public double depositCheckings(double money){
        checkingBalance  = checkingBalance + money;
        totalAmount += money;
        return checkingBalance;
    }
// ------DEPOSITE INTO SAVINGS-----------
    public double depositSavings(double money){
        savingBalance  = savingBalance + money;
                totalAmount += money;

                return savingBalance;

    }

}