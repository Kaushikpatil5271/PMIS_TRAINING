package oops_concept;

class CoffeeWallet {
    String studentName;
    double balance;

   
    CoffeeWallet(String studentName, double initialDeposit) {
        this.studentName = studentName;
        this.balance = initialDeposit;
        System.out.println("Wallet created for " + studentName + " with initial deposit: ₹" + initialDeposit);
    }

    // 1. Add funds to the wallet
    void addFunds(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Added: ₹" + amount + " | New Balance: ₹" + balance);
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }

  
    void makePurchase(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Purchase successful: ₹" + amount + " | Remaining Balance: " + balance);
        } else {
            System.out.println("Insufficient funds! Transaction blocked for purchase of ₹" + amount);
        }
    }

    
    void displayOverview() {
      
        System.out.println("Student Name : " + studentName);
        System.out.println("Current Balance: ₹" + balance);
        
    }
}

public class coffeApp {
    public static void main(String[] args) {
      
        CoffeeWallet wallet = new CoffeeWallet("Kaushik Patil", 500.0);

      
        wallet.addFunds(200.0);

       
        wallet.makePurchase(150.0);

       
        wallet.makePurchase(800.0);

       
        wallet.displayOverview();
    }
}