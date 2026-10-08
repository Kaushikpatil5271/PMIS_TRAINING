package oops_concept;
import java.util.Scanner;

class Account{

    float totalAmount;
    Account(String accountHolder){
        System.out.println("UserNmae :"+" "+accountHolder );

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the amount ");
        totalAmount = sc.nextInt();
        System.out.println("Enter the total balance is : "+" "+ totalAmount);
    }

    void deposit(float amount){
        totalAmount +=amount;
        System.out.println("The total amount after deposit is :"+ " "+ totalAmount);
    }
    void balance (){
        System.out.println("The total balance is :"+ " "+ totalAmount );
    }
    void withdrawl(int withdrwalAmount){
        if(totalAmount < withdrwalAmount){
            System.out.println("Invalid withdrawl balance is "+ " "+ totalAmount);
        }else{
            float bal = totalAmount - withdrwalAmount;
            System.out.println("The total amount withdrawl is "+" "+ withdrwalAmount);
            System.out.println("The total balance remaining is "+" "+bal);

        }

    }
}

public class BankApp {
    public static void main(String[] args) {
       Account a1 = new Account("User1");
       a1.balance();
       a1.withdrawl(1500);

        Account a2 = new Account("User2");
        a2.balance();
        a2.withdrawl(2000);

        Account a3 = new Account("User3");
        a3.balance();
        a3.deposit(5000);
        a3.withdrawl(2000);
    }

}