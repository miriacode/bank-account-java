import java.util.Random;

class BankAccount {

    private double checkingAccountBalance;
    private double savingsAccountBalance;
    private String accountNumber;

    private static int numberOfBankAccounts = 0;
    private static double totalAmountMoney = 0;


    public BankAccount(){
        this.checkingAccountBalance = 0;
        this.savingsAccountBalance = 0;
        this.accountNumber = generateRandomAccountNumber();
        
        //System.out.println(this.accountNumber);
        numberOfBankAccounts++;
    }

    public double getCheckingAccountBalance(){
        return checkingAccountBalance;
    }

    public double getSavingAccountBalance(){
        return savingsAccountBalance;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public void addToAccount(String typeOfAccount, double amountToAdd){
        if(typeOfAccount=="Checking Account"){
            checkingAccountBalance += amountToAdd;
        }else{
            savingsAccountBalance += amountToAdd;
        }
        totalAmountMoney += amountToAdd;
    }

    public void retireFromAccount(String typeOfAccount, double amountToRetire){
        if(typeOfAccount=="Checking Account"){
            if(amountToRetire > checkingAccountBalance){
                System.out.println("The amount that you're trying to retire is more than what you actually have.\n Please choose an ammount less than "+ checkingAccountBalance);
            }else{
                checkingAccountBalance -= amountToRetire;
            }
            
        }else{
            if(amountToRetire > savingsAccountBalance){
                System.out.println("The amount that you're trying to retire is more than what you actually have.\n Please choose an ammount less than "+ savingsAccountBalance);
            }else{
                savingsAccountBalance -= amountToRetire;
            }
            
        }
        totalAmountMoney -= amountToRetire;
    }

    public void showBalance(){
        System.out.println("Checking Account Balance: "+ checkingAccountBalance);
        System.out.println("Savings Account Balance: "+ savingsAccountBalance);
    }
    

    public static int getNumberOfAccounts() {
        return numberOfBankAccounts;
    }

    public static double getTotalAmountOfMoney() {
        return totalAmountMoney;
    }

    public static String generateRandomAccountNumber() {
        Random random = new Random();

        String card =  "";
        for (int i = 0; i < 10; i++){
            int n = random.nextInt(10) + 0;
            card += Integer.toString(n);
            if(card.length()==3||card.length()==7){
                card += " " ;
            }
        }
        return card;
    }
    
}