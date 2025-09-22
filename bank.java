/*
 * Create a class BankAccount with members AcctNo, balance, and AcctType.
 *  Implement the following operations:
Deposit an amount of 10,000.
Withdraw an amount of 5,000.
Display account details.
 */

public class bank {
    int accNo;
    float balance;
    String accType;

    public bank(int accNo,float balance,String accType){
        this.accNo=accNo;
        this.balance=balance;
        this.accType=accType;
    }

    public void deposite(){
            balance=balance+10000;
    }
    public void withdraw(){
             balance=balance-5000;
    }
    public  void display(){
          System.out.println(accNo);
          System.out.println(balance);
          System.out.println(accType);
    }
    public static void main(String[]args){
         bank kamal=new bank(74899,1000,"child");
         kamal.deposite();
         kamal.withdraw();
         kamal.display();
         
    }

}
