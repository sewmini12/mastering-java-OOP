public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber,String ownerName,double balance){
        this.accountNumber=accountNumber;
        this.ownerName=ownerName;
        setBalance(balance);
    }
    public String getAccountNumber(){
       return accountNumber;
    }
    public String getOwnerName(){
        return ownerName;
    }
    public double getBalance(){
        return balance;
    }

    public void setBalance(double amount){
        if(amount>0)
            this.balance=amount;
        else
            System.out.println("balance can't be negative");
    }
    public void setOwnerName(String name){
        if(ownerName==null)
            System.out.println("can't be null");
        else if(ownerName.length()<3)
            System.out.println("should have at least 3 characters");
        else
            this.ownerName= ownerName;
    }
    public void deposit(double amount){
         if(amount>0)
            balance=balance+amount;
        else
            System.out.println("invalid deposite amount");
    }
    public void withdraw(double amount){
        if(amount>0){
             if(amount>balance)
                System.out.println("insufficient balance");
             else
                balance=balance-amount;
        }
        else{
            System.out.println("invalid withdrawal amount");
        }
    }
    public void displayAccount(){
        System.out.println(accountNumber);
        System.out.println(ownerName);
        System.out.println(balance);
    }
    public static void main(String[] args) {
        BankAccount b1=new BankAccount("3004","sandaru",100);
        BankAccount b2=new BankAccount("3005","akash",500);
        
        b1.setOwnerName("Sewmini");     
        b1.setOwnerName("Li");          

        b1.setBalance(200);             
        b1.setBalance(-10);             

        b2.deposit(100);
        b2.deposit(-50);

        b2.withdraw(50);
        b2.withdraw(1000);
        b2.withdraw(-20);

        b1.displayAccount();
        b2.displayAccount();
        
    }  
}
